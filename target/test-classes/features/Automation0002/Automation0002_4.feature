@0002_4
Feature: Testing Draw tools-Text Font Size
  I should be able to see Text and Text Font Size Functionalities
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
    When user should able to click Text on draw tool
    Then user should be able to see Font Family, Font Size, Bold, Italicize
    When user should be able to click Font Size on Text
    Then user should be able to click tenpx
    When user should be able to click Font Size on Text
    Then user should be able to click twelvepx
    When user should be able to click Font Size on Text
    Then user should be able to click fourteenpx
    When user should be able to click Font Size on Text
    Then user should be able to click eighteenpx
    When user should be able to click Font Size on Text
    Then user should be able to click twentyfourpx
    When user should be able to click Font Size on Text
    Then user should be able to click thirtytwopx
    When user should be able to click Font Size on Text
    Then user should be able to click fourtyeightpx
    When user should be able to click Font Size on Text
    Then user should be able to click sixtyfourpx
    When user should be able to click Font Size on Text
    Then user should be able to click eightypx
    When user should be able to click Font Size on Text
    Then user should be able to click twelvehundpx

