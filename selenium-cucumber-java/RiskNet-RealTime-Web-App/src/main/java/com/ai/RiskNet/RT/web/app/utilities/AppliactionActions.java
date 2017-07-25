package com.ai.RiskNet.RT.web.app.utilities;

import org.junit.Assert;

import com.ai.RiskNet.RT.web.app.pageModel.HomePage;
import com.ai.RiskNet.RT.web.app.pageModel.LandingPage;
import com.ai.RiskNet.RT.web.env.BaseTest;
//import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class AppliactionActions implements BaseTest{
	
	LandingPage landPage = new LandingPage();
	HomePage homePage = new HomePage();
	
	public String xpath_LogoHomeButton = landPage.xpath_LogoHomeButton();
	public String id_LoginMenu = landPage.id_LoginMenu();
	public String id_UserNameField = landPage.id_UserNameField();
	public String id_PasswordField = landPage.id_PasswordField();
	public String xpath_SignInButton = landPage.xpath_SignInButton();
	public String xpath_SignOutButton = homePage.xpath_SignOutButton();
	public String xpath_Header_Options = homePage.xpath_Header_Options();
	
	boolean _bool = false;
	
	/** Method to navigate to RTS Home	*/
	public void homeRTS() {
		String xpath_LogoHomeButton = this.xpath_LogoHomeButton;
		clickObj.click("xpath", xpath_LogoHomeButton);
	}
	
	/** Method to get Login Form status - displayed?
	@return Boolean
	*/
	public boolean isLoginFormAvailable() {
		String id_LoginMenu = this.id_LoginMenu;
		return assertionObj.isElementDisplayed("id", id_LoginMenu);
	}
	
	/** Method to do Login
	@param username : String : UserName to enter
	@param password : String : Password to enter 
	*/
	public void doLogin(String userName, String password) {
		String id_UserNameField = this.id_UserNameField;
		String id_PasswordField = this.id_PasswordField;
		String xpath_SignInButton =this.xpath_SignInButton;
		try {
			_bool = isLoginFormAvailable();
			if(_bool) {
				inputObj.clearText("id", id_UserNameField);
				inputObj.enterText("id", userName, id_UserNameField);
				inputObj.clearText("id", id_PasswordField);
				inputObj.enterText("id", password, id_PasswordField);
				clickObj.click("xpath", xpath_SignInButton);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** Method to Sign Out	*/
	public void appSignOut() {
		String xpath_SignOutButton = this.xpath_SignOutButton;
		String xpath_Header_Options = this.xpath_Header_Options;
		clickObj.click("xpath", xpath_Header_Options);
		clickObj.click("xpath", xpath_SignOutButton);
	}

}
