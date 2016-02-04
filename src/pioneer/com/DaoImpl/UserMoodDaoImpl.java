package pioneer.com.DaoImpl;

import java.util.List;

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

}
