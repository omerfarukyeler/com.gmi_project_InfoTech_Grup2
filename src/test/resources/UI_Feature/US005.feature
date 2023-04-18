Feature: Login page should not be accessible with invalid credentials

  Background:
    Given User goes to the GmiBank home page

  @US005
  Scenario: user cannot login with invalid username

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the invalid username and valid password in the relevant fields
    And  User clicks on the submit button
    Then User verifies error message

  @US005
  Scenario: user cannot login with invalid password

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and invalid password in the relevant fields
    And  User clicks on the submit button
    Then User verifies error message

  @US005
  Scenario: user cannot login with invalid user name and invalid password

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the invalid username and invalid password in the relevant fields
    And  User clicks on the submit button
    Then User verifies error message

  @US005
  Scenario: user that has invalid credentials resets the password

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the invalid username and invalid password in the relevant fields
    And  User clicks on the submit button
    And  User verifies error message
    And  User clicks on the didYouForgetYourPassword button
    Then User verifies the message

  @US005
  Scenario: user that did not register yet navigates to registration page

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the invalid username and invalid password in the relevant fields
    And  User clicks on the submit button
    And  User verifies error message
    And  User clicks on the registerANewAccount button
    Then User verifies the message for registration