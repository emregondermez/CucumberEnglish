Feature: _Scenario_Outline

  Background: user_on_google_page
    Given user on the google page

    Scenario Outline: multiple data testing
      When user search for "<Keyword>"
      And  verify the result has "<Keyword>" related results
      Then user close the application

      Examples: test_data
      |Keyword|
      |apple|
      |tesla|
      |tap|
      |broadway|

      # Q5Y75Q26FqNqRaW.