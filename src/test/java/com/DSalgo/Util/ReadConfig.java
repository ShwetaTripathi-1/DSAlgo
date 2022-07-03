package com.DSalgo.Util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration\\config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}catch(Exception e) {
			
			System.out.println(" Exception is" + e.getMessage());
		}
	}
	
	public String getApplicationUrl() {
		
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getTxtEditor() {
		
		String txt=pro.getProperty("EditorTxt");
		return txt;
	}

    public String getUserName() {
		
		String username=pro.getProperty("UserName");
		return  username;
	}
	
	 public String getPassword() {
			
			String password=pro.getProperty("password");
			return password;
		}
	 
	 public String getChromePath() {
			
			String ChromePath=pro.getProperty("chromepath");
			return ChromePath;
		}
	 
	 public String getFireFoxPath() {
			
			String FireFoxPath=pro.getProperty("firefoxpath");
			return FireFoxPath;
		}
	 
	 public String getIEPath() {
			
			String IEPath=pro.getProperty("iepath");
			return IEPath;
		}

 
}
