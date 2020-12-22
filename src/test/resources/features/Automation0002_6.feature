@smoke
Feature: Testing Draw tools-Color
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

  Scenario: In order to verify Color
    When user should able to click Color on draw tool
    Then user should be able to see "R146"
    Then user should be able to see "G56"
    Then user should be able to see "B56"
    Then user should be able to see "A0"
    When user should be able to click "Color Arrow"
    Then user should be able to see "0H"
    Then user should be able to see "45%"
    Then user should be able to see "40%"
    Then user should be able to see "0A"

