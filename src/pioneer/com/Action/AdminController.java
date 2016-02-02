package pioneer.com.Action;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminController {

	@RequestMapping("/admin_index")
	public ModelAndView index(HttpServletRequest request){
		ModelAndView models = new ModelAndView("index");
		return models;
	}
	@RequestMapping("/admin_charts")
	public ModelAndView charts()
	{
		ModelAndView models = new ModelAndView("charts");
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
