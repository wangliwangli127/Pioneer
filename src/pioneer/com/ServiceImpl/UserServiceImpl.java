package pioneer.com.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import pioneer.com.Dao.UserDao;
import pioneer.com.Dao.UserMoodDao;
import pioneer.com.Entity.UserMood;
import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Resource(name="userMoodDao")
	private UserMoodDao  userMoodDao;
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
	@Override
	public List<UserMood> getMoodlistByUid(int uid) {
		return userMoodDao.selectUsersMoodByuid(uid);
	}
	@Override
	public List<UserMood> getMoodlistByUidPage(int uid, int startindex, int pagesize) {
		// TODO Auto-generated method stub
		return userMoodDao.getUsersMoodByuidpage(uid, startindex, pagesize);
	}
	
}
