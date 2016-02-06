package pioneer.com.Service;

import java.util.List;

import pioneer.com.Entity.UserMood;
import pioneer.com.Entity.Users;

/*
 * 业务逻辑层次
 */
public interface UserService {
	public List<Users> getUserlList();
	public  boolean saveUser(Users user);
	public  boolean deleteUsers(Users user);
	public  Users getUserByName(String username);
	public List<UserMood> getMoodlistByUid(int uid);
	public List<UserMood> getMoodlistByUidPage(int uid,int startindex,int pagesize);
}
