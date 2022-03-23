
Feature: GMI_Bank

  Scenario Outline: login_test
    Given user on the GMI main page
    And user clicks on the login dropdown
    And user click on the sign in button
    And user sends username like "<username>"
    And user sends password like "<password>"
    And user click on the second sign in button




    Examples:
    |username|password|
    |gino.wintheiser|%B6B*q1!TH|
