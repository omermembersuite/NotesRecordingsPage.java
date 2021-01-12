@0006_1
Feature: Testing Record Session
  I should be able to see Record Session Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar

  Scenario: In order to verify Record Session
    When user should able to click Record Session on hidden bar
    Then user should be able to see Start Recording
    When user should be able to click Start on Start Recording
    Then user should be able to click button hidden bar
    When user should be able to click Stop Recording session on hidden bar
    Then user should be able to see Record Stopped warning

