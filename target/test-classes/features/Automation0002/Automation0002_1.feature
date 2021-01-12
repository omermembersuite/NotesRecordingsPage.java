@0002_1
Feature: Testing Draw tools-Draw
  I should be able to see Draw Tool and functions
  Background:

    When User is on the Login page
    Then User enters username
    Then User enters password
    Then User click on Log in button
    When user should be able to login into existing room
    When user should be able to click go Live!
    Then user should be able to click button hidden bar

  Scenario: In order to verify Draw size
    When user should be able to login click draw tool
    Then user should be able to see Annotations
    When user should able to click Draw on draw tool
    Then user should be able to see draw size circle
    Then user should be able to click pin on tools
    Then user should be able to click side drawer pinned tool on tools
    Then user should be able to click close on tools tab




