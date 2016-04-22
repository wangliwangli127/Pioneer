package pioneer.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pioneer.com.Dao.impl.IUserMoodDao;
import pioneer.com.Entity.PMoods;
import pioneer.com.Service.impl.IUserMoodsService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
@Transactional
@Service("userMoodsService")
public class UserMoodsService implements IUserMoodsService {
	
	@Autowired
	public IUserMoodDao  userMoodDao;
	
	
	@Override
	public List<PMoods> getMoodlistByUidPage(int uid, int startindex, int pagesize) {
		// TODO Auto-generated method stub
		return userMoodDao.getUsersMoodByuidpage(uid, startindex, pagesize);
	}
	@Override
	public boolean updatePraiseTime(int mid,int uid) {
		String uidlist=userMoodDao.getMoodsCommentUidList(mid);
		if(uidlist.indexOf(uid+"")>=0){
			return false;
		}
		userMoodDao.updateMoodUidList(mid, uid+",");
		return userMoodDao.updateMoodPraisedTimes(mid);
	}
	@Override
	public String getPraiseUidList(int mid){
		return userMoodDao.getMoodsCommentUidList(mid);
	}
}
