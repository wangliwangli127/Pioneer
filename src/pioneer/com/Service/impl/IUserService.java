package pioneer.com.Service.impl;

import java.util.List;

import pioneer.com.Entity.PUsers;

/*
 * 业务逻辑层次
 */
public interface IUserService {
	public List<PUsers> getUserlList();
	public boolean saveUser(PUsers user);
	public boolean deleteUsers(PUsers user);
	public PUsers getUserByName(String username);
}
