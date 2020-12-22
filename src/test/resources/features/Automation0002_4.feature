@smoke
Feature: Testing Draw tools-Text Font Size
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
    When user should be able to click Font Size on Text
    Then user should be able to click "10px"
    When user should be able to click Font Size on Text
    Then user should be able to click "12px"
    When user should be able to click Font Size on Text
    Then user should be able to click "14px"
    When user should be able to click Font Size on Text
    Then user should be able to click "18px"
    When user should be able to click Font Size on Text
    Then user should be able to click "24px"
    When user should be able to click Font Size on Text
    Then user should be able to click "32px"
    When user should be able to click Font Size on Text
    Then user should be able to click "48px"
    When user should be able to click Font Size on Text
    Then user should be able to click "64px"
    When user should be able to click Font Size on Text
    Then user should be able to click "80px"
    When user should be able to click Font Size on Text
    Then user should be able to click "120px"

