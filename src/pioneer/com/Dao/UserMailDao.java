package pioneer.com.Dao;

import java.util.List;

import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
/*
 * 测试:Dao层
 */
public interface UserMailDao {
	public List<PMessage>  getEmailByuid(int uid);

}
