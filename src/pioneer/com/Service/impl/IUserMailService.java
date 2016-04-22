package pioneer.com.Service.impl;

import java.util.List;

import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;

/*
 * 业务逻辑层次
 */
public interface IUserMailService {
	public List<PMessage> getEmailList(int uid);
	 
}
