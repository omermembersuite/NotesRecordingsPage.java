@smoke
Feature: Testing Record Session
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

  Scenario: In order to verify Record Session
    When user should able to click Record Session on hidden bar
    Then user should be able to see "Start Recording"
    When user should be able to click Start on Start Recording
    Then user should be able to see "Record Starting" warning
    Then user should be able to click botton hidden bar
    When user should be able to click Record session on hidden bar
    Then user should be able to see "Record Stopped" warning
