Feature: Positive test for Login

  Background:user should be on homapage
		#@PRECOND_T28-27
    Given user is on GmiBank hompage
    Given user clicks user icon
    Given user clicks sign in

  @TEST_T28-25 @TESTSET_T28-29
  Scenario: TC_001 User should access the application with valid credentials
    Given user provide valid username
    Given user provide valid password
    Given user clicks sign in button
    Then user should be on user page
  @TEST_T28-26 @TESTSET_T28-29
  Scenario: TC_002 User can cancel to login with cancel button
    Given user clicks cancel button
    Then user should be on home page
