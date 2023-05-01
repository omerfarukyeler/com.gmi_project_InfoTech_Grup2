
@us22
Feature: US22_System should allow to read states
  Scenario: TC01_Read all states you created and validate them from your data set
    Given admin sends getAll request for getting states
    Then admin gets the datas and assert

