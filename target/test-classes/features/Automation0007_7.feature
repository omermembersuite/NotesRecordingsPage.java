@smoke
Feature: Testing Browser Stream on More
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


  Scenario: In order to verify Browser Stream on More
    When user should able to click More on the hidden bar
    When user should be able to click Browser Stream on more
    Then user should be able to see Browser Stream
    Then user should be able to Do not use screen share if you are ... warning on browser stream
    Then user should be able to choose default one video source on browser stream
    Then user should be able to choose default one audio source on browser stream
    Then user should be able to choose 480p resolution source on browser stream
    Then user should be able to click to start on browser stream
    Then user should be able to see thumbnail of browsershare stream on screen
    When user should able to click More on the hidden bar
    Then user should be able to click Stop Screenshare on more section