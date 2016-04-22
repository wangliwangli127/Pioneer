package pioneer.com.Action;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pioneer.com.Entity.PMessage;
import pioneer.com.Entity.PMoods;
import pioneer.com.Entity.PUsers;
import pioneer.com.Service.impl.IUserMailService;
import pioneer.com.Service.impl.IUserMoodsService;
import pioneer.com.Service.impl.IUserService;

@Controller
public class UserController {	
	
	@Autowired
	public IUserService userService;
	
	@Autowired
	public IUserMoodsService userMoodsService;
	
	@Autowired
	public IUserMailService userMailService;
	
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView models = new ModelAndView("userlogin");
		return models;
	}
	@RequestMapping(value="/loginsucc")
	public ModelAndView landing(PUsers user)
	{
		//System.out.println("这是login请求:框架");
		ModelAndView models = new ModelAndView("users");
		PUsers u=userService.getUserByName(user.getUsername());
		if (u !=null){
			//信息
			List<PMessage> msglist=userMailService.getEmailList(u.getUId());
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
		List<PMoods> moods=userMoodsService.getMoodlistByUidPage(userid, 0, 5);
 
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
		List<PMoods> moods=userMoodsService.getMoodlistByUidPage(Integer.parseInt(uid), pageint, 5);
		return models.addObject("moodlist",moods)
				.addObject("page",pageint+1).addObject("uid",uid);
	}
	//点赞
	@RequestMapping(value="/ajaxpraised",method=RequestMethod.GET)
	@ResponseBody
	public String ajaxpraised(String mid,String uid){
		System.out.println(mid+","+uid);
		boolean rs=userMoodsService.updatePraiseTime(Integer.parseInt(mid),Integer.parseInt(uid));
		return rs ? "1":"0";
	}
	//定时刷新
	@RequestMapping(value="/ajaxfresh",method=RequestMethod.GET)
	@ResponseBody
	public String ajaxfresh(String uid){
		List<PMessage> msglist=userMailService.getEmailList(Integer.parseInt(uid));
		JSONArray jsonarray = JSONArray.fromObject( msglist );
		return jsonarray.toString();
	}
	//系统信息
	@RequestMapping(value="/ajaxsetsystem",method=RequestMethod.GET)
	public String ajaxsetsystem(String uid){
		return null;
	}
	//评论
	@RequestMapping(value="/ajaxcomment",method=RequestMethod.GET)
	public boolean ajaxcomment(String uid,String commentid){
		return false;
	}
	//发说说
	@RequestMapping(value="/ajaxpubmoods",method=RequestMethod.GET)
	public String ajaxpublicmoods(PMoods pmood){
		return null;
	}
	//日志
	@RequestMapping(value="/ajaxwdayrecord",method=RequestMethod.GET)
	public String ajaxwdayrecord(){
		return null;
	}
	//照片
	@RequestMapping(value="/ajaxphone",method=RequestMethod.GET)
	public String ajaxphone(){
		return null;
	}
	//设置皮肤
	@RequestMapping(value="/ajaxsetskin")
	public String ajaxsetskin(){
		return null;
	}
	//设置密码
	@RequestMapping(value="/ajaxsetpwd",method=RequestMethod.GET)
	public String ajaxsetpwd(){
		return null;
	}
	//设置menu
	@RequestMapping(value="/ajaxsetmenu",method=RequestMethod.GET)
	public String ajaxsetmenu(){
		return null;
	}
	//设置banner
	@RequestMapping(value="/ajaxsetbanner",method=RequestMethod.GET)
	public String ajaxsetbanner(){
		return null;
	}
	//上传文件
	@RequestMapping(value="/ajaxupload",method=RequestMethod.GET)
	public String ajaxupload(){
		return null;
	}
	//邀请好友
	@RequestMapping(value="/ajaxaddfriend",method=RequestMethod.GET)
	public String ajaxaddfriend(){
		return null;
	}
	//发送邮件
	@RequestMapping(value="/ajaxsendemail",method=RequestMethod.GET)
	public void ajaxsendemail(){

	}
	//关闭空间
	@RequestMapping(value="/ajaxclose",method=RequestMethod.GET)
	public String ajaxclose(String uid){
		return null;
	}
	//退出
	@RequestMapping(value="/ajaxlogout",method=RequestMethod.GET)
	public String ajaxlogout(String uid){
		return null;
	}
}
