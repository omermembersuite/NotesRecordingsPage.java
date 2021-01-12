@0007_3
Feature: Testing Device Selection on More
  I should be able to Test device selection on More Functionalities
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
    When user should be able to click Device selection on more section
    Then user should be able to see Device selection on more
    Then user should be able to choose low webcam quality on more
    Then user should be able to choose medium webcam quality on more
    Then user should be able to choose high webcam quality on more
    Then user should be able to close camera on device selection on more
    Then user should be able to close microphone on device selection on more
    Then user should be able to close Audio output on device selection on more
    Then user should be able to save device selection on more