package pioneer.com.ServiceImpl;

import java.util.List;

import pioneer.com.Dao.UserDao;
import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public List<Users> getUserlList() {
		// TODO Auto-generated method stub
		return userDao.selectUsersByid();
	}
	@Override
	public boolean saveUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}
	@Override
	public boolean deleteUsers(Users user) {
		// TODO Auto-generated method stub
		return userDao.delUserbyid(user);
	}
	@Override
	public Users getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserById(username);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
