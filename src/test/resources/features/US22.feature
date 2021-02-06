Feature:System should allow to read states using api end point

  Scenario:Read all customers you created and validate them from your data set
    Given User set the state api end point with valid token
    And User deserilializing all data to Java
    And User set all state information to related files
    And User validata states from data set

    Scenario:Read all customers you created and validate them 1 by 1
      Given User set the state api end point with valid token
      And User deserilializing all data to Java
      And User validate states one by one
