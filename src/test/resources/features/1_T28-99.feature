Feature: Money transfer should be available

	@TEST_T28-99
	Scenario: User should have at least 2 accounts
		Given Go to https://gmibank.com/
		And user navigate to  the user page
		And user click account box
		And user should see at least 2 account
