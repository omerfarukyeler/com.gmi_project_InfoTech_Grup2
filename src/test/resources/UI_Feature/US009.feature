Feature:System should not allow to create a new customer
  Background:
    Given User goes to the GmiBank home page

  @US009n
  Scenario: user can not type invalid email

    When User clicks on the signInRegister button
    And  User clicks on the signIn button
    And  User types the valid username and valid password in the relevant fields
    And  User clicks on the submit button
    And  User clicks on the my operatıons button
    And  User clicks on the manage customer button
    And  User clicks on the create a new customer button
    And  User types SSN  in the relevant field on the Page
    And  User types first name  in the relevant field on the Page
    And  User types last name  in the relevant field on the Page
    And  User types middle Initial in the relevant field on the Page
    And  User types email  in the relevant field on the Page
    And  User types Mobile Phone Number  in the relevant field on the Page
    And  User types Phone Number  in the relevant field on the Page
    And  User types zip code  in the relevant field on the Page
    And  User types address  in the relevant field on the Page
    And  User types city in the relevant field on the Page
    And  User clicks on the save button on the same Page
    Then User verifies the customer that created new


