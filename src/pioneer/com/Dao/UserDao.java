package pioneer.com.Dao;

import java.util.List;

import pioneer.com.Entity.Users;
/*
 * 测试:Dao层
 */
public interface UserDao {
	public List<Users> selectUsersByid();
	public boolean delUserbyid(Users user);
	public boolean insertUser(Users user);
	public Users getUserById(String username);
}
