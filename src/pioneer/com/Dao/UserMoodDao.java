package pioneer.com.Dao;

import java.util.List;

import pioneer.com.Entity.UserMood;
import pioneer.com.Entity.Users;
/*
 * 测试:Dao层
 */
public interface UserMoodDao {
	public List<UserMood>  selectUsersMoodByuid(int uid);
	public boolean updateMoodBrowsedTimes(UserMood umood);
}
