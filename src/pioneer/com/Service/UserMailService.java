package pioneer.com.Service;

import java.util.List;

import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;

/*
 * 业务逻辑层次
 */
public interface UserMailService {
	public List<PMessage> getEmailList(int uid);
	 
}
