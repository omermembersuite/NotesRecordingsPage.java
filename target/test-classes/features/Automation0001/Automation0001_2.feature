@0001_2
Feature: Login the Live Page
  I should be able to see hidden bar tools functions
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room

  Scenario: In order to verify hidden bar tools
    When user should be able to click go Live!
    Then user should be able to click button hidden bar
    Then user should be able to see Leave, Enable Microphone, Enable Camera, Enable Audio, Draw Tool, Notes&Recordings, Hide Thumbnails, Enable Fullscreen, Record Session, More
