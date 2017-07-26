package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class LandingPageObjects extends RequirmentUtils {
	
	String propertiesFileName="LandingPageObjects.properties";
	
	/** Method to get xpath_LogoHomeButton from LandingPage.properties
	 *  @return String: xpath_LogoHomeButton
	 */
	public String xpath_LogoHomeButton() {
		String xpath_LogoHomeButton = getEnvPropertyValue(propertiesFileName, "xpath_LogoHomeButton");
		return xpath_LogoHomeButton; 
	}
	
	/** Method to get id_LoginMenu from LandingPage.properties
	 *  @return String: id_LoginMenu
	 */
	public String id_LoginMenu() {
		String id_LoginMenu = getEnvPropertyValue(propertiesFileName, "id_LoginMenu");
		return id_LoginMenu;
	}
	
	/** Method to get id_UserNameField from LandingPage.properties
	 *  @return String: id_UserNameField
	 */
	public String id_UserNameField() {
		String id_UserNameField = getEnvPropertyValue(propertiesFileName, "id_UserNameField");
		return id_UserNameField;
	}
	
	/** Method to get id_PasswordField from LandingPage.properties
	 *  @return String: id_PasswordField
	 */
	public String id_PasswordField() {
		String id_PasswordField = getEnvPropertyValue(propertiesFileName, "id_PasswordField");
		return id_PasswordField;
	}
	
	/** Method to get xpath_SignInButton from LandingPage.properties
	 *  @return String: xpath_SignInButton
	 */
	public String xpath_SignInButton() {
		String xpath_SignInButton = getEnvPropertyValue(propertiesFileName, "xpath_SignInButton");
		return xpath_SignInButton;
	}
	
	/** Method to get xpath_InvalidUserNamePasswordError from LandingPage.properties
	 *  @return String: xpath_InvalidUserNamePasswordError
	 */
	public String xpath_InvalidUserNamePasswordError() {
		String xpath_InvalidUserNamePasswordError = getEnvPropertyValue(propertiesFileName, "xpath_InvalidUserNamePasswordError");
		return xpath_InvalidUserNamePasswordError;
	}
}
