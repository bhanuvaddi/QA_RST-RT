package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class HomePage extends RequirmentUtils {
	
	/** Method to get xpath_RTSHomePageApp from HomePage.properties
	 *  @return String: xpath_RTSHomePageApp
	 */
	public String xpath_RTSHomePageApp() {
		String xpath_RTSHomePageApp = getEnvPropertyValue("HomePage.properties", "xpath_RTSHomePageApp");
		return xpath_RTSHomePageApp;
	}
	
	/** Method to get xpath_SignOutButton from HomePage.properties
	 *  @return String: xpath_SignOutButton
	 */
	public String xpath_SignOutButton() {
		String xpath_SignOutButton = getEnvPropertyValue("HomePage.properties", "xpath_SignOutButton");
		return xpath_SignOutButton;
	}
	
	/** Method to get xpath_Header_Options from HomePage.properties
	 *  @return String: xpath_Header_Options
	 */
	public String xpath_Header_Options() {
		String xpath_Header_Options = getEnvPropertyValue("HomePage.properties", "xpath_Header_Options");
		return xpath_Header_Options;
	}

}
