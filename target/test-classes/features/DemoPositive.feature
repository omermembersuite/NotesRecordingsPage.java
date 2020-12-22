@DemoPositive
Feature: Writing Text On Screen-Positive
  In order to perform sucessful login
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
    When user should be able to click go Live!
    Then user should be able to click botton hidden bar
    When user should be able to login click draw tool
    Then user should be able to see Draw, Shapes, Text, Color, Stroke, Eraser, Clear All

