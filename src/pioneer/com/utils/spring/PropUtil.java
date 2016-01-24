package pioneer.com.utils.spring;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropUtil {

private static Properties prop ;//= new Properties();
	
	public static void load(){
		try {
			prop = System.getProperties();
			String st = "/jdbc.properties";
			InputStream is = PropUtil.class.getResourceAsStream(st);
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getString(String key){
		if(prop == null){
			prop = System.getProperties();
			load();
		}
		return prop.getProperty(key);
	}
	
	public static String get(String key){
		return getString(key);
	}
	
	public static String get(String key,String defaultValue){
		String value = getString(key);
		if(value == null || value.equals("")) return defaultValue;
		return value;
	}
	
	//方法签名
	public static boolean get(String key,boolean defaultValue){
		String value = getString(key);
		if(value == null || value.equals("")) return false;
		
		if(value.equalsIgnoreCase("true")){
			return true;
		}
		return defaultValue;
	}
	public static Map<String,String> getProperties(){
		Map<String,String> map = new HashMap<String,String>();
		Set<Object> set = prop.keySet();
		for(Object obj:set){
			if(obj.toString().startsWith("hibernate")){
				map.put(obj.toString(), getString(obj.toString()));
			}
		}
		return map;
	}
}
