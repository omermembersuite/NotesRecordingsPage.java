@Smoke
@0002_8

Feature: Testing Draw tools-Eraser
  I should be able to see Eraser Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Clear All
    When user should be able to login click draw tool
    When user should able to click Clear All on draw tool
    Then user should be able to see verify message from clear All
    Then user should be able to click yes on clear all tab