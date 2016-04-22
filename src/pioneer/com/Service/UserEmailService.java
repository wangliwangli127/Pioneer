package pioneer.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pioneer.com.Dao.impl.IUserMailDao;
import pioneer.com.Dao.impl.IUserMoodDao;
import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Service.impl.IUserMailService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
@Transactional
@Service("userMailService")
public class UserEmailService implements IUserMailService {
	
	@Autowired
	public IUserMailDao useremailDao;
	
	/*
	 *收到信息
	 */
	@Override
	public List<PMessage> getEmailList(int uid) {
		return useremailDao.getEmailByuid(uid);
	}
}
