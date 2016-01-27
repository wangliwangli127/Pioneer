package pioneer.com.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;
import pioneer.com.utils.Constants;

import com.opensymphony.xwork2.ActionContext;
@Controller
public class UserController {
	
	@RequestMapping("/admin_index")
	public ModelAndView index(HttpServletRequest request){
		ModelAndView models = new ModelAndView("index");
		return models;
	}
	@RequestMapping("/admin_charts")
	public ModelAndView charts()
	{
		ModelAndView models = new ModelAndView("charts");
		System.out.println("admin_chars");
		return models;

	}
	@RequestMapping("/admin_dataVisualization")
	public ModelAndView dataVisualization(){
		ModelAndView models = new ModelAndView("charts");
		return models;
	}
	@RequestMapping("/admin_maps")
	public ModelAndView maps(){
		ModelAndView models = new ModelAndView("maps");
		return models;

	}
	@RequestMapping("/admin_users")
	public ModelAndView managesUsers(){
		ModelAndView models =new ModelAndView("manageusers");
		return models;
	}
	@RequestMapping("/admin_preferences")
	public ModelAndView preference(){
		ModelAndView models =new ModelAndView("preferences");
		return models;
	}
	@RequestMapping("/admin_login")
	public ModelAndView login(){
		ModelAndView models=new ModelAndView("login");
		return models;
	}
}
