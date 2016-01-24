package pioneer.com.Action;



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;

public class userAction {
	private int id;
	private String username;
	private String password;
	private String email;
	private String qq;
	
	private UserService userService;

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
