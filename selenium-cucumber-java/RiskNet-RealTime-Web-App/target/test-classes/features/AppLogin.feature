@RiskNetRT_WebLogin
Feature: RiskNet RealTime Login 
		As a user 
		I need to login to RiskNet RealTime
		So that I can access the RiskNet RealTime features 
		
Scenario: Open the risknet realtime
		Given I navigate to the risknet realtime
		 When I have risknet realtime available
		  And I enter invalid email and passord
		 Then I see an error message
		 When I enter valid email and passord
		 Then I am logged in   
		  And I am on the risknet reltime home page

#Scenario Outline: Risknet realtime features
#		Given I navigate to the risknet realtime
#		 When I login with valid credentials
#		  And I select "feature" 
#		 Then I am able to access "feature"
#Examples:
#|	feature			|
#|	alerts			|
#|	rules				|
#|	statistics	|	  

#		
#Scenario: Open the risknet realtime
#		Given I navigate to the risknet realtime
#		 When I have risknet realtime available
#		 Then I am able to signin  		
#		
#Scenario: I login with invalid credentials
#		Given I navigate to to RiskNet RealTime web application
#		 When I enter invalid email and passord
#		 Then I see an error message
#		
#Scenario: I login with valid credentials
#		Given I navigate to to RiskNet RealTime web application
#		 When I enter valid email and passord
#		 Then I am logged in          
#	 		 
#Scenario: Risknet realtime home page available after login
#		Given I navigate to to RiskNet RealTime web application
#		 When I login with valid credentials
#		 Then I am on the risknet reltime home page
		 
#Scenario Outline: Risknet realtime models
#		Given I login with valid credentials
#		 When I select "feature" 
#		 Then I am able to access "feature"
#Examples:
#|	feature		|
#|	alerts		|
#|	rules		|
#|	statistics	|