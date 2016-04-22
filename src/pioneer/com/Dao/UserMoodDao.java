package pioneer.com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import pioneer.com.Dao.impl.IUserMoodDao;
import pioneer.com.Entity.PClickmoods;
import pioneer.com.Entity.PFriendRelation;
import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
/*
 *测试:Dao层实现层
 */
@Repository("userMoodDao")
public class UserMoodDao extends BaseDao<PMoods> implements IUserMoodDao{
	@Override
	public List<PMoods> selectUsersMoodByuid(int uid) {
		List<PMoods> moods = getHibernateTemplate()
				.find("from PMoods where uid="+uid);
		return moods;
	}
	@Override
	public boolean updateMoodBrowsedTimes(PMoods umood) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().update(umood);
			return true;
			
		}catch(Exception e){
			return false;
		}
	}
	@Override
	public List<Integer> getFriendIdlistByuid(int uid){
		Session session=this.getHibernateTemplate().getSessionFactory().openSession();
		Query q=session.createQuery("select FUid from PFriendRelation where UUid=? and isFriends=1 and isShield=0");
		q.setInteger(0,uid);
		List<Integer> idlist=q.list();
		session.close();
		return idlist;
	}
	@Override
	public List<PMoods> getUsersMoodByuidpage(int uid, int pageindex, int pagesize) {
		List<Integer> idlist=this.getFriendIdlistByuid(uid);
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query q = session.createQuery("from PMoods where FUid in (:idlist) and isPublic=1");
		q.setParameterList("idlist", idlist);
		q.setFirstResult(pageindex*pagesize);//设置起始行
		q.setMaxResults(pagesize);//每页条数
		List<PMoods> pagelist = q.list(); //得到每页的数据
		session.close();//必须关闭
		return pagelist;
	}
	@Override
	public boolean updateMoodPraisedTimes(int mid) {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query q=session.createQuery("update PClickmoods pc set pc.praisedTimes=pc.praisedTimes+1 where pc.MId=?");
		q.setInteger(0, mid);
		int rs=q.executeUpdate();
		session.close();
		return rs>0?true:false;
	}
	@Override
	public String getMoodsCommentUidList(int mid) {
		// TODO Auto-generated method stub
		List<PClickmoods> moods = getHibernateTemplate()
				.find("from PClickmoods where MId = "+mid);
		return moods.get(0).getUIdList();	
	}
	@Override
	public boolean updateMoodUidList(int mid, String uidlist) {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query q=session.createQuery("update PClickmoods pc set pc.UIdList=CONCAT(pc.UIdList,?) where pc.MId=?");
		q.setString(0,uidlist);
		q.setInteger(1, mid);
		int rs=q.executeUpdate();
		session.close();
		return rs>0?true:false;		 
	}
}
