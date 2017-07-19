$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AppLogin.feature");
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
  "comments": [
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#Scenario: Open the risknet realtime"
    },
    {
      "line": 8,
      "value": "#\t\tGiven I navigate to the risknet realtime"
    },
    {
      "line": 9,
      "value": "#\t\t When I have risknet realtime available"
    },
    {
      "line": 10,
      "value": "#\t\t Then I am able to signin"
    }
  ],
  "line": 12,
  "name": "I login with valid credentials",
  "description": "",
  "id": "risknet-realtime-login;i-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I navigate to to RiskNet RealTime web application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter valid email and passord",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I am logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});