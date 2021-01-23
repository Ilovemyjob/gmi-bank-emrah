Feature: User should have at least 2 accounts

	@TEST_T28-99
	Scenario: User should have at least 2 accounts
		Given User go to GMI BAnk homepage
		And user navigate to  the user page
		And user navigate to  the user page
		And user go to transfer money page
		And user click account box
		And user should see at least two account
