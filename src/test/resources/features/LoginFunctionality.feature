
#US04 & us5
Feature: Positive test for Login

  Background:user should be on homapage
		#@PRECOND_T28-27
    Given user is on GmiBank hompage
    Given user clicks user icon
    Given user clicks sign in
#US04
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
#US5=======================================
    #invalid username
  @TEST_T28-33 @TESTSET_T28-89
  Scenario: TC_001 User cannot login with invalid username validating the error message
    Given user provide invalid username
    Given user provide valid password
    Given user clicks sign in button
    Then  user should see validating the error message "Failed to sign in!"
   #invalid password
  @TEST_T28-50 @TESTSET_T28-89
  Scenario: TC_002 User cannot login with invalid password validating the error message
    Given user provide valid username
    Given user provide invalid password
    Given user clicks sign in button
    Then  user should see validating the error message "Failed to sign in!"
   #invalid username and password
  @TEST_T28-43 @TESTSET_T28-89
  Scenario: TC_003 User cannot login with invalid username and password validating the error message
    Given user provide invalid username
    Given user provide invalid password
    Given user clicks sign in button
    Then  user should see validating the error message "Failed to sign in!"
   #to reset password
  @TEST_T28-51 @TESTSET_T28-89
  Scenario: TC_004 User with invalid credentials should be given an option to reset their password
    Given user provide invalid username
    Given user provide invalid password
    Given user clicks sign in button
    Then  user should see validating the error message "Failed to sign in!"
    Then  user should see the option to reset the password "Did you forget your password?"
    Then  user should be on password reset request page
   #navigate to registration page
  @TEST_T28-52 @TESTSET_T28-89
  Scenario: TC_005 User should be given the option to navigate to registration page if they did not register yet
    Given user provide invalid username
    Given user provide invalid password
    Given user clicks sign in button
    Then  user should see validating the error message "Failed to sign in!"
    Then  user should see the option register a new account "You don't have an account yet? Register a new account"
    Then user should be on registration page

