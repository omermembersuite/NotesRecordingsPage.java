@smoke
Feature: Testing Screen Share setting on More
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


  Scenario: In order to verify Screen Share on More
    When user should able to click More on the hidden bar
    When user should be able to click Screenshare on more section
    Then user should be able to see Screenshare settings
    Then user should be able to choose 480p screenshare quality
    Then user should be able to choose 720p screenshare quality
    Then user should be able to choose 1080p screenshare quality
    Then user should be able to close screenshare settings
    Then user should be able to click botton hidden bar
    When user should able to click More on the hidden bar
    Then user should be able to click Stop Screenshare on more section

