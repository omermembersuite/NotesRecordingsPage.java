@smoke
Feature: Testing Room access on More
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


  Scenario: In order to verify More
    When user should able to click More on the hidden bar
    When user should be able to click Room access on more section
    Then user should be able to see "Room access"
    Then user should be able to see "Room link to share"
    When user should be able to click on Invite People
    Then user should be able to write usernameevercast@gmail.com
    And user should be able to click on add on room access
    Then user should be able to see Invite Create Successfully
    Then user should be able to remove usernameevercast@gmail.com
    Then user should be able to see Invite Deleted Successfully
    Then user should be able to close room access on more section




