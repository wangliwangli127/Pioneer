package pioneer.com.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.UserDao;
import pioneer.com.Dao.UserMoodDao;
import pioneer.com.Entity.UserMood;
import pioneer.com.Entity.Users;
/*
 *测试:Dao层实现层
 */
public class UserMoodDaoImpl extends HibernateDaoSupport implements UserMoodDao{
	@Override
	public List<UserMood> selectUsersMoodByuid(int uid) {
		List<UserMood> moods = getHibernateTemplate()
				.find("from UserMood where uid=1 ");
		return moods;
	}

	@Override
	public boolean updateMoodBrowsedTimes(UserMood umood) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().update(umood);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public List<UserMood> getUsersMoodByuidpage(int uid, int pageindex, int pagesize) {
		// TODO Auto-generated method stub
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query q = session.createQuery("from UserMood where uid=1");
		q.setFirstResult(pageindex*pagesize);//设置起始行
		q.setMaxResults(pagesize);//每页条数
		List<UserMood> pagelist = q.list(); //得到每页的数据
		session.close();//必须关闭
		return pagelist;
	}

}
