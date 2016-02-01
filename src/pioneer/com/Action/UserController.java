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

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request){
		ModelAndView models = new ModelAndView("userlogin");
		return models;
	}
	@RequestMapping("loginsucc")
	public ModelAndView loinsucc()
	{
		ModelAndView models = new ModelAndView("loginsucc");
		return models;
	}
	@RequestMapping("userinfo")
	public ModelAndView setuserinfo(){
		ModelAndView models=new ModelAndView("userinfo");
		System.out.println("this is a setuserinfo");
		return models;

	}
}
