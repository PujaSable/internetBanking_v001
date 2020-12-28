package com.visionIT.internetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionIT.internetBanking.utility.ReadConfig;

public class BaseClass {

ReadConfig readconfig= new 	ReadConfig();

public String baseURL=readconfig.getApplicationURL();
public String username=readconfig.getUsername();
public String password=readconfig.getPassword();
public static WebDriver driver;

@Parameters("brower")
@BeforeClass	
public void setup(@Optional("chrome")String br) {
		
	if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(br.equals("Firefox")) {
			   System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe" );
		       driver=new FirefoxDriver();
			}
			else if(br.equals("IE")) {
			   System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer.exe");
		       driver =new InternetExplorerDriver();
			}
	     driver.get(baseURL);
			
		}
@AfterClass
public void tearDown() {
	
	driver.quit();
    }

}


