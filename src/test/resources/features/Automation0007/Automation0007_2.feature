@0007_2
Feature: Testing Room access on More
  I should be able to click Room access on More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Room Access
    When user should able to click More on the hidden bar
    When user should be able to click Room access on more section
    Then user should be able to see Room access
    Then user should be able to see Room link to share
    When user should be able to click on Invite People
    And user should be able to click on add on room access
    Then user should be able to see Invite Create Successfully
    Then user should be able to remove usernameevercast@gmail.com
    Then user should be able to see Invite Deleted Successfully
    Then user should be able to close room access on more section




