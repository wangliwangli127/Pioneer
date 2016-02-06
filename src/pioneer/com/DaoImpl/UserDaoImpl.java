package pioneer.com.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.UserDao;
import pioneer.com.Entity.Users;
/*
 *测试:Dao层实现层
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public List<Users> selectUsersByid() {
		// TODO Auto-generated method stub
		List<Users> users = getHibernateTemplate()
				.find("from Users");
		return users;
	}
	@Override
	public boolean delUserbyid(Users user) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().delete(user);
			return true;
		}catch(Exception e){
			return false;
		}

	}
	@Override
	public boolean insertUser(Users user) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().save(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	@Override
	public Users getUserById(String username) {
		// TODO Auto-generated method stub
		List<Users> entities=getHibernateTemplate().find("from Users where username='"+username+"'");  
        if(entities.size()>0){  
            Users user=entities.get(0);  
            return user;  
        }  
        return null;
	}

}
