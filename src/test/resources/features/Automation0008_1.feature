@smoke
Feature: Testing Leave on Screen
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
    When user should be able to login click draw tool
    Then user should be able to click botton hidden bar


  Scenario: In order to Leave on Hidden bar
    When user should able to click to Leave on screen
    Then user should be able to see do you want leave message
    Then user should be able to click yes leave screen on hidden bar