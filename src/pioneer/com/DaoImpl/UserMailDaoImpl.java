package pioneer.com.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pioneer.com.Dao.UserMailDao;
import pioneer.com.Entity.PMessage;
/*
 *测试:Dao层实现层
 */
public class UserMailDaoImpl extends HibernateDaoSupport implements UserMailDao{
	@Override
	public List<PMessage>  getEmailByuid(int uid){
		List<PMessage> msgs=getHibernateTemplate().
				find("from PMessage where toUid="+uid);
		return msgs;
	}

	 

}