package pioneer.com.Action;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;
import pioneer.com.Service.UserMailService;
import pioneer.com.Service.UserMoodsService;
import pioneer.com.Service.UserService;

@Controller
public class UserController {	
	@Resource(name="userService")
	private UserService  userservice;
	
	@Resource(name="userMoodService")
	private UserMoodsService userPmService;
	
	@Resource(name="usermailService")
	private UserMailService emailService;
	
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView models = new ModelAndView("userlogin");
		return models;
	}
	@RequestMapping(value="/loginsucc")
	public ModelAndView landing(PUsers user)
	{
		System.out.println("这是login请求:框架");
		ModelAndView models = new ModelAndView("users");
		PUsers u=userservice.getUserByName(user.getUsername());
		if (u !=null){
			//信息
			List<PMessage> msglist=emailService.getEmailList(u.getUId());
			return models.addObject("user",u).addObject("msglist",msglist);
		}else{
			return new ModelAndView("redirect:/index/");
		}
	}
	//朋友圈
	@RequestMapping(value="/ajaxfriends",method=RequestMethod.GET)
	public ModelAndView ajaxloinsucc(String uid)
	{
		System.out.println("这是ajax请求:朋友圈"+uid);
		ModelAndView models = new ModelAndView("userfriends");
		Integer userid=Integer.parseInt(uid);
		//说说
		List<PMoods> moods=userPmService.getMoodlistByUidPage(userid, 0, 5);
 
		return models.addObject("moodlist",moods)
			.addObject("page",1).addObject("uid",uid);
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
		int pageint=Integer.parseInt(page);
		ModelAndView models=new ModelAndView("userfriends");
		List<PMoods> moods=userPmService.getMoodlistByUidPage(Integer.parseInt(uid), pageint, 5);
		return models.addObject("moodlist",moods)
				.addObject("page",pageint+1).addObject("uid",uid);
	}
	//点赞
	@RequestMapping(value="/ajaxpraised",method=RequestMethod.GET)
	@ResponseBody
	public String ajaxpraised(String mid,String uid){
		System.out.println(mid+","+uid);
		boolean rs=userPmService.updatePraiseTime(Integer.parseInt(mid),Integer.parseInt(uid));
		return rs ? "1":"0";
	}
	@RequestMapping(value="/ajaxfresh",method=RequestMethod.GET)
	@ResponseBody
	public String ajaxfresh(String uid){
		List<PMessage> msglist=emailService.getEmailList(Integer.parseInt(uid));
		JSONArray jsonArray2 = JSONArray.fromObject( msglist );	
		return jsonArray2.toString();
	}
}
