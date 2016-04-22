package pioneer.com.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pioneer.com.Dao.impl.IUserDao;
import pioneer.com.Entity.PUsers;
import pioneer.com.Service.impl.IUserService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	public IUserDao userDao;
	
	@Override
	public List<PUsers> getUserlList() {
		return userDao.selectUsersByid();
	}
	@Override
	public boolean saveUser(PUsers user) {
		return userDao.insertUser(user);
	}
	@Override
	public boolean deleteUsers(PUsers user) {
		return userDao.delUserbyid(user);
	}
	@Override
	public PUsers getUserByName(String username) {
		return userDao.getUserById(username);
	}
}
