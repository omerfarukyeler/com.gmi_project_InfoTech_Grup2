Feature: System should allow delete states

  @US027
  Scenario: User can just delete each country 1 by 1
    Given User sends delete request for delete state
    Then User gets already delete state and validate one by one