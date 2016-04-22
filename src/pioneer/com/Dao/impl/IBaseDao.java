package pioneer.com.Dao.impl;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T> {
	/**
	 * 查询单表所有数据，包含分页
	 * @param  page要求page的参数长度必须是2，
	 * 		并且每一个值必须是当前页码，第二个参数必须是每页记录数
	 * @return
	 */
	List<T> findAll(int...page);
	
	/**保存对象 
	 * @param t
	 * @return 返回保存的对象t
	 */
	T save(T t);
	
	/**删除对象
	 * @param t
	 * @return 返回删除的对象t
	 */
	T delete(T t);
	
	/**更新对象
	 * @param t
	 * @return  返回更新的对象t
	 */
	T update(T t);
	
	/**按hql查询，包含分页
	 * @param hql
	 * @param params
	 * @param page
	 * @return List<T>
	 */
	List<T> findByHql(String hql, Map<String, Object> params,int...page);
	
	/**根据属性查询单表所有数据，包含分页
	 * @param params
	 * @param page
	 * @return List<T>
	 */
	List<T> findByProperties(Map<String,Object> params,int...page);
}
