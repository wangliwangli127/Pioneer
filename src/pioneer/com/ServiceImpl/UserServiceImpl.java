package pioneer.com.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import pioneer.com.Dao.UserDao;
import pioneer.com.Entity.PUsers;
import pioneer.com.Service.UserService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<PUsers> getUserlList() {
		// TODO Auto-generated method stub
		return userDao.selectUsersByid();
	}
	@Override
	public boolean saveUser(PUsers user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}
	@Override
	public boolean deleteUsers(PUsers user) {
		// TODO Auto-generated method stub
		return userDao.delUserbyid(user);
	}
	@Override
	public PUsers getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserById(username);
	}
}
