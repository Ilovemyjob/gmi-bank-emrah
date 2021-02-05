@T28_14
  #US06
Feature: US_06


  Background: flow till UserInfo page
  #@PRECOND_T28-137
    Given user tries to sign in with following attributes
    |username|password|
    |fatiheymen|04290173Ank@|
    And  user clicks user icon
    And user clicks user info from drop down

  @TEST_T28-75
  Scenario:TC-06.1 There should be user info being populated when navigating to user info "firstname, lastname
  email and language"
    Then UserInfo page should display

  @TEST_T28-83
  Scenario:TC-06.2 There should be 2 languages available "English and Turkish"
    When user clicks language dropdown
    Then English and Turkish options should display

  @TEST_T28-84
 Scenario: TC-06.3 There should be an option to update firstname
   When user clicks firstname field
   And user clears existing firstname
   And user enters "semih" in firstname field
   Then new username should display in firstname field

  @TEST_T28-85
 Scenario: TC-06.4There should be an option to update lastname
   When user clicks lastname field
   And user clears existing lastname
   And user enters "kasim" in lastname field
   Then new username should display in lastname field

  @TEST_T28-86
 Scenario:TC-06.5 There should be an option to update email id adding "@" sign and "." extension
   When user clicks email field
   And user clears existing email
   And user enters "fatiheymen31@gmail.com" in email field
   Then new email should display in email field

  