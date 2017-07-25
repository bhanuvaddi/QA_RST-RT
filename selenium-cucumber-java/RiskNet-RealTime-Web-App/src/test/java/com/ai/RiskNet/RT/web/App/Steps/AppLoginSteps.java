package com.ai.RiskNet.RT.web.App.Steps;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.remote.server.handler.GetElementLocationInView;

import com.ai.RiskNet.RT.web.app.pageModel.HomePage;
import com.ai.RiskNet.RT.web.app.pageModel.LandingPage;
import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLoginSteps implements BaseTest {
	
	RequirmentUtils requtil = new RequirmentUtils();
	LandingPage landPage = new LandingPage();
	HomePage homePage = new HomePage();
	
	private static String RiskNetRT_URL="RiskNetRT_URL";
	private static String AppLoginUserName="AppLoginUserName";
	private static String AppLoginPassword="AppLoginPassword";
	private static String InvalidAppLoginUserName="InvalidAppLoginUserName";
	private static String InvalidAppLoginPassword="InvalidAppLoginPassword";
		
//	public String xpath_LogoHomeButton = landPage.xpath_LogoHomeButton();
//	public String id_LoginMenu = landPage.id_LoginMenu();
//	public String id_UserNameField = landPage.id_UserNameField();
//	public String id_PasswordField = landPage.id_PasswordField();
//	public String xpath_SignInButton = landPage.xpath_SignInButton();
//	public String xpath_SignOutButton = homePage.xpath_SignOutButton();
//	public String xpath_Header_Options = homePage.xpath_Header_Options();
	
	public 	boolean _bool=false;
	
	@Given("^I navigate to the risknet realtime$")
	public void i_navigate_to_the_risknet_realtime() throws Throwable {
		String RST_URL = requtil.getEnvPropertyValue("AppLogin.properties", RiskNetRT_URL);
	    navigationObj.navigateTo(RST_URL);
	}

	@When("^I have risknet realtime available$")
	public void i_have_risknet_realtime_available() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			Assert.assertTrue("RiskNet not available - Login form not visiable", _bool); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^I enter invalid email and password$")
	public void i_enter_invalid_email_and_password() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			if(_bool) {
				String InvalidUserName = requtil.getEnvPropertyValue("AppLogin.properties", InvalidAppLoginUserName);
				String InvalidPassword = requtil.getEnvPropertyValue("AppLogin.properties", InvalidAppLoginPassword);
				appactionsObj.doLogin(InvalidUserName, InvalidPassword);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("^I see an error message$")
	public void i_see_an_error_message() throws Throwable {
		String xpath_InvalidUserNamePasswordError = landPage.xpath_InvalidUserNamePasswordError();
		try {
			assertionObj.checkElementPresence("xpath", xpath_InvalidUserNamePasswordError, true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
	}

	@When("^I enter valid email and password$")
	public void i_enter_valid_email_and_password() throws Throwable {
		try {
			_bool = appactionsObj.isLoginFormAvailable();
			if(_bool) {
				String UserName = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginUserName);
				String Password = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginPassword);
				appactionsObj.doLogin(UserName,Password);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		String xpath_Header_Options = homePage.xpath_Header_Options();
		String xpath_SignOutButton = homePage.xpath_SignOutButton();
		try {
			clickObj.click("xpath", xpath_Header_Options);
			assertionObj.checkElementPresence("xpath", xpath_SignOutButton, true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
	}

	@Then("^I am on the risknet realtime home page$")
	public void i_am_on_the_risknet_realtime_home_page() throws Throwable {
		String xpath_RTSHomePageApp = homePage.xpath_RTSHomePageApp();
		assertionObj.isElementDisplayed("xpath", xpath_RTSHomePageApp);
		navigationObj.closeDriver();	
	}
	
	@When("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
		try {
			_bool = assertionObj.isElementDisplayed("id", "login-menu-options");
			if(_bool) {
				String UserName = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginUserName);
				String Password = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginPassword);
				inputObj.enterText("id", UserName, "inputEmail3");
				inputObj.enterText("id", Password, "inputPassword3");
				clickObj.click("xpath", "//button[(@id='signInButton')]");
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			_bool = assertionObj.isElementDisplayed("xpath", "//li[@id='options']//li[@id='sign-out']");
			if(_bool) {
				System.out.println("Already Logged in");
			}else {
				e.printStackTrace();
			}
		}
	}
	
//	@When("^I select (.*)$")
//	public void i_select(String Feature) throws Throwable {
//	    
//		switch(Feature) {
//		case "alerts":
//			clickObj.click("xpath", "//ul[(@class='homescreen-app-buttons')]//a[contains(@href,'alerts')]");
//			Thread.sleep(1500);
//			break;
//		case "rules":
//			clickObj.click("xpath", "//ul[(@class='homescreen-app-buttons')]//a[contains(@href,'rules')]");
//			Thread.sleep(1500);
//			break;
//		case "statistics":
//			clickObj.click("xpath", "//ul[(@class='homescreen-app-buttons')]//a[contains(@href,'statistics')]");
//			Thread.sleep(1500);
//			break;
//		default:
//			Assert.fail(Feature+" not yet implemented, failed @When I select "+Feature);
//			break;
//		}
//	}
//
//	@Then("^I am able to access (.*)$")
//	public void i_am_able_to_access(String Feature) throws Throwable {
//		switch(Feature) {
//		case "alerts":
//			assertionObj.checkElementPresence("id", "alert-menu", true);
//			Thread.sleep(500);
//			clickObj.click("xpath", "//li[@id='options']");
//			clickObj.click("xpath", "//li[@id='options']//li[@id='sign-out']");
//		case "rules":
//			assertionObj.checkElementPresence("id", "rule-new", true);
//			Thread.sleep(500);
//			clickObj.click("xpath", "//li[@id='options']");
//			clickObj.click("xpath", "//li[@id='options']//li[@id='sign-out']");
//		case "statistics":
//			assertionObj.checkElementPresence("id", "stat-new", true);
//			Thread.sleep(500);
//			clickObj.click("xpath", "//li[@id='options']");
//			clickObj.click("xpath", "//li[@id='options']//li[@id='sign-out']");
//			break;
//		}
//		navigationObj.closeDriver();
//	}
	
	@When("^I select alerts$")
	public void i_select_alerts() throws Throwable {
	    clickObj.click("xpath", "//ul[(@class='homescreen-app-buttons')]//a[contains(@href,'alerts')]");
	}
	
	@Then("^I am able to access alerts$")
	public void i_am_able_to_access_alerts() throws Throwable {
		Thread.sleep(500);
		_bool = assertionObj.isElementDisplayed("xpath", "//div[@id='alert-menu']//ul[@id='alert-list']");
		Thread.sleep(500);
		clickObj.click("xpath", "//div[@id='logo']//*[contains(@class,'home-link')]");
		
	}
}
