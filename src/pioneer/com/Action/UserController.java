package pioneer.com.Action;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request){
		ModelAndView models = new ModelAndView("userlogin");
		return models;
	}
	@RequestMapping("/loginsucc")
	public ModelAndView loinsucc()
	{
		ModelAndView models = new ModelAndView("loginsucc");
		return models;
	}
	@RequestMapping("/userinfo")
	public ModelAndView setuserinfo(){
		ModelAndView models=new ModelAndView("userinfo");
		return models;

	}
	@RequestMapping("/userregister")
	public ModelAndView register(){
		ModelAndView modles = new ModelAndView("userregister");
		return modles;
	}
	
	@RequestMapping("/mystat")
	public ModelAndView my(){
		ModelAndView models=new ModelAndView("my");
		return models;
	}
	@RequestMapping(value="/ajaxrelation",method= RequestMethod.POST)
	@ResponseBody
	public String relation(){
		StringBuffer sb=new StringBuffer();
		sb.append("{");
		sb.append("\"username\":\"sw\",");
		sb.append("\"browsed_times\":5,");
		sb.append("\"praised_times\":5");
		sb.append("}");
 		return sb.toString();
	}
	@RequestMapping(value="/ajaxmystate",method= RequestMethod.POST)
	@ResponseBody
	public String ajaxmystate(){
		StringBuffer sb=new StringBuffer();
		sb.append("{");
		sb.append("\"username\":\"wl\",");
		sb.append("\"browsed_times\":3,");
		sb.append("\"praised_times\":3");
		sb.append("}");
 		return sb.toString();
	}
}
