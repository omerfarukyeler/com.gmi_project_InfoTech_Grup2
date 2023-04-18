Feature: System should allow any user to register with valid credentials
  validating the success message

  Background:
    Given User goes to home pages

  @US001_1
    Scenario: Check the succesfully message

    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate SSN number
    And Enters the appropriate name
    And Enters the appropriate lastname
    And Enters the appropriate adress
    And Enters the appropriate Phone Number
    And Enters the user name
    And Enters the appropriate new password
    And Enters the appropriate renew pasword
    And Enters the appropriate emailAdress
    And Click the register button
    Then Checks success message

  @USOO1_2
    @Negative

  Scenario: Check the failed message
    When User clicks the user button
    And User clicks on register tab
    And Enters the appropriate SSN number
    And Enters the appropriate name
    And Enters the appropriate lastname
    And Enters the appropriate adress
    And Enters the appropriate Phone Number
    And Enters the user name
    And Enters the appropriate new password
    And Enters the appropriate renew pasword
    And Enters the appropriate emailAdress
    And Click the register button
    Then Checks failed message

