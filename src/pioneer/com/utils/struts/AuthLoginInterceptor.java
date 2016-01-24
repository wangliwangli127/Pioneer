package pioneer.com.utils.struts;

import pioneer.com.utils.Constants;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthLoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Object obj = ActionContext.getContext().getSession().get(Constants.SESSION_USER);
		if(obj==null){
			ActionContext.getContext().put("timeout","登陆超时。");
			return "login";
		}
		return arg0.invoke();
	}
	
}
