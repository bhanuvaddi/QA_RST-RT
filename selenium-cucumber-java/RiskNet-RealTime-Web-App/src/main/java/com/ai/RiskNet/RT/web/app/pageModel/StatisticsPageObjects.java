package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class StatisticsPageObjects extends RequirmentUtils {
	
	String propertiesFileName="StatisticsPageObjects.properties";
	
	/** Method to get id_NewStat from StatisticsPageObjects.properties
	 *  @return String: id_NewStat
	 */
	public String id_NewStat() {
		String id_NewStat = getEnvPropertyValue(propertiesFileName, "id_NewStat");
		return id_NewStat;
	}
	
	

}
