@0007_5
Feature: Testing Room Settings on More
  I should be able to EBS stream keys on More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify More
    When user should able to click More on the hidden bar
    When user should be able to click Room Settings on more section
    Then user should be able to see Room setup and Permissions
    When user should be able to click permissions
    Then user should be able to see This is an upcoming on permissions
    Then user should be able to save on room settings on more
