package pioneer.com.Action;


import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pioneer.com.Entity.Users;
import pioneer.com.Service.UserService;
@Controller
public class UserController {
	@Resource(name="userService")
	private UserService  userservice;

	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView models = new ModelAndView("userlogin");
		return models;
	}
	@RequestMapping("/loginsucc")
	public ModelAndView loinsucc(Users user)
	{
		ModelAndView models = new ModelAndView("users");
 		return models.addObject("path", "userfriends.ftl");
		
	}
	 
	@RequestMapping(value="/ajaxmystate",method= RequestMethod.POST)
	@ResponseBody
	public String ajaxmystate(){
		System.out.println(11543545);
 
 		return String.valueOf(true);  
	}

}
