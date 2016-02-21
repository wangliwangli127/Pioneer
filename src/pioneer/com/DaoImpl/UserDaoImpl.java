package pioneer.com.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.UserDao;
import pioneer.com.Entity.PUsers;
/*
 *测试:Dao层实现层
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public List<PUsers> selectUsersByid() {
		// TODO Auto-generated method stub
		List<PUsers> users = getHibernateTemplate()
				.find("from PUsers");
		return users;
	}
	@Override
	public boolean delUserbyid(PUsers user) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().delete(user);
			return true;
		}catch(Exception e){
			return false;
		}

	}
	@Override
	public boolean insertUser(PUsers user) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().save(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	@Override
	public PUsers getUserById(String username) {
		// TODO Auto-generated method stub
		List<PUsers> entities=getHibernateTemplate().find("from PUsers where username='"+username+"'");  
        if(entities.size()>0){  
            PUsers user=entities.get(0);  
            return user;  
        }  
        return null;
	}

}
