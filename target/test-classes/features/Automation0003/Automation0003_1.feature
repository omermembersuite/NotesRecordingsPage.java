@0003_1
Feature: Testing Notes &Recordings
  I should be able to see Notes&Recordings Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Notes&Recordings;
    When user should be able to click Notes&Recordings on button bar
    Then user should be able to see Chat, Notes on Notes & Recordings
    Then user should be able to click Chat area
    When user should be able to click Notes on Notes & Recordings
    Then user should be able to see This is an upcoming feature.
    Then user should be able to click button hidden bar
    When user should be able to click Notes&Recordings on button bar

