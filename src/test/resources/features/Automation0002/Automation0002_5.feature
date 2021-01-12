@0002_5
Feature: Testing Draw tools-Bold-Italicize
  I should be able to see Bold-Italicize Family Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Text
    When user should be able to login click draw tool
    When user should be able to click Text on draw tool
    Then user should be able to see Font Family, Font Size, Bold, Italicize
    Then user should be able to click Bold on Text
    Then user should be able to click Italicize