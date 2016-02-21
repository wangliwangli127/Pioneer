package pioneer.com.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.UserMoodDao;
import pioneer.com.Entity.PClickmoods;
import pioneer.com.Entity.PFriendRelation;
import pioneer.com.Entity.PMoods;
/*
 *测试:Dao层实现层
 */
public class UserMoodDaoImpl extends HibernateDaoSupport implements UserMoodDao{
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
	public List<PMoods> getUsersMoodByuidpage(int uid, int pageindex, int pagesize) {
		Session session = this.getHibernateTemplate().getSessionFactory().openSession();
		Query q = session.createQuery("from PMoods where FUid=?");
		q.setInteger(0, uid);
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
