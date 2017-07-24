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
  "name": "I select \u003cfeature\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access \u003cfeature\u003e",
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
  "name": "I select alerts",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access alerts",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 6605202253,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 632324840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alerts",
      "offset": 9
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 2062061286,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alerts",
      "offset": 20
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 872190353,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: \nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AIWRK0077\u0027, ip: \u002710.0.95.44\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\BHANUV~1.AIC\\AppData\\Local\\Temp\\rust_mozprofile.JMhYVJ9lVnfv, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d54.0.1, platformVersion\u003d10.0, moz:processID\u003d14612.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 0af12e6a-4691-4b5c-9102-772b7bb3c554\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.ai.RiskNet.RT.web.utilities.ClickElementsMethods.click(ClickElementsMethods.java:22)\r\n\tat com.ai.RiskNet.RT.web.App.Steps.AppLoginSteps.i_am_able_to_access(AppLoginSteps.java:160)\r\n\tat ✽.Then I am able to access alerts(AppLogin.feature:22)\r\n",
  "status": "failed"
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
  "name": "I select rules",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access rules",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 357622619,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 11021230193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 9
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 1859229781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 20
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 868601420,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: \nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AIWRK0077\u0027, ip: \u002710.0.95.44\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\BHANUV~1.AIC\\AppData\\Local\\Temp\\rust_mozprofile.JMhYVJ9lVnfv, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d54.0.1, platformVersion\u003d10.0, moz:processID\u003d14612.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 0af12e6a-4691-4b5c-9102-772b7bb3c554\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.ai.RiskNet.RT.web.utilities.ClickElementsMethods.click(ClickElementsMethods.java:22)\r\n\tat com.ai.RiskNet.RT.web.App.Steps.AppLoginSteps.i_am_able_to_access(AppLoginSteps.java:165)\r\n\tat ✽.Then I am able to access rules(AppLogin.feature:22)\r\n",
  "status": "failed"
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
  "name": "I select statistics",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am able to access statistics",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_the_risknet_realtime()"
});
formatter.result({
  "duration": 367370790,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginSteps.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 6912504434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "statistics",
      "offset": 9
    }
  ],
  "location": "AppLoginSteps.i_select(String)"
});
formatter.result({
  "duration": 1967972218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "statistics",
      "offset": 20
    }
  ],
  "location": "AppLoginSteps.i_am_able_to_access(String)"
});
formatter.result({
  "duration": 914805970,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: \nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027AIWRK0077\u0027, ip: \u002710.0.95.44\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\BHANUV~1.AIC\\AppData\\Local\\Temp\\rust_mozprofile.JMhYVJ9lVnfv, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d54.0.1, platformVersion\u003d10.0, moz:processID\u003d14612.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 0af12e6a-4691-4b5c-9102-772b7bb3c554\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.ai.RiskNet.RT.web.utilities.ClickElementsMethods.click(ClickElementsMethods.java:22)\r\n\tat com.ai.RiskNet.RT.web.App.Steps.AppLoginSteps.i_am_able_to_access(AppLoginSteps.java:170)\r\n\tat ✽.Then I am able to access statistics(AppLogin.feature:22)\r\n",
  "status": "failed"
});
});