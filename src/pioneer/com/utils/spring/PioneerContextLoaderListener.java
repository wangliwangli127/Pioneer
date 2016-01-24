package pioneer.com.utils.spring;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

public class PioneerContextLoaderListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {

		//添加我们的相关的初始化内容
		//1、加载properties配置
		PropUtil.load();
		//InitLibrary.init(event.getServletContext());
		//为了保持spring的初始化信息，我保存下面一行代码
		super.contextInitialized(event);
	}
}