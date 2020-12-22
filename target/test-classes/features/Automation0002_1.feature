@smoke
Feature: Testing Draw tools-Draw
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


  Scenario: In order to verify enter Go Live page
    When user should be able to login click draw tool
    Then user should be able to see Annotations
    Then user should be able to see "Draw, Shapes, Text, Color, Stroke, Eraser, Clear All"

  Scenario: In order to verify Draw size
    When user should able to click Draw on draw tool
    Then user should be able to see draw size circle
    Then user should be able to click pin on tools
    Then user should be able to click side drawer pinned tool on tools
    Then user should be able to click close on tools tab




