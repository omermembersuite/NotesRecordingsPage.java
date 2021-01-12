@0004_1
Feature: Testing Thumbnails
  I should be able to see Thumbnails Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Show and Hide Thumbnails
    When user should be able to click Hide Thumbnails
    Then user should be able to click button hidden bar
    Then user should be able to click Show Thumbnails
    Then user should be able to see Thumbnails element
