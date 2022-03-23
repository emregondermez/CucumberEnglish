Feature: Parametrizing_Test


    Background: user_on_the_google_page
      Given user on the google page
  @Parametrizing
  Scenario: US2
    When user search for "iphone"
    And verify the result has "iphone" related results
    And user close the application


  @Parametrizing
  Scenario: US3
    When user search for "apple"
    And verify the result has "apple" related results
    Then user close the application