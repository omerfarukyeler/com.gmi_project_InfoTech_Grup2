Feature:System should not allow to make updates with invalid credentials
  Background:
    Given User goes to the GmiBank home page

  @US007
  Scenario Outline: user can not type invalid email

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    And  User clicks on the userName button
    And  User clicks on the user info button
    Then User types the "<invalid email>" on the email section
    And  User clicks on the userName button
    And  User clicks on sign out Button
    Examples:
      |invalid email|
      |Demo123@gmailcom|
      |Demo123gmail.com|

  @US0071
  Scenario: User has 2 languages English and Turkish

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    And  User clicks on the userName button
    And  User clicks on the user info button
    Then User verifies that is not an option of any other language other than English or Turkish