$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SubscribePublication.feature");
formatter.feature({
  "name": "Subscribe to a Publication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SubscribePublication"
    }
  ]
});
formatter.scenario({
  "name": "In order to verify Subscribe Publication",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SubscribePublication"
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
formatter.step({
  "name": "user should be able to click shop",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscribePublicationStepDefs.user_should_be_able_to_click_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to subscribe to a publication",
  "keyword": "And "
});
formatter.match({
  "location": "SubscribePublicationStepDefs.user_should_be_able_to_subscribe_to_a_publication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to one of publications",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscribePublicationStepDefs.user_should_be_able_to_one_of_publications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to pay existing electronic payment and checkout",
  "keyword": "And "
});
formatter.match({
  "location": "SubscribePublicationStepDefs.user_should_be_able_to_pay_existing_electronic_payment_and_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});