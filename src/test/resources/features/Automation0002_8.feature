@smoke
Feature: Testing Draw tools-Stroke
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

  Scenario: In order to verify Clear All
    When user should able to click Clear All on draw tool
    Then user should be able to see "Are you sure you want to clear all annotations? you will not be able to access them after cleaning."
    Then user should be able to click yes on clear all tab