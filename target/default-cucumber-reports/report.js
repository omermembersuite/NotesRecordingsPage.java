$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Automation0001/Automation0001_1.feature");
formatter.feature({
  "name": "Login the Go Live",
  "description": "  In order to perform successful login\n  As a user\n  I should be able to login with correct credentials",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@0001_1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Login page",
  "keyword": "When "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_is_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log in button",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_click_on_Log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In order to verify enter Go Live page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@0001_1"
    }
  ]
});
formatter.step({
  "name": "user should be able to login into existing room",
  "keyword": "When "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_login_into_existing_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see Welcome to the Lobby on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_see_Welcome_to_the_Lobby_on_the_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027omers-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:460:6d5a:cf16:5ecf%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: /var/folders/1x/ny6f19h95wv...}, goog:chromeOptions: {debuggerAddress: localhost:56077}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b683c55b8590b97377e0828ef8a9fe15\n*** Element info: {Using\u003dxpath, value\u003d//*[@class\u003d\u0027lobby-subtitle\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\n\tat EvercastAutomation.StepDefinitions.Automation0001.Automation0001_1StepDefs.user_should_be_able_to_see_Welcome_to_the_Lobby_on_the_page(Automation0001_1StepDefs.java:55)\n\tat ✽.user should be able to see Welcome to the Lobby on the page(file:src/test/resources/features/Automation0001/Automation0001_1.feature:17)\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be able to click disable microphone",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_click_disable_microphone()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to click disable camera",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_click_disable_camera()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to Open device selection before go live",
  "keyword": "When "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_Open_device_selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to see Device Selection before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_see_Device_Selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to choose low webcam quality before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_choose_low_webcam_quality_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to choose medium webcam quality before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_choose_medium_webcam_quality_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to choose high webcam quality before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_choose_high_webcam_quality_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to close camera on device selection before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_close_camera_on_device_selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to close microphone on device selection before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_close_microphone_on_device_selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to close Audio output on device selection before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_close_Audio_output_on_device_selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to save device selection before go live",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation0001_1StepDefs.user_should_be_able_to_save_Device_Selection_before_go_live()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d87.0.4280.141)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027omers-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:460:6d5a:cf16:5ecf%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: /var/folders/1x/ny6f19h95wv...}, goog:chromeOptions: {debuggerAddress: localhost:56077}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b683c55b8590b97377e0828ef8a9fe15\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat EvercastAutomation.StepDefinitions.Hook.teardown(Hook.java:29)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\n",
  "status": "failed"
});
});