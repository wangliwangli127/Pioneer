#基本环境要就
  1.jdk 1.7 
  2.tomcat 7.0
#配置文件说明
  >.pioneer-config.xml，spring事务管理和hibernate数据库的datasource

  >.jdbc.properties,数据源配置（连接字符串，密码）

  >.hibernate.cfg.xml,hibernate配置文件,其中放着entity.hbm.xml文件

  >.struts.xml，定义拦截器和登陆action配置

  >.user.xml,配置相应模块的action，include到structs.xml配置文件中

  >.ActionManager.xml，配置相应实体类的Dao,Service,Action,通过user.xml中的aciton_name取得相应的bean_id，实现dao,service,action映射
#其他
注意：
	1.pioneer.com.ServiceImpl包是实现业务逻辑的地方，业务逻辑相关的都放到这里面，返回数据
	2.pioneer.com.Action只接受数据和处理数据，不处理业务逻辑
#===============================
