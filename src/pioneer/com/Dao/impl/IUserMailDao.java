package pioneer.com.Dao.impl;

import java.util.List;

import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;
/*
 * 测试:Dao层
 */
public interface IUserMailDao extends IBaseDao<PMessage> {
	public List<PMessage>  getEmailByuid(int uid);

}
