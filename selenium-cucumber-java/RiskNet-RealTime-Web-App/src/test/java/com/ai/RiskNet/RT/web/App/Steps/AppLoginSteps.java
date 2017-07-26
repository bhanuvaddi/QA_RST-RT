package com.ai.RiskNet.RT.web.App.Steps;


import org.junit.Assert;
import com.ai.RiskNet.RT.web.app.pageModel.AlertsPageObjects;
import com.ai.RiskNet.RT.web.app.pageModel.HomePageObjects;
import com.ai.RiskNet.RT.web.app.pageModel.LandingPageObjects;
import com.ai.RiskNet.RT.web.app.pageModel.RulesPageObjects;
import com.ai.RiskNet.RT.web.app.pageModel.StatisticsPageObjects;
import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLoginSteps implements BaseTest {
	
	RequirmentUtils 		requtil 	= new RequirmentUtils();
	LandingPageObjects 		landPage 	= new LandingPageObjects();
	HomePageObjects 		homePage 	= new HomePageObjects();
	AlertsPageObjects 		alertPage 	= new AlertsPageObjects();
	RulesPageObjects 		rulesPage 	= new RulesPageObjects();
	StatisticsPageObjects 	statPage 	= new StatisticsPageObjects();
	
	private static String RiskNetRT_URL				="RiskNetRT_URL";
	private static String AppLoginUserName			="AppLoginUserName";
	private static String AppLoginPassword			="AppLoginPassword";
	private static String InvalidAppLoginUserName	="InvalidAppLoginUserName";
	private static String InvalidAppLoginPassword	="InvalidAppLoginPassword";		
	
	public 	boolean _bool=false;
	
	// Application related properties file declaration
	String appPropertiesFileName = "AppLogin.properties";
	
	/** Givens i navigates to RiskNet URL 
	 * URL: gets from AppLogin.Properties
	 */
	@Given("^I navigate to the risknet realtime$")
	public void i_navigate_to_the_risknet_realtime() throws Throwable {
		String RST_URL = requtil.getEnvPropertyValue(appPropertiesFileName, RiskNetRT_URL);
	    navigationObj.navigateTo(RST_URL);
	}

	/** Whens i'm to access RiskNet application
	 */
	@When("^I have risknet realtime available$")
	public void i_have_risknet_realtime_available() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			Assert.assertTrue("RiskNet not available - Login form not visiable", _bool); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** Whens i try to supply invalid email and password
	 */
	@When("^I enter invalid email and password$")
	public void i_enter_invalid_email_and_password() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			if(_bool) {
				String InvalidUserName = requtil.getEnvPropertyValue(appPropertiesFileName, InvalidAppLoginUserName);
				String InvalidPassword = requtil.getEnvPropertyValue(appPropertiesFileName, InvalidAppLoginPassword);
				appactionsObj.doLogin(InvalidUserName, InvalidPassword);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** Thens ensure that invalid user name and password message is displayed
	 */
	@Then("^I see an error message$")
	public void i_see_an_error_message() throws Throwable {
		String xpath_InvalidUserNamePasswordError = landPage.xpath_InvalidUserNamePasswordError();
		try {
			assertionObj.checkElementPresence(requtil.objectLocator("xpath_InvalidUserNamePasswordError"), xpath_InvalidUserNamePasswordError, true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
	}

	/** Whens i try to supply valid email and password
	 */
	@When("^I enter valid email and password$")
	public void i_enter_valid_email_and_password() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			if(_bool) {
				String UserName = requtil.getEnvPropertyValue(appPropertiesFileName, AppLoginUserName);
				String Password = requtil.getEnvPropertyValue(appPropertiesFileName, AppLoginPassword);
				appactionsObj.doLogin(UserName,Password);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** Thens ensure that i'm logged in into the application
	 */
	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		String xpath_Header_Options = homePage.xpath_Header_Options();
		String xpath_SignOutButton = homePage.xpath_SignOutButton();
		try {
			clickObj.click(requtil.objectLocator("xpath_Header_Options"), xpath_Header_Options);
			assertionObj.checkElementPresence(requtil.objectLocator("xpath_SignOutButton"), xpath_SignOutButton, true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
		
	}

	/** Thens ensure that i'm on the home page after logged in into the application
	 */
	@Then("^I am on the risknet realtime home page$")
	public void i_am_on_the_risknet_realtime_home_page() throws Throwable {
		String xpath_RTSHomePageApp = homePage.xpath_RTSHomePageApp();
		assertionObj.isElementDisplayed(requtil.objectLocator("xpath_RTSHomePageApp"), xpath_RTSHomePageApp);
		appactionsObj.appSignOut();
	}
	
	/** Whens i try to login with valid credentials
	 */
	@When("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			if(_bool) {
				String UserName = requtil.getEnvPropertyValue(appPropertiesFileName, AppLoginUserName);
				String Password = requtil.getEnvPropertyValue(appPropertiesFileName, AppLoginPassword);
				appactionsObj.doLogin(UserName,Password);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			String xpath_Header_Options = homePage.xpath_Header_Options();
			String xpath_SignOutButton = homePage.xpath_SignOutButton();
			clickObj.click(requtil.objectLocator("xpath_Header_Options"), xpath_Header_Options);
			_bool = assertionObj.isElementDisplayed(requtil.objectLocator("xpath_SignOutButton"), xpath_SignOutButton);
			if(_bool) {
				System.out.println("Already Logged in");
			}else {
				e.printStackTrace();
			}
		}
	}
	
	/** Whens i try to select a feature 
	 * @param Feature
	 */
	@When("^I select \"([^\"]*)\"$")
	public void i_select(String Feature) throws Throwable {
	    
		switch(Feature) {
		case "alerts":
			String xpath_Alerts = homePage.xpath_Alerts();
			clickObj.click(requtil.objectLocator("xpath_Alerts"),xpath_Alerts);
			Thread.sleep(1000);
			break;
		case "rules":
			String xpath_Rules = homePage.xpath_Rules();
			clickObj.click(requtil.objectLocator("xpath_Rules"),xpath_Rules);
			Thread.sleep(1000);
			break;
		case "statistics":
			String xpath_Statistics = homePage.xpath_Statistics();
			clickObj.click(requtil.objectLocator("xpath_Statistics"),xpath_Statistics);
			Thread.sleep(1000);
			break;
		default:
			Assert.fail(Feature+" not yet implemented, failed @When I select "+Feature);
			break;
		}
	}

	/** Thens ensure that i'm on the selected feature 
	 * @param Feature
	 */
	@Then("^I am able to access \"([^\"]*)\"$")
	public void i_am_able_to_access(String Feature) throws Throwable {
		switch(Feature) {
		case "alerts":
			String id_AlertsMenu = alertPage.id_AlertsMenu();
			assertionObj.checkElementPresence(requtil.objectLocator("id_AlertsMenu"), id_AlertsMenu, true);
			Thread.sleep(500);
			appactionsObj.appSignOut();	
			break;
		case "rules":
			String id_NewRule = rulesPage.id_NewRule();
			assertionObj.checkElementPresence(requtil.objectLocator("id_NewRule"), id_NewRule, true);
			Thread.sleep(500);
			appactionsObj.appSignOut();
			break;
		case "statistics":
			String id_NewStat = statPage.id_NewStat();
			assertionObj.checkElementPresence(requtil.objectLocator("id_NewStat"), id_NewStat, true);
			Thread.sleep(500);
			appactionsObj.appSignOut();
			navigationObj.closeDriver();
			break;
		}
	}
}
