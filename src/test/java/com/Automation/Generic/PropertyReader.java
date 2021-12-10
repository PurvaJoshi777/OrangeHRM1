package com.Automation.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
	static Properties prop=new Properties();
	public static void init()
	{
		try {
			prop.load(new FileInputStream("C:\\Users\\PSANJAYJ\\eclipse-workspace\\OrangeHRM1\\src\\test\\resources\\config\\config.properties"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
	}
}
