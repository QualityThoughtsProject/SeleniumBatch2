package com.qt.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ProjectConfig {
	
	static Properties prop;
	
	
	static {
		prop=new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ProjectConfig.properties");
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	

}
