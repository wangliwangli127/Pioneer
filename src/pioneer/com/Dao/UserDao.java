package pioneer.com.Dao;

import java.util.List;

import pioneer.com.Entity.PUsers;
/*
 * 测试:Dao层
 */
public interface UserDao {
	public List<PUsers> selectUsersByid();
	public boolean delUserbyid(PUsers user);
	public boolean insertUser(PUsers user);
	public PUsers getUserById(String username);
}
