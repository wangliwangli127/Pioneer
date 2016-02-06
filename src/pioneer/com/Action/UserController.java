package pioneer.com.Action;

 

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pioneer.com.Entity.UserMood;
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

	@RequestMapping(value="/loginsucc")
	public ModelAndView landing(Users user)
	{
		System.out.println("这是login请求:框架");
		ModelAndView models = new ModelAndView("users");
		Users u=userservice.getUserByName(user.getUsername());
		System.out.println("there is error");
		if (u !=null){
			return models.addObject("user",u);
		}else{
			System.out.println("err");
			return new ModelAndView("redirect:/index/");
		}
	}

	//朋友圈
	@RequestMapping(value="/ajaxfriends",method=RequestMethod.GET)
	public ModelAndView ajaxloinsucc(String uid)
	{
		System.out.println("这是ajax请求:朋友圈"+uid);
		ModelAndView models = new ModelAndView("userfriends");
		//List<UserMood> moods=userservice.getMoodlistByUid(Integer.parseInt(uid));
		List<UserMood> moods=userservice.getMoodlistByUidPage(Integer.parseInt(uid), 0, 5);
		System.out.println("分页错误,uid"+uid);
 		return models.addObject("moodlist",moods).addObject("page",1);
	}
	//个人状态
	@RequestMapping(value="/ajaxpersonalstat",method= RequestMethod.POST)
	public ModelAndView ajaxpersonalstat(){
		System.out.println("这是ajax请求:个人状态");
 		ModelAndView models=new ModelAndView("userpersonal");
		return models;
	}
	//个人中心
	@RequestMapping(value="/ajaxpersonalinfo",method= RequestMethod.POST)
	public ModelAndView ajaxpersonalinfo(){
		System.out.println("这是ajax请求:个人中心");
 		ModelAndView models=new ModelAndView("userpersoninfo");
		return models;
	}
   //与我相关
	@RequestMapping(value="/ajaxmyrelation",method=RequestMethod.POST)
	public ModelAndView ajaxmyrelation(){
		System.out.println("这是ajax请求:个人状态-与我相关");
		ModelAndView models=new ModelAndView("usermyrelation");
		return models;
	}
   //我的发言
	@RequestMapping(value="/ajaxmymoods",method=RequestMethod.POST)
	public ModelAndView ajaxmymoods(){
		System.out.println("这是ajax请求：个人状态-我的发言");
		ModelAndView models=new ModelAndView("mymoods");
		return models;
	}

	//加载默认5条
	@RequestMapping(value="/ajaxloadmore",method=RequestMethod.GET)
	public ModelAndView ajaxloadmore(String uid,String page){
		System.out.println("loadmore"+page);
		int pageint=Integer.parseInt(page);
		ModelAndView models=new ModelAndView("userfriends");
		List<UserMood> moods=userservice.getMoodlistByUidPage(Integer.parseInt(uid), pageint, 5);
		return models.addObject("moodlist",moods).addObject("page",pageint+1);
	}
}
