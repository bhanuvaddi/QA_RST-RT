$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AppLogin.feature");
formatter.feature({
  "line": 2,
  "name": "RiskNet RealTime Login",
  "description": "As a user \r\nI need to login to RiskNet RealTime\r\nSo that I can access the RiskNet RealTime features",
  "id": "risknet-realtime-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RiskNetRT_WebLogin"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Open the risknet realtime",
  "description": "",
  "id": "risknet-realtime-login;open-the-risknet-realtime",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I have risknet realtime available",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter invalid email and passord",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see an error message",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter valid email and passord",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I am logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I am on the risknet reltime home page",
  "keyword": "And "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 6557572714,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_have_risknet_realtime_available()"
});
formatter.result({
  "duration": 97844780,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_enter_invalid_email_and_passord()"
});
formatter.result({
  "duration": 484025878,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_see_an_error_message()"
});
formatter.result({
  "duration": 36817517,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_enter_valid_email_and_passord()"
});
formatter.result({
  "duration": 583096477,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_am_logged_in()"
});
formatter.result({
  "duration": 267805632,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_am_on_the_risknet_reltime_home_page()"
});
formatter.result({
  "duration": 695161322,
  "status": "passed"
});
});