@US_29
Feature: Validate all data performing database testing using the port and following credentials jdbc:postgresql:will be given"" user: """" and password: """"

  Background: User connecting GMI database
    Given User connects GMI database

  @T28_164
  Scenario: All users' information should be retrieved by database and verified
    Given User read all user data from database
    Then user validate all user data

  @T28_165
  Scenario: All countries' info should be retrieved by database and validated
    Given User read all countries infos from database
    Then user validate all countries infos

  @T28_166
  Scenario: All states should related to USA should be  retrieved by database and validated
    Given User read all states of related to USA from database
    Then user validate all states of related to USA