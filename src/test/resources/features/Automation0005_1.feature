@smoke
Feature: Testing Fullscreen
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
    Then user should be able to click botton hidden bar


  Scenario: In order to verify enable and disable FullScreen
    When user should be able to click enable Fullscreen on hiddenbar
    Then user should be able to click botton hidden bar
    Then user should be able to click disable Fullscreen on hiddenbar

