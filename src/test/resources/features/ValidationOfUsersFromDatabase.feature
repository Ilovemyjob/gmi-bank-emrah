

Feature:
  #us 20   all customer
  Scenario: System should allow to create customers using api endpoint
    Given user set and read customers endpoint with valid token
    And   user verifies customers data  with data set from database
    Then user validates customers data one by one from database

#    ===========================us21===============


#  ===================us22===================
#      all countries
  Scenario:Read all customers you created and validate them from your data set
    Given User set the state api end point with valid token
    And User deserilializing all data to Java
    And User set all state information to related files
    And User validata states from data set

  Scenario:Read all customers you created and validate them 1 by 1
    Given User set the state api end point with valid token
    And User deserilializing all data to Java
    And User validate states one by one

#    ======================us23==================
#            all applicants
  Scenario: System should allow to read all applicants using api endpoint
    Given user sets and reads applicants endPoint with valid token
    And user reads registrants you created and validate them from your data set
    Then User can read and validate each registrants one by one from your database

