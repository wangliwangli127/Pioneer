package pioneer.com.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import pioneer.com.utils.Constants;

import com.opensymphony.xwork2.ActionContext;

public class SpringMVCInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String url=request.getRequestURL().toString();
		if ((url.indexOf("Pioneer/index/") > 0)||(url.indexOf("Pioneer/loginsucc/") > 0)
				||(url.indexOf("Pioneer/img/") > 0)||(url.indexOf("Pioneer/css/") > 0)
				||(url.indexOf("Pioneer/js/") > 0)||(url.indexOf("Pioneer/font/") > 0)
				||(url.indexOf("Pioneer/jqvmap/") > 0)){
			System.out.println("当前请求路径："+request.getRequestURL());
			return true;
		}
		Object obj = ActionContext.getContext().getSession().get(Constants.SESSION_USER);
		if(obj==null){
			ActionContext.getContext().put("timeout","登陆超时。");
			return false;
		}
		return true;
	}

}
