@userRegistration
Feature: registration feature

  Scenario Outline: user should be able to register
    Given user is on the registration page
    And user enters ssn number as "<ssn>"
    And user enters firstname as "<firstname>"
    And user enters lastname as "<lastname>"
    And user provides address "<address>"
    And user provides phone number "<phoneNumber>"
    And user provides user name "<username>"
    And user sends email address as "<email>"
    And user provides password "<password>"
    And user click on the register button
    And user see the successfully registrated message

    Examples:
    |ssn|firstname|lastname|address|phoneNumber|username|email|password|
    |213123123   |ertf         |asd        |asdf       |12435678987        |asd|asdfgv@gmail.com     |Asdfg1!.     |