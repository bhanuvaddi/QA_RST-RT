package com.ai.RiskNet.RT.web.App.Steps;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;

import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLoginSteps implements BaseTest {
	private static String RiskNetRT_URL="RiskNetRT_URL";
	private static String AppLoginUserName="AppLoginUserName";
	private static String AppLoginPassword="AppLoginPassword";
	private static String InvalidAppLoginUserName="InvalidAppLoginUserName";
	private static String InvalidAppLoginPassword="InvalidAppLoginPassword";
	
	public 	boolean _bool=false;
	
	RequirmentUtils requtil = new RequirmentUtils();
	
	@Given("^I navigate to the risknet realtime$")
	public void i_navigate_to_the_risknet_realtime() throws Throwable {
		String RST_URL = requtil.getEnvPropertyValue("AppLogin.properties", RiskNetRT_URL);
	    navigationObj.navigateTo(RST_URL);
	}

	@When("^I have risknet realtime available$")
	public void i_have_risknet_realtime_available() throws Throwable {
		try {
			_bool = assertionObj.isElementDisplayed("id", "login-menu-options");
			Assert.assertTrue("RiskNet not available - Login form not visiable", _bool); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Then("^I am able to signin$")
//	public void i_am_able_to_signin() throws Throwable {
//		assertionObj.checkElementPresence("xpath", "//button[(@id='signInButton')]", true);
//	}
//	
//	@Given("^I navigate to to RiskNet RealTime web application$")
//	public void i_navigate_to_to_RiskNet_RealTime_web_application() throws Throwable {
//	    String RST_URL = requtil.getEnvPropertyValue("AppLogin.properties", RiskNetRT_URL);
//	    navigationObj.navigateTo(RST_URL);
//	}

	@When("^I enter invalid email and passord$")
	public void i_enter_invalid_email_and_passord() throws Throwable {
		try {
			_bool = assertionObj.isElementDisplayed("id", "login-menu-options");
			if(_bool) {
				String InvalidUserName = requtil.getEnvPropertyValue("AppLogin.properties", InvalidAppLoginUserName);
				String InvalidPassword = requtil.getEnvPropertyValue("AppLogin.properties", InvalidAppLoginPassword);
				inputObj.enterText("id", InvalidUserName, "inputEmail3");
				inputObj.enterText("id", InvalidPassword, "inputPassword3");
				clickObj.click("xpath", "//button[(@id='signInButton')]");
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("^I see an error message$")
	public void i_see_an_error_message() throws Throwable {
		try {
			assertionObj.checkElementPresence("xpath", "//div[contains(@class,'message-error')]", true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
	}

	@When("^I enter valid email and passord$")
	public void i_enter_valid_email_and_passord() throws Throwable {
		try {
			_bool = assertionObj.isElementDisplayed("id", "login-menu-options");
			if(_bool) {
				String UserName = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginUserName);
				String Password = requtil.getEnvPropertyValue("AppLogin.properties", AppLoginPassword);
				inputObj.clearText("id", "inputEmail3");
				inputObj.enterText("id", UserName, "inputEmail3");
				inputObj.clearText("id", "inputPassword3");
				inputObj.enterText("id", Password, "inputPassword3");
				clickObj.click("xpath", "//button[(@id='signInButton')]");
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		try {
			clickObj.click("xpath", "//li[@id='options']");
			assertionObj.checkElementPresence("xpath", "//li[@id='options']//li[@id='sign-out']", true);
		} catch (TestCaseFailed e) {
			e.printStackTrace();
		}
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
	
	@Then("^I am on the risknet reltime home page$")
	public void i_am_on_the_risknet_reltime_home_page() throws Throwable {
		assertionObj.isElementDisplayed("xpath", "//ul[(@class='homescreen-app-buttons')]");
		navigationObj.closeDriver();		
	}
	
	@When("^I select \"([^\"]*)\"$")
	public void i_select(String Feature) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I am able to access \"([^\"]*)\"$")
	public void i_am_able_to_access(String Feature) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
