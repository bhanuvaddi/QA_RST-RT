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
formatter.match({
  "location": "AppLoginSteps.i_navigate_to_to_RiskNet_RealTime_web_application()"
});
formatter.result({
  "duration": 227705488,
  "error_message": "java.lang.ExceptionInInitializerError\r\n\tat com.ai.RiskNet.RT.web.App.Steps.AppLoginSteps.i_navigate_to_to_RiskNet_RealTime_web_application(AppLoginSteps.java:22)\r\n\tat ✽.Given I navigate to to RiskNet RealTime web application(AppLogin.feature:13)\r\nCaused by: java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.ie.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver. The latest version can be downloaded from http://selenium-release.storage.googleapis.com/index.html\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:738)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:124)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriverService.access$000(InternetExplorerDriverService.java:32)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriverService$Builder.findDefaultExecutable(InternetExplorerDriverService.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:330)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.setupService(InternetExplorerDriver.java:288)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:210)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:154)\r\n\tat com.ai.RiskNet.RT.web.env.Env.CreateWebDriver(Env.java:122)\r\n\tat com.ai.RiskNet.RT.web.env.BaseTest.\u003cclinit\u003e(BaseTest.java:18)\r\n\tat com.ai.RiskNet.RT.web.App.Steps.AppLoginSteps.i_navigate_to_to_RiskNet_RealTime_web_application(AppLoginSteps.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AppLoginSteps.i_enter_valid_email_and_passord()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppLoginSteps.i_am_logged_in()"
});
formatter.result({
  "status": "skipped"
});
});