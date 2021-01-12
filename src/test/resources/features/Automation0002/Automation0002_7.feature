@0002_7
Feature: Testing Draw tools-Stroke
  I should be able to see Stroke Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Stroke
    When user should be able to login click draw tool
    When user should able to click Stroke on draw tool
    Then user should be able to click Stroke Arrow
