@0007_1
Feature: Testing More on Hidden bar
  I should be able to More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar

  Scenario: In order to verify More
    When user should able to click More on the hidden bar
    Then user should be able to see Room access, Device Selection, EBS Stream keys, Room Settings, Screenshare, Browser stream, Get Support

