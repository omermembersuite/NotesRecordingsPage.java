@smoke
Feature: Testing Thumbnails
  In order to perform successful login
  As a user
  I want to enter correct username and password
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room "112314"
    When user should be able to click "go Live!"
    Then user should be able to click botton hidden bar


  Scenario: In order to verify Show and Hide Thumbnails
    When user should be able to click Hide Thumbnails
    Then user should be able to click botton hidden bar
    Then user should be able to click Show Thumbnails
    Then user should be able to see Thumbnails element
