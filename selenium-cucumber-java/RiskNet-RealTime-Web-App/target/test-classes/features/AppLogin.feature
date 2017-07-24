@RiskNetRT_WebLogin
Feature: RiskNet RealTime Login 
		As a user 
		I need to login to RiskNet RealTime
		So that I can access the RiskNet RealTime features
		 
@Smoke		
Scenario: Open the risknet realtime
		Given I navigate to the risknet realtime
		 When I have risknet realtime available
		  And I enter invalid email and password
		 Then I see an error message
		 When I enter valid email and password
		 Then I am logged in   
		  And I am on the risknet realtime home page

@Regression
Scenario Outline: Risknet realtime features
		Given I navigate to the risknet realtime
		 When I login with valid credentials
		  And I select <feature>
		 Then I am able to access <feature>
Examples:
|	feature			|
|	alerts			|
|	rules				|
|	statistics	|	  

