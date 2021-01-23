Feature: Money transfer should be available

  @TEST_T28-99

  Scenario:User should have at least 2 accounts
    Given User go to GMI BAnk homepage
    And user navigate to  the user page
    And user navigate to  the user page
    And user go to transfer money page
    And user click account box
    And user should see at least two account
  @TEST_T28-24

  Scenario: User can select the first account as From dropdown where they receive their money from

    Given User go to GMI BAnk homepage
    And user navigate to  the user page
    And user go to transfer money page
    And user click account box
    And user can select first account
  @TEST_T28-99

  Scenario: User can select a balace that they want to proceed with

    Given User go to GMI BAnk homepage
    And user navigate to  the user page
    And user go to transfer money page
    And user click account box
    And user can select balance
  @TEST_T28-99

  Scenario: User should provide a description for that transfer

    Given User go to GMI BAnk homepage
    And user navigate to  the user page
    And user go to transfer money page
    And user click account box
    And user select first box
    And user select second box
    And user type balance
    And user make transfer without description
  @TEST_T28-99

  Scenario: "User can make sure transfer is done successfully validating the message
  an amount of the transaction"

    Given User go to GMI BAnk homepage
    And user navigate to  the user page
    And user go to transfer money page
    And user click account box
    And user select first box
    And user select second box
    And user type balance
    And user type description
    And user make transfer

















































































    Given User go to GMI BAnk homepage


