package pioneer.com.Dao;

import java.util.List;

import pioneer.com.Entity.PMoods;
/*
 * 测试:Dao层
 */
public interface UserMoodDao {
	public List<PMoods>  selectUsersMoodByuid(int uid);
	public boolean updateMoodBrowsedTimes(PMoods umood);
	public boolean updateMoodPraisedTimes(int mid);
	public String getMoodsCommentUidList(int mid);
	public boolean updateMoodUidList(int mid,String uidlist);
	public List<PMoods>  getUsersMoodByuidpage(int uid,int pageindex,int pagesize);
	public List<Integer> getFriendIdlistByuid(int uid);
}
