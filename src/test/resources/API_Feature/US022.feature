
@us22 @api
Feature: US22_System should allow to read states
    Scenario: TC01_Create a state and validate them from id
    Given admin sends post request for creating states
    Then admin gets the datas from id and assert
