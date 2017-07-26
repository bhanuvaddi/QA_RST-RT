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
  "line": 8,
  "name": "Open the risknet realtime",
  "description": "",
  "id": "risknet-realtime-login;open-the-risknet-realtime",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I have risknet realtime available",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter invalid email and password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see an error message",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter valid email and password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I am logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I am on the risknet realtime home page",
  "keyword": "And "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 6956949798,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_have_risknet_realtime_available()"
});
formatter.result({
  "duration": 200675579,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_enter_invalid_email_and_password()"
});
formatter.result({
  "duration": 603557887,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_see_an_error_message()"
});
formatter.result({
  "duration": 66766028,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_enter_valid_email_and_password()"
});
formatter.result({
  "duration": 546993859,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_am_logged_in()"
});
formatter.result({
  "duration": 393108157,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_am_on_the_risknet_realtime_home_page()"
});
formatter.result({
  "duration": 6812328932,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Risknet realtime features",
  "description": "",
  "id": "risknet-realtime-login;risknet-realtime-features",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I select \"\u003cfeature\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access \"\u003cfeature\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "risknet-realtime-login;risknet-realtime-features;",
  "rows": [
    {
      "cells": [
        "feature"
      ],
      "line": 24,
      "id": "risknet-realtime-login;risknet-realtime-features;;1"
    },
    {
      "cells": [
        "alerts"
      ],
      "line": 25,
      "id": "risknet-realtime-login;risknet-realtime-features;;2"
    },
    {
      "cells": [
        "rules"
      ],
      "line": 26,
      "id": "risknet-realtime-login;risknet-realtime-features;;3"
    },
    {
      "cells": [
        "statistics"
      ],
      "line": 27,
      "id": "risknet-realtime-login;risknet-realtime-features;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Risknet realtime features",
  "description": "",
  "id": "risknet-realtime-login;risknet-realtime-features;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@RiskNetRT_WebLogin"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I select \"alerts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access \"alerts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 343391648,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 5373387305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alerts",
      "offset": 10
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 1502241239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alerts",
      "offset": 21
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 7406943031,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Risknet realtime features",
  "description": "",
  "id": "risknet-realtime-login;risknet-realtime-features;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@RiskNetRT_WebLogin"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I select \"rules\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access \"rules\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 368026677,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 5400156130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 10
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 1279396700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 21
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 7373318990,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Risknet realtime features",
  "description": "",
  "id": "risknet-realtime-login;risknet-realtime-features;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@RiskNetRT_WebLogin"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I navigate to the risknet realtime",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I select \"statistics\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access \"statistics\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 359968735,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 5377412748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "statistics",
      "offset": 10
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 1294390360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "statistics",
      "offset": 21
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 8067627180,
  "status": "passed"
});
});