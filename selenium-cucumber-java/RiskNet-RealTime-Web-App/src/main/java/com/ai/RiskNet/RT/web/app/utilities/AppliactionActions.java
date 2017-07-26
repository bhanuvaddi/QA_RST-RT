package com.ai.RiskNet.RT.web.app.utilities;

import org.junit.Assert;

import com.ai.RiskNet.RT.web.app.pageModel.HomePageObjects;
import com.ai.RiskNet.RT.web.app.pageModel.LandingPageObjects;
import com.ai.RiskNet.RT.web.env.BaseTest;
import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class AppliactionActions extends RequirmentUtils implements BaseTest{
	
	LandingPageObjects landPage = new LandingPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	
	private String xpath_LogoHomeButton = landPage.xpath_LogoHomeButton();
	private String id_LoginMenu = landPage.id_LoginMenu();
	private String id_UserNameField = landPage.id_UserNameField();
	private String id_PasswordField = landPage.id_PasswordField();
	private String xpath_SignInButton = landPage.xpath_SignInButton();
	private String xpath_SignOutButton = homePage.xpath_SignOutButton();
	private String xpath_Header_Options = homePage.xpath_Header_Options();
	boolean _bool = false;
	
	/** Method to navigate to RTS Home	*/
	public void gotoRTShome() {
		String xpath_LogoHomeButton = this.xpath_LogoHomeButton;
		clickObj.click(objectLocator("xpath_LogoHomeButton"), xpath_LogoHomeButton);
	}
	
	/** Method to get Login Form status - displayed?
	@return Boolean
	*/
	public boolean isLoginFormAvailable() {
		String id_LoginMenu = this.id_LoginMenu;
		return assertionObj.isElementDisplayed(objectLocator("id_LoginMenu"), id_LoginMenu);
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
				inputObj.clearText(objectLocator("id_UserNameField"), id_UserNameField);
				inputObj.enterText(objectLocator("id_UserNameField"), userName, id_UserNameField);
				inputObj.clearText(objectLocator("id_PasswordField"), id_PasswordField);
				inputObj.enterText(objectLocator("id_PasswordField"), password, id_PasswordField);
				clickObj.click(objectLocator("xpath_SignInButton"), xpath_SignInButton);
			}else {
				Assert.fail("Login form not visiable.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** Method to Sign Out	
	 * @throws InterruptedException */
	public void appSignOut() throws InterruptedException {
		String xpath_SignOutButton = this.xpath_SignOutButton;
		String xpath_Header_Options = this.xpath_Header_Options;
		clickObj.click(objectLocator("xpath_Header_Options"), xpath_Header_Options);
		Thread.sleep(500);
		clickObj.clickForcefully(objectLocator("xpath_SignOutButton" ), xpath_SignOutButton);
		Thread.sleep(6000);
	}

}
