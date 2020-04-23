$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Free HRMOrangeApplication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HRMOrange Application Demo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@demo1"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the login pgae is OrangeHRM",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.title_of_the_login_page_is_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicks on Logout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@demo2"
    }
  ]
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user make mouse hover on Welcome Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_make_mouse_hover_on_Welcome_Admin()"
});
formatter.result({
  "error_message": "org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds\n  (Session info: chrome\u003d81.0.4044.113)\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027POOJA-17125\u0027, ip: \u0027192.168.43.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.113, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:61749}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: fd14cf07f0c63f2c0b334b014e062de0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat StepDefinition.LoginStepDefinition.user_make_mouse_hover_on_Welcome_Admin(LoginStepDefinition.java:112)\r\n\tat ✽.user make mouse hover on Welcome Admin(file:///E:/JavaSelenium/BDDCucumberFramework/src/test/java/Features/Login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on Logout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_clicks_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "user Check when you forgot the password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@demo3"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the login pgae is OrangeHRM",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.title_of_the_login_page_is_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Forgot your password",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_clicks_on_Forgot_your_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the Username",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_enters_the_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Reset Password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_clicks_on_Reset_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.LoginStepDefinition.user_clicks_on_Cancel()"
});
formatter.result({
  "status": "passed"
});
});