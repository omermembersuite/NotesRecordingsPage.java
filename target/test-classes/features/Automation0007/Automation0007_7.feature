@Smoke
@0007_7
Feature: Testing Browser Stream on More
  I should be able to test browser stream on More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Browser Stream on More
    When user should able to click More on the hidden bar
    When user should be able to click Browser Stream on more
    Then user should be able to see Browser Stream
    Then user should be able to Do not use screen share if you ...warning on browser stream
    Then user should be able to choose default one video source on browser stream
    Then user should be able to choose default one audio source on browser stream
    Then user should be able to choose foureightyp resolution source on browser stream
    Then user should be able to click to start on browser stream
    Then user should be able to see thumbnail of browsershare stream on screen
    Then user should be able to click button hidden bar
    When user should able to click More on the hidden bar
    Then user should be able to click Stop browsershare on more section