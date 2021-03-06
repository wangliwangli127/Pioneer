package pioneer.com.Service.impl;

import java.util.List;

import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;

/*
 * 业务逻辑层次
 */
public interface IUserMoodsService {
	public List<PMoods> getMoodlistByUidPage(int uid,int startindex,int pagesize);
	public boolean updatePraiseTime(int mid,int uid);
	public String getPraiseUidList(int mid);	
}
