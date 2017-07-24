package com.ai.RiskNet.RT.web.env;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Env 
{
	static WebDriver driver = null;
	static String browserName = null;
	//static String ChromeBrowser = null;
	static String IE = null;
	static String cloudPlatformConfigFile = null;
	static String currentPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	
	public static String getBrowserName()
	{
		browserName = System.getProperty("browser");
		IE = System.getProperty("cloud_config");
		
		if(IE != null)
		{
			System.out.println("reading config file");
			try {
				browserName = IE.split("_")[0];
				InputStream input = new FileInputStream(currentPath+"/src/main/java/BrowserConfig/"+IE+".properties");
				input.close();
				
			}catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}else if(browserName == null)
			browserName = "ff";
		return browserName;
	}
	
	public static WebDriver SaucelabDriver(){
		System.out.println("Creating Saucelab Driver");
		
		try {
			InputStream input = new FileInputStream(currentPath+"/src/main/java/cloudPlatformConfigs/saucelab.properties");
			prop.load(input);
			HashMap<String, String> saucelabConfig = new HashMap<String, String>();
			Enumeration enuKeys = prop.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = prop.getProperty(key);
				saucelabConfig.put(key, value);
			}
			input.close();
			prop.clear();
			
			String url = saucelabConfig.get("protocol")+
	    				 "://"+
	    				 saucelabConfig.get("username")+
	    				 ":"+
	    				 saucelabConfig.get("access_key")+
	    				 saucelabConfig.get("url");
	    	
	    	System.out.println("url :"+url);
	    	URL remoteDriverURL = new URL(url);
	    	
	    	DesiredCapabilities capability = new DesiredCapabilities();
	    	input = new FileInputStream(currentPath+"/src/main/java/cloudBrowserConfigs/"+IE+".properties");
			prop.load(input);
			enuKeys = prop.keys();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = prop.getProperty(key);
				System.out.println("key :"+key + " Value :"+value);
				capability.setCapability(key, value);
			}
			input.close();
	    	
	        driver = new RemoteWebDriver(remoteDriverURL, capability);
	        
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		return driver;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{
			System.out.println("Browser: " + browser);

			switch (browser.toLowerCase()) {
			case "ff":
			case "firefox":
//				ProfilesIni allProfiles = new ProfilesIni();
//				FirefoxProfile profile = allProfiles.getProfile("selenium");
//				driver = new FirefoxDriver(profile);
//				driver = new FirefoxDriver();
//				break;
				System.setProperty("webdriver.gecko.driver", currentPath+"/BrowserConfig/BrowserDrivers/wires.exe");
				driver = new FirefoxDriver();
				break;
				
			case "ch":
			case "chrome":
				System.setProperty("webdriver.chrome.driver", currentPath+"/BrowserConfig/BrowserDrivers/chromedriver.exe");
//				ChromeOptions options = new ChromeOptions();
//			    options.setExperimentalOption("useAutomationExtension", true);
//			    driver = new ChromeDriver(options);
				driver = new ChromeDriver();
				break;

			case "ie" :
			case "internetexplorer":
				System.setProperty("webdriver.ie.driver", currentPath+"/BrowserConfig/BrowserDrivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			
			case "edge":
				System.setProperty("webdriver.edge.driver", currentPath+"/BrowserConfig/BrowserDrivers/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				break;

			case "safari":
				driver = new SafariDriver();
				break;
			
			case "saucelab":
				driver = SaucelabDriver();
				break;
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}//switch
				
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().window().setSize(new Dimension(1920, 1075));
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			return driver;
        }
	}
