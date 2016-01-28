package pioneer.com.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;
import pioneer.com.utils.Constants;

import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private int id;
	private String username;
	private String password;
	private String email;
	private String qq;
	
	private UserService userService;

	public String login() {
		System.out.println("login");
		return Constants.LOGIN_SUCCESS;
	}
	
	public String registerUsers(){
		// TODO Auto-generated method stub
		System.out.println("username:"+username);
		System.out.println("pwd:"+password);
		System.out.println("email"+email);
		System.out.println("qq:"+qq);
		Users user=new Users(id,username,password,  email, qq);
		userService.saveUser(user);
		return "success";
	}
	public String usersList(){
		System.out.println(111);
		List<Users> users=userService.getUserlList();
//		for(Users u:users){
//			System.out.println(u.getId()+"\t"+u.getUsername()+"\t"+u.getPwd()+"\t"+u.getQq());
//		}
		ActionContext ac=ActionContext.getContext();
		Map rq=(Map)ac.get("request");
		rq.put("users", users);
		System.out.println("this is a test");
		return "success";
	}
	public String delUser(){
		HttpServletRequest rq=ServletActionContext.getRequest();
		int id=Integer.parseInt(rq.getParameter("userid"));
		System.out.println(id);
		Users u=new Users();
		u.setId(id);
		userService.deleteUsers(u);
		return null;
	}	
		
		
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
