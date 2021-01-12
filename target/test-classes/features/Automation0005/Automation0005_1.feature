@Smoke
@0005_1
Feature: Testing Fullscreen
  I should be able to see FullScreen Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify enable and disable FullScreen
    When user should be able to click enable Fullscreen on hiddenbar
    Then user should be able to click button hidden bar
    Then user should be able to click disable Fullscreen on hiddenbar

