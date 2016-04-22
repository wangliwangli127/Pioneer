package pioneer.com.Dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import pioneer.com.Dao.impl.IUserMailDao;
import pioneer.com.Entity.PMessage;
/*
 *测试:Dao层实现层
 */
@Repository("useremailDao")
public class UserMailDao extends BaseDao<PMessage> implements IUserMailDao{
	@Override
	public List<PMessage>  getEmailByuid(int uid){
		List<PMessage> msgs=getHibernateTemplate().
				find("from PMessage where toUid="+uid);
		return msgs;
	}

	 

}