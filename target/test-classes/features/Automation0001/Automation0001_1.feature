@Smoke
@0001_1

Feature: Login the Go Live
  In order to perform successful login
  As a user
  I should be able to login with correct credentials
Background:

  When User is on the Login page
  Then User enters username
  Then User enters password
  Then User click on Log in button

 Scenario: In order to verify enter Go Live page
    When user should be able to login into existing room
    Then user should be able to see Welcome to the Lobby on the page
    Then user should be able to click disable microphone
    Then user should be able to click disable camera
    When user should be able to Open device selection before go live
    Then user should be able to see Device Selection before go live
    Then user should be able to choose low webcam quality before go live
    Then user should be able to choose medium webcam quality before go live
    Then user should be able to choose high webcam quality before go live
    Then user should be able to close camera on device selection before go live
    Then user should be able to close microphone on device selection before go live
    Then user should be able to close Audio output on device selection before go live
    Then user should be able to save device selection before go live



