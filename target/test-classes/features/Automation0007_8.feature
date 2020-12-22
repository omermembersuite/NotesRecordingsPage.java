@smoke
Feature: Testing Getting support on More
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


  Scenario: In order to verify Get Support on More
    When user should able to click More on the hidden bar
    When user should be able to click Get support on more
    Then user should be able to see Browser Stream
    Then user should be switch to chat screen
    When user should be able to click chat on new frame on chat screen
    Then user should be able to fill name on chat screen
    Then user should be able to fill email on chat screen
    Then user should be able to fill message on chat screen