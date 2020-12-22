@smoke
Feature: Login the Live Page
  In order to perform sucessful login
  As a user
  I want to enter correct username and password
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room "112314"

  Scenario: In order to verify hidden bar tools
    When user should be able to click "go Live!"
    Then user should be able to click botton hidden bar
    Then user should be able to see "Leave, Enable Microphone, Enable Camera, Enable Audio, Draw Tool, Notes&Recordings, Hide Thumbnails, Enable Fullscreen, Record Session, More"
