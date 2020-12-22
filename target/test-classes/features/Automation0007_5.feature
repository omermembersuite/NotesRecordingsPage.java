@smoke
Feature: Testing Room Settings on More
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
    When user should be able to login click draw tool
    Then user should be able to click botton hidden bar


  Scenario: In order to verify More
    When user should able to click More on the hidden bar
    When user should be able to click Room Settings on more section
    Then user should be able to see Room setup and Permissions
    When user should be able to click permissions
    Then user should be able to see Thi is an upcoming on permissions
    Then user should be able to save on room settings
