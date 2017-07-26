package com.ai.RiskNet.RT.web.app.pageModel;

import com.ai.RiskNet.RT.web.utilities.RequirmentUtils;

public class RulesPageObjects extends RequirmentUtils {
	
	String propertiesFileName="RulesPageObjects.properties";
	
	/** Method to get id_NewRule from RulesPageObjects.properties
	 *  @return String: id_NewRule
	 */
	public String id_NewRule() {
		String id_NewRule = getEnvPropertyValue(propertiesFileName, "id_NewRule");
		return id_NewRule;
	}
	
	

}
