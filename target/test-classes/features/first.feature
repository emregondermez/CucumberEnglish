Feature: first


  @first
  Scenario: us01

    Given user on the google page
    When user search for iphone
    Then verify the result has iphone related results
    And user close the application

