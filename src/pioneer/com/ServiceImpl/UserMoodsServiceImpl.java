package pioneer.com.ServiceImpl;

import java.util.List;
import pioneer.com.Dao.UserMoodDao;
import pioneer.com.Entity.PMoods;
import pioneer.com.Service.UserMoodsService;
/*
 * 业务逻辑实现层,复杂的业务逻辑实现的部分
 */
public class UserMoodsServiceImpl implements UserMoodsService {
	private UserMoodDao  userPMoodDao;
	
	public UserMoodDao getUserPMoodDao() {
		return userPMoodDao;
	}
	public void setUserPMoodDao(UserMoodDao userPMoodDao) {
		this.userPMoodDao = userPMoodDao;
	}
	@Override
	public List<PMoods> getMoodlistByUidPage(int uid, int startindex, int pagesize) {
		// TODO Auto-generated method stub
		return userPMoodDao.getUsersMoodByuidpage(uid, startindex, pagesize);
	}
	@Override
	public boolean updatePraiseTime(int mid,int uid) {
		String uidlist=userPMoodDao.getMoodsCommentUidList(mid);
		if(uidlist.indexOf(uid+"")>=0){
			return false;
		}
		userPMoodDao.updateMoodUidList(mid, uid+",");
		return userPMoodDao.updateMoodPraisedTimes(mid);
	}
	@Override
	public String getPraiseUidList(int mid){
		return userPMoodDao.getMoodsCommentUidList(mid);
	}
}
