Feature: System should allow to create new countries if not created already

  @US025
  Scenario: User can just create each country 1 by 1
    Given User sends post request for create country if not created already
    Then User gets already created country and validate one by one