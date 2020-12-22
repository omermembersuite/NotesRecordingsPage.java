@smoke
Feature: Testing Draw tools-Text Font Size-Negative
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

  Scenario: In order to verify Text
    When user should able to click Text on draw tool
    Then user should be able to see "Font Family, Font Size, Bold, Italicize"
    When user should be able to click Bold on Text
    Then user should be able to click Bold
    Then user should be able to click Italicize