$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DemoNegative.feature");
formatter.feature({
  "name": "Testing Fullscreen Negative effect",
  "description": "  In order to perform successful login\n  As a user\n  I should be able to disable FullScreen",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DemoNegative"
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
  "location": "GoLiveStepDefinitions.user_is_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log in button",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_click_on_Log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login into existing room",
  "keyword": "When "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_should_be_able_to_login_into_existing_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click go Live!",
  "keyword": "When "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_click_go_Live()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click botton hidden bar",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_click_botton_hidden_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In order to verify enable and disable FullScreen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DemoNegative"
    }
  ]
});
formatter.step({
  "name": "user should be able to click enable Fullscreen on hiddenbar",
  "keyword": "When "
});
formatter.match({
  "location": "DemoNegativeStepDef.user_should_be_able_to_click_enable_Fullscreen_on_hiddenbar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click botton hidden bar",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_click_botton_hidden_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click disable Fullscreen on hiddenbar",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoNegativeStepDef.user_should_be_able_to_click_disable_Fullscreen_on_hiddenbar()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected null, but was:\u003cProxy element for: DefaultElementLocator \u0027By.xpath: //*[@title\u003d\u0027Enable Fullscreen \u0027]\u0027\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotNull(Assert.java:755)\n\tat org.junit.Assert.assertNull(Assert.java:737)\n\tat org.junit.Assert.assertNull(Assert.java:747)\n\tat EvercastAutomation.StepDefinitions.DemoNegativeStepDef.user_should_be_able_to_click_disable_Fullscreen_on_hiddenbar(DemoNegativeStepDef.java:29)\n\tat ✽.user should be able to click disable Fullscreen on hiddenbar(file:src/test/resources/features/DemoNegative.feature:20)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DemoPositive.feature");
formatter.feature({
  "name": "Writing Text On Screen-Positive",
  "description": "  In order to perform sucessful login\n  As a user\n  I should be able to login with correct credentials",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DemoPositive"
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
  "location": "GoLiveStepDefinitions.user_is_on_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log in button",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_click_on_Log_in_button()"
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
      "name": "@DemoPositive"
    }
  ]
});
formatter.step({
  "name": "user should be able to login into existing room",
  "keyword": "When "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_should_be_able_to_login_into_existing_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see Welcome to the Lobby on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_should_be_able_to_see_Welcome_to_the_Lobby_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click disable microphone",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_should_be_able_to_click_disable_microphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click disable camera",
  "keyword": "Then "
});
formatter.match({
  "location": "GoLiveStepDefinitions.user_should_be_able_to_click_disable_camera()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click go Live!",
  "keyword": "When "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_click_go_Live()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click botton hidden bar",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_click_botton_hidden_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login click draw tool",
  "keyword": "When "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_login_click_draw_tool()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see Draw, Shapes, Text, Color, Stroke, Eraser, Clear All",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoPositiveStepDef.user_should_be_able_to_see_Draw_Shapes_Text_Color_Stroke_Eraser_Clear_All()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});