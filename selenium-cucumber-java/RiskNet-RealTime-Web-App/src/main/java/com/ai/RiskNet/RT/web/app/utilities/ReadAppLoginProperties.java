package com.ai.RiskNet.RT.web.app.utilities;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class ReadAppLoginProperties extends RequirmentUtils {
	
	/** Method to get xpath_RTSHomePageApp from HomePage.properties
	 *  @return String: xpath_RTSHomePageApp
	 */
	public String xpath_RTSHomePageApp() {
		String xpath_RTSHomePageApp = getEnvPropertyValue("HomePage.properties", "xpath_RTSHomePageApp");
		return xpath_RTSHomePageApp;
	}

}
