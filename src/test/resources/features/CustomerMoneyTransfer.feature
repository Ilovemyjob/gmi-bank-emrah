@T28-117
	#US16
Feature: Test Execution for Test Plan T28-116

	Background:
		#@PRECOND_T28-113
		Given User go to GMI BAnk homepage
		    And user clicks user icon
		    And user clicks sign in
		    And user provide valid costumername
		    And user provide valid costomerpassword
		    And user clicks sign in button
		    And user go to transfer money page

	@TEST_T28-99
	Scenario: User should have at least 2 accounts
		Given user click account box
		    And user should see at least two account
	@TEST_T28-100
	Scenario: User can select the first account as From dropdown where they receive their money from
		Given user click account box
		    And user can select first account
	@TEST_T28-101
	Scenario: User can select a balace that they want to proceed with
		Given user click account box
		    And user can select balance
	@TEST_T28-102
	Scenario: User should provide a description for that transfer
		Given user click account box
		    And user can select first account
		    And user select second box
		    And user type balance
		    And user make transfer without description
	@demo
	Scenario: "User can make sure transfer is done successfully validating the message  an amount of the transaction"
		Given user click account box
		    And user can select first account
		    And user select second box
		    And user type balance
		    And user type description
		    And user make transfer
