@smoke
Feature: Testing Notes &Recordings
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


  Scenario: In order to verify Notes&Recordings; edit and delete
    When user should be able to click Notes&Recordings on button bar
    Then user should be able to see "Chat, Notes" on Notes & Recordings
    Then user should be able to see "Write a message here. Press Enter to submit"
    Then user should be able to click Chat area
    Then user should be able to write "Welcome Evercast Demo"
    When user should be able to enter on chat screen
    Then user should be able to see "Welcome Evercast Demo"
    When user should able to click three points on chat screen
    Then user should be able to see "edit, delete"
    When user should be able to click "delete" on chat screen
    Then user should be able to see "Are you sure you want to delete this message?"
    Then user should be able to click "Yes" on chat screen delete choose
    When user should be able to click "Notes" on Notes & Recordings
    Then user should be able to see "This is an upcoming feature."
    Then user should be able to click botton hidden bar
    When user should be able to click Notes&Recordings on button bar

