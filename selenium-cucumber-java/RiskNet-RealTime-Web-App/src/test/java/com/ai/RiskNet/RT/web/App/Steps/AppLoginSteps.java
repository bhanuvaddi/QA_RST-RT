package com.ai.RiskNet.RT.web.App.Steps;

import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.TestCaseFailed;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLoginSteps implements BaseTest {
	private static String RiskNetRT_URL="RiskNetRT_URL";
	private static String AppLoginUserName="AppLoginUserName";
	private static String AppLoginPassword="AppLoginPassword";
	
	public 	boolean _bool=false;
	
	@Given("^I navigate to to RiskNet RealTime web application$")
	public void i_navigate_to_to_RiskNet_RealTime_web_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    navigationObj.navigateTo(RiskNetRT_URL);
	}

	@When("^I enter valid email and passord$")
	public void i_enter_valid_email_and_passord() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputObj.enterText("id", AppLoginUserName, "inputEmail3");
		inputObj.enterText("id", AppLoginPassword, "inputPassword3");
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			assertionObj.checkElementPresence("xpath", "//*[(@id='sign-out')]", true);
		} catch (TestCaseFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
