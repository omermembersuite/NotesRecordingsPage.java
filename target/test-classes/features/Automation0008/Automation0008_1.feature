@0008_1
Feature: Testing Leave on Screen
  I should be able to test Exit functionalities on Hidden Bar
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to Exit on Hidden bar
    When user should able to click to Exit on page
    Then user should be able to see do you want leave message
    Then user should be able to click yes Exit screen on hidden bar