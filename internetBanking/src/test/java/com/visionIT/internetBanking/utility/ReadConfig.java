package com.visionIT.internetBanking.utility;



	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ReadConfig {
	    
		public Properties pro;
		public ReadConfig() {
			
			try {
				File fs = new File ("C:\\Users\\PATIDAR\\git\\internetBanking_v001\\internetBanking\\Config\\config.properties");
			    FileInputStream fis =new FileInputStream(fs);
			    pro = new Properties();
			    pro.load(fis);
			}
			catch (Exception e)
			{
				
				e.printStackTrace();
			}
		}
		public String getKeyValue(String searchKey) {
			return pro.getProperty(searchKey);
		}
		
	    public String getApplicationURL() {
	    	 String url= pro.getProperty("baseurl");
	    	 return url;
	     }
	    public String getUsername()
		   {
		String username=pro.getProperty("username");
		return username;
		}
		
		public String getPassword()
		{
		String password=pro.getProperty("password");
		return password;
		}
	}



