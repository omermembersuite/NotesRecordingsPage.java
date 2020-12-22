@smoke
Feature: Testing Draw tools-Shapes
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
    When user should be able to login click draw tool


  Scenario: In order to verify Shapes
    When user should be able to login click draw tool
    When user should able to click Shapes on draw tool
    Then user should be able to see Shape size circle
    Then user should be able to see "Line, Arrow, Dash, Circle, Square"
    Then user should be able to click "Line" on shapes
    Then user should be able to click "Arrow" on shapes
    Then user should be able to click "Dash" on shapes
    Then user should be able to click "Circle" on shapes
    Then user should be able to click "Square" on shapes
