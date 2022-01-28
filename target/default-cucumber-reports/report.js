$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginIndividualPositive.feature");
formatter.feature({
  "name": "Login Successfully",
  "description": "  In order to perform sucessful login\n  As a user\n  I should be able to login with correct credentials",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginIndividualPositive"
    }
  ]
});
formatter.scenario({
  "name": "In order to verify Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginIndividualPositive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login into users page",
  "keyword": "When "
});
formatter.match({
  "location": "DemoDonationStepDefs.user_should_be_able_to_login_into_users_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});