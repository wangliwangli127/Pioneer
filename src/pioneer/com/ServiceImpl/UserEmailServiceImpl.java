package pioneer.com.ServiceImpl;

import java.util.List;

import pioneer.com.Dao.UserMailDao;
import pioneer.com.Dao.UserMoodDao;
import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Service.UserMailService;
import pioneer.com.Service.UserMoodsService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
public class UserEmailServiceImpl implements UserMailService {
	private UserMailDao emailDao;
	public UserMailDao getEmailDao() {
		return emailDao;
	}
	public void setEmailDao(UserMailDao emailDao) {
		this.emailDao = emailDao;
	}
	/*
	 *收到信息
	 */
	@Override
	public List<PMessage> getEmailList(int uid) {
		return emailDao.getEmailByuid(uid);
	}
}
