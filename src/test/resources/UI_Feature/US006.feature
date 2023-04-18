Feature: User info segment (user Settings) should be editable on Homepage
  Background:
    Given User goes to the GmiBank home page

  @US006
  Scenario: User information should be filled in when you go to the name, surname, e-mail and language section

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    And  User clicks on the userName button
    And  User clicks on the user info button
    Then User verifies that the first name, last name, e-mail and language fields are editable

  @US0061
  Scenario: User has 2 languages English and Turkish

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    And  User clicks on the userName button
    And  User clicks on the user info button
    Then User verifies that there are two languages English and Turkish

