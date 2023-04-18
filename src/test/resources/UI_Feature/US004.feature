Feature: Login page should accessible with valid credentials

  Background:
    Given User goes to the GmiBank home page

  @US004
  Scenario: User successfully logs in with valid username and valid password

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    Then User verifies successful login

  @US004
  Scenario: User cancels login with cancel button

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    Then User verifies that the cancel button is clickable
