package pioneer.com.Dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.SetFactoryBean;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.impl.IBaseDao;

public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {

	private Class<T> clzz;
	
	/**
	 * 属性默认的是protected只能在当前包下被使用
	 * 
	 */
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	  
	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)   
    {   
  
        super.setSessionFactory(sessionFactory);   
    }  
	
	/**spring在创建bean的实例时默认调用的构造方法
	 * 
	 */
	@SuppressWarnings("unchecked")
	public BaseDao(){
		//init clazz
		//得到当前对象的所有实现接口类型
		Type types = this.getClass().getGenericSuperclass();
		//将得到的type类型转化可参数化的类型
		ParameterizedType type = (ParameterizedType)types;
		//得到泛型的类型的名字
		clzz = (Class<T>) type.getActualTypeArguments()[0];
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(int...page) {
		DetachedCriteria criteria = DetachedCriteria.forClass(clzz);
		if(page!=null && page.length == 2){
			return (List<T>) hibernateTemplate.findByCriteria(criteria, (page[0]-1)*page[1], page[1]);
		}else{
			return (List<T>) hibernateTemplate.findByCriteria(criteria);
		}
	}
	
	@Override
	public T save(T t) {
		hibernateTemplate.save(t);
		return t; 
	}
	@Override
	public T delete(T t) {
		hibernateTemplate.delete(t);
		return t;
	}
	
	@Override
	public T update(T t) {
		hibernateTemplate.saveOrUpdate(t);
		return t;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByHql(final String hql, final Map<String, Object> params,final int...page) {
		return hibernateTemplate.execute(new HibernateCallback<List<T>>() {
			@Override
			public List<T> doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(hql);
				if(params!=null){
					query.setProperties(params);
				}
				if(page!=null && page.length==2){
					query.setFirstResult(page[0]);
					query.setMaxResults(page[1]);
				}
				return query.list();
			}
		});
	}
	
	
	@Override
	public List<T> findByProperties(final Map<String, Object> params,final int...page) {
		return hibernateTemplate.execute(new HibernateCallback<List<T>>() {

			@SuppressWarnings("unchecked")
			public List<T> doInHibernate(Session session)
					throws HibernateException {
				Criteria criteria = session.createCriteria(clzz);
				Set<String> keySet = params.keySet();
				for(String key:keySet){
					criteria.add(Restrictions.eq(key, params.get(key)));
				}
				if(page!=null && page.length == 2){
					criteria.setFirstResult((page[0]-1)*page[1]);
					criteria.setMaxResults(page[1]);
				}
				return criteria.list();
			}
			
		});
	}
	
}
