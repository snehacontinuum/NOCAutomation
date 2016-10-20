$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BVT/GenerateTicketBVT.feature");
formatter.feature({
  "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status",
  "description": "",
  "name": "As a user status I want to create ticket on NOC with different status",
  "keyword": "Feature",
  "line": 1
});
formatter.scenarioOutline({
  "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status;verify-ticket-created-in-noc",
  "tags": [
    {
      "name": "@BVTTest",
      "line": 7
    }
  ],
  "description": "",
  "name": "Verify ticket created in NOC",
  "keyword": "Scenario Outline",
  "line": 8,
  "type": "scenario_outline"
});
formatter.step({
  "name": "User is able to create ticket in NOC portal for \"\u003cMember\u003e\", \"\u003cSite\u003e\",\"\u003cResource\u003e\" with status in \"\u003cStatus\u003e\"",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "Verify ticket created in Database",
  "keyword": "Then ",
  "line": 10
});
formatter.examples({
  "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status;verify-ticket-created-in-noc;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 13,
  "rows": [
    {
      "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status;verify-ticket-created-in-noc;;1",
      "cells": [
        "Member",
        "Site",
        "Status"
      ],
      "line": 14
    },
    {
      "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status;verify-ticket-created-in-noc;;2",
      "cells": [
        "CMSPL32",
        "Georgia",
        "New"
      ],
      "line": 15
    }
  ]
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "Open NOC application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "User is login to NOC portal",
  "keyword": "And ",
  "line": 5
});
formatter.match({
  "location": "StepDefinations.openApplication()"
});
formatter.result({
  "duration": 3561189844,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_is_login_to_NOC_portal()"
});
formatter.result({
  "duration": 31578301945,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-user-status-i-want-to-create-ticket-on-noc-with-different-status;verify-ticket-created-in-noc;;2",
  "tags": [
    {
      "name": "@BVTTest",
      "line": 7
    }
  ],
  "description": "",
  "name": "Verify ticket created in NOC",
  "keyword": "Scenario Outline",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "User is able to create ticket in NOC portal for \"CMSPL32\", \"Georgia\",\"\u003cResource\u003e\" with status in \"New\"",
  "keyword": "When ",
  "line": 9,
  "matchedColumns": [
    0,
    1,
    2
  ]
});
formatter.step({
  "name": "Verify ticket created in Database",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "CMSPL32",
      "offset": 49
    },
    {
      "val": "Georgia",
      "offset": 60
    },
    {
      "val": "\u003cResource\u003e",
      "offset": 70
    },
    {
      "val": "New",
      "offset": 98
    }
  ],
  "location": "StepDefinations.user_is_able_to_create_ticket_in_NOC_portal_for_with_status_in(String,String,String,String)"
});
formatter.result({
  "duration": 8158493338,
  "status": "failed",
  "error_message": "java.lang.AssertionError: Not able to locate element : Generate New ticket btn with locator ://table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027]\r\n\tat org.testng.Assert.fail(Assert.java:83)\r\n\tat continuum.cucumber.WebdriverWrapper.getWebElement(WebdriverWrapper.java:125)\r\n\tat continuum.cucumber.WebdriverWrapper.clickElement(WebdriverWrapper.java:834)\r\n\tat continuum.cucumber.Page.NocHomePage.gotToGenerateTicket(NocHomePage.java:93)\r\n\tat continuum.cucumber.stepDefinations.StepDefinations.user_is_able_to_create_ticket_in_NOC_portal_for_with_status_in(StepDefinations.java:78)\r\n\tat ✽.When User is able to create ticket in NOC portal for \"CMSPL32\", \"Georgia\",\"\u003cResource\u003e\" with status in \"New\"(BVT/GenerateTicketBVT.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to find element with xpath \u003d\u003d //table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027] (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 425 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027RMM-LT-618\u0027, ip: \u002710.2.60.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_79\u0027\n*** Element info: {Using\u003dxpath, value\u003d//table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027]}\nSession ID: f565226b-460e-4b51-ae71-2a73702f052e\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{platform\u003dWINDOWS, javascriptEnabled\u003dtrue, elementScrollBehavior\u003d0, ignoreZoomSetting\u003dfalse, enablePersistentHover\u003dfalse, ie.ensureCleanSession\u003dfalse, browserName\u003dinternet explorer, enableElementCacheCleanup\u003dtrue, unexpectedAlertBehaviour\u003ddismiss, version\u003d11, ie.usePerProcessProxy\u003dfalse, ignoreProtectedModeSettings\u003dtrue, cssSelectorsEnabled\u003dtrue, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:6916/, handlesAlerts\u003dtrue, ie.forceCreateProcessApi\u003dfalse, nativeEvents\u003dtrue, browserAttachTimeout\u003d0, ie.browserCommandLineSwitches\u003d, takesScreenshot\u003dtrue}]\nCommand duration or timeout: 805 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027RMM-LT-618\u0027, ip: \u002710.2.60.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_79\u0027\n*** Element info: {Using\u003dxpath, value\u003d//table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027]}\nSession ID: 84aff8e9-fdfd-4a52-9f9b-171b52ca1326\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{platform\u003dWINDOWS, javascriptEnabled\u003dtrue, elementScrollBehavior\u003d0, ignoreZoomSetting\u003dfalse, enablePersistentHover\u003dfalse, ie.ensureCleanSession\u003dfalse, browserName\u003dinternet explorer, enableElementCacheCleanup\u003dtrue, unexpectedAlertBehaviour\u003ddismiss, webdriver.remote.sessionid\u003d84aff8e9-fdfd-4a52-9f9b-171b52ca1326, version\u003d11, ie.usePerProcessProxy\u003dfalse, ignoreProtectedModeSettings\u003dtrue, cssSelectorsEnabled\u003dtrue, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:6916/, handlesAlerts\u003dtrue, ie.forceCreateProcessApi\u003dfalse, nativeEvents\u003dtrue, browserAttachTimeout\u003d0, ie.browserCommandLineSwitches\u003d, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:526)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat continuum.cucumber.WebdriverWrapper.getWebElement(WebdriverWrapper.java:110)\r\n\tat continuum.cucumber.WebdriverWrapper.clickElement(WebdriverWrapper.java:834)\r\n\tat continuum.cucumber.Page.NocHomePage.gotToGenerateTicket(NocHomePage.java:93)\r\n\tat continuum.cucumber.stepDefinations.StepDefinations.user_is_able_to_create_ticket_in_NOC_portal_for_with_status_in(StepDefinations.java:78)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:606)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat continuum.cucumber.testRunner.TestRunner.feature(TestRunner.java:72)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:606)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\r\n\tat org.testng.TestRunner.run(TestRunner.java:632)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.run(TestNG.java:1064)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:295)\r\n\tat org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:84)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:90)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027RMM-LT-618\u0027, ip: \u002710.2.60.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_79\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:138)\r\n\t... 53 more\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to find element with xpath \u003d\u003d //table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027] (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 425 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027RMM-LT-618\u0027, ip: \u002710.2.60.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_79\u0027\n*** Element info: {Using\u003dxpath, value\u003d//table[@class\u003d\u0027dmSubmenu\u0027]//table[@class\u003d\u0027dmItem1\u0027]//td[@id\u003d\u0027dm0m6i2tdT\u0027]}\nSession ID: f565226b-460e-4b51-ae71-2a73702f052e\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{platform\u003dWINDOWS, javascriptEnabled\u003dtrue, elementScrollBehavior\u003d0, ignoreZoomSetting\u003dfalse, enablePersistentHover\u003dfalse, ie.ensureCleanSession\u003dfalse, browserName\u003dinternet explorer, enableElementCacheCleanup\u003dtrue, unexpectedAlertBehaviour\u003ddismiss, version\u003d11, ie.usePerProcessProxy\u003dfalse, ignoreProtectedModeSettings\u003dtrue, cssSelectorsEnabled\u003dtrue, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:6916/, handlesAlerts\u003dtrue, ie.forceCreateProcessApi\u003dfalse, nativeEvents\u003dtrue, browserAttachTimeout\u003d0, ie.browserCommandLineSwitches\u003d, takesScreenshot\u003dtrue}]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027RMM-LT-618\u0027, ip: \u002710.2.60.170\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_79\u0027\nDriver info: driver.version: EventFiringWebDriver\r\n\tat sun.reflect.GeneratedConstructorAccessor27.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.GeneratedMethodAccessor16.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy1.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:48)\r\n\tat org.openqa.selenium.remote.server.handler.FindElement.call(FindElement.java:1)\r\n\tat java.util.concurrent.FutureTask.run(Unknown Source)\r\n\tat org.openqa.selenium.remote.server.DefaultSession$1.run(DefaultSession.java:176)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)\r\n\tat java.lang.Thread.run(Unknown Source)\r\n"
});
formatter.match({
  "location": "StepDefinations.verify_ticket_created_in_Database()"
});
formatter.result({
  "status": "skipped"
});
});