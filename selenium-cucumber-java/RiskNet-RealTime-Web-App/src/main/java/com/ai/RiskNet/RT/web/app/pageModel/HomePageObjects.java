package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class HomePageObjects extends RequirmentUtils {
	
	String propertiesFileName="HomePageObjects.properties";
	
	/** Method to get xpath_RTSHomePageApp from HomePage.properties
	 *  @return String: xpath_RTSHomePageApp
	 */
	public String xpath_RTSHomePageApp() {
		String xpath_RTSHomePageApp = getEnvPropertyValue(propertiesFileName, "xpath_RTSHomePageApp");
		return xpath_RTSHomePageApp;
	}
	
	/** Method to get xpath_SignOutButton from HomePage.properties
	 *  @return String: xpath_SignOutButton
	 */
	public String xpath_SignOutButton() {
		String xpath_SignOutButton = getEnvPropertyValue(propertiesFileName, "xpath_SignOutButton");
		return xpath_SignOutButton;
	}
	
	/** Method to get xpath_Header_Options from HomePage.properties
	 *  @return String: xpath_Header_Options
	 */
	public String xpath_Header_Options() {
		String xpath_Header_Options = getEnvPropertyValue(propertiesFileName, "xpath_Header_Options");
		return xpath_Header_Options;
	}
	
	/** Method to get xpath_Alerts from HomePage.properties
	 *  @return String: xpath_Alerts
	 */
	public String xpath_Alerts() {
		String xpath_Alerts = getEnvPropertyValue(propertiesFileName, "xpath_Alerts");
		return xpath_Alerts;
	}
	
	/** Method to get xpath_Rules from HomePage.properties
	 *  @return String: xpath_Rules
	 */
	public String xpath_Rules() {
		String xpath_Rules = getEnvPropertyValue(propertiesFileName, "xpath_Rules");
		return xpath_Rules;
	}
	
	/** Method to get xpath_Statistics from HomePage.properties
	 *  @return String: xpath_Statistics
	 */
	public String xpath_Statistics() {
		String xpath_Statistics = getEnvPropertyValue(propertiesFileName, "xpath_Statistics");
		return xpath_Statistics;
	}

}
