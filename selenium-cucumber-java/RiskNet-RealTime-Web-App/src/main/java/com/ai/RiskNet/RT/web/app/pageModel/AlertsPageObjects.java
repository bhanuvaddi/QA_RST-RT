package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class AlertsPageObjects extends RequirmentUtils {
	
	String propertiesFileName="AlertsPageObjects.properties";
	
	/** Method to get id_AlertsMenu from AlertsPageObjects.properties
	 *  @return String: id_AlertsMenu
	 */
	public String id_AlertsMenu() {
		String id_AlertsMenu = getEnvPropertyValue(propertiesFileName, "id_AlertsMenu");
		return id_AlertsMenu;
	}
	
	
}
