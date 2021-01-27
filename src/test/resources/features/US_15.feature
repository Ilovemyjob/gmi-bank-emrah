Feature: US_15

  @TEST_T28-81
  Scenario Outline: US_15
    Given go to log in page
    Then enter username "<username>"
    Then enter password "<password>"
    Then click on Sign in
    Then click on My operations
    Then click on My Accounts
    Then verify if account able to see all accounts <account>
    Then check if View Transaction is click able
    Examples:
      | username | password | account |
      | omer__3  | omer__3  | 0       |
      | omer__4  | omer__4  | 4       |
      | omer__5  | omer__5  | 2       |
      | omer__6  | omer__6  | 2       |
      | omer__7  | omer__7  | 2       |
      | omer__8  | omer__8  | 1       |
      | omer__9  | omer__9  | 1       |

