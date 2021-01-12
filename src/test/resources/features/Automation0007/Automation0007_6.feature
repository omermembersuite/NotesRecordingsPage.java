@0007_6
Feature: Testing Screen Share setting on More
  I should be able to see ScreenShare on More Functionalities
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar


  Scenario: In order to verify Screen Share on More
    When user should able to click More on the hidden bar
    When user should be able to click Screenshare on more section
    Then user should be able to see Screenshare settings
    Then user should be able to choose foureightp screenshare quality
    Then user should be able to choose seventwop screenshare quality
    Then user should be able to choose onehundeightyp screenshare quality
    Then user should be able to close screenshare settings
    Then user should be able to click button hidden bar
    When user should able to click More on the hidden bar
    Then user should be able to click Stop Screenshare on more section

