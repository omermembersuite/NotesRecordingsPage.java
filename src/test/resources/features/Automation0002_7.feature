@smoke
Feature: Testing Draw tools-Stroke
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

  Scenario: In order to verify Stroke
    When user should able to click Stroke on draw tool
    Then user should be able to see "R232"
    Then user should be able to see "G96"
    Then user should be able to see "B65"
    Then user should be able to see "A1"
    When user should be able to click "Stroke Arrow"
    Then user should be able to see "11"
    Then user should be able to see "78%"
    Then user should be able to see "58%"
    Then user should be able to see "1A"
    Then user should be able to "HEX"