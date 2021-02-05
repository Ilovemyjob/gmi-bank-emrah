
#us03
Feature: US_03

  Background:
    Given go to home page
    Then click on user icon
    Given go to registration page

  @TEST_T28-79
  Scenario Outline: US_03_TC_01
    Then enter lower case "<lowerCase>"
    Examples:
      | lowerCase |
      | aaaaaa    |
      | bbbbbb    |
      | asdfgh    |

  Scenario Outline: US_03_TC_02
    Then enter upper case "<upperCase>"
    Examples:
      | upperCase |
      | aaaaaaA   |
      | bbbbAbb   |
      | asDdfgh   |

  Scenario Outline: US_03_TC_03
    Then enter a digit "<digit>"
    Examples:
      | digit     |
      | aaaaaaA1  |
      | 21bbbbAbb |
      | asDdf32gh |

  Scenario Outline: US_03_TC_04
    Then enter a special char "<char>"
    Examples:
      | char       |
      | aaa,aaaA1  |
      | 21bbbbAbb. |
      | [asDdf32gh |

  Scenario: US_03_TC_05
    Then total should be at least seven chars
