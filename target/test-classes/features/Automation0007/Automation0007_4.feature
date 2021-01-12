@0007_4
Feature: Testing EBS stream keys on More
  I should be able to EBS stream keys on More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify EBS Stream key
    When user should able to click More on the hidden bar
    When user should be able to click EBS stream keys on more section
    Then user should be able to see EBS keys on screen
    Then user should be able to see Once you have downloaded and installed EBS message
    Then user should be able to clickable downloaded page
    Then user should be able to clickable click here page
    Then user should be able to click server name copy
    Then user should be able to click server room copy
    Then user should be able to click show stream key
    Then user should be able to click refresh stream key
    Then user should be able to click close on Ebs Key on More
