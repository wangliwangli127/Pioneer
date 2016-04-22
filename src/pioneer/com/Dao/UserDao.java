package pioneer.com.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pioneer.com.Dao.impl.IUserDao;
import pioneer.com.Entity.PUsers;
/*
 *测试:Dao层实现层
 */
@Repository("userDao")
public class UserDao extends BaseDao<PUsers> implements IUserDao{

	@Override
	public List<PUsers> selectUsersByid() {
		// TODO Auto-generated method stub
		List<PUsers> users = hibernateTemplate
				.find("from PUsers");
		return users;
	}
	@Override
	public boolean delUserbyid(PUsers user) {
		// TODO Auto-generated method stub
		try{
			hibernateTemplate.delete(user);
			return true;
		}catch(Exception e){
			return false;
		}

	}
	@Override
	public boolean insertUser(PUsers user) {
		// TODO Auto-generated method stub
		try{
			hibernateTemplate.save(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	@Override
	public PUsers getUserById(String username) {
		// TODO Auto-generated method stub
		List<PUsers> entities = hibernateTemplate.find("from PUsers where username='"+username+"'");  
        if(entities.size()>0){  
            PUsers user=entities.get(0);  
            return user;  
        }  
        return null;
	}

}
