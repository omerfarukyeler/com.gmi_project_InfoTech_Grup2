Feature: An Employee can manage Customer

  Background:
    Given User goes the GmiBank home page

  @US012
  Scenario Outline: Employee sees all information headers

    When Employee clicks dropdown account menu
    And Employee clicks on the Sign in
    And Employee types the valid username in the relevant field
    And Employee types the valid password in the relevant field
    And Employee clicks on Sign in button
    And Employee clicks on My Operations menu
    And Employee clicks on Manage Customers
    Then Employee validates the customers fact "<sheet headers>"
    Examples:
      |sheet headers|
      |First Name         |
      |Last Name          |
      |Middle Initial     |
      |Email              |
      |Mobile Phone Number|
      |Phone Number       |
      |Address            |
      |Create Date        |

  #@US0121
  Scenario: Employee sees view option button all customers

    When Employee clicks dropdown account menu
    And Employee clicks on the Sign in
    And Employee types the valid username in the relevant field
    And Employee types the valid password in the relevant field
    And Employee clicks on Sign in button
    And Employee clicks on My Operations menu
    And Employee clicks on Manage Customers
    Then Employee validates view option button all for all customers

  #@US0122
  Scenario: Employee sees view edit button all customers

    When Employee clicks dropdown account menu
    And Employee clicks on the Sign in
    And Employee types the valid username in the relevant field
    And Employee types the valid password in the relevant field
    And Employee clicks on Sign in button
    And Employee clicks on My Operations menu
    And Employee clicks on Manage Customers
    Then Employee validates view edit button all for all customers

  #@US0123
  Scenario: Employee should be able to use the Edit button for the customer

    When Employee clicks dropdown account menu
    And Employee clicks on the Sign in
    And Employee types the valid username in the relevant field
    And Employee types the valid password in the relevant field
    And Employee clicks on Sign in button
    And Employee clicks on My Operations menu
    And Employee clicks on Manage Customers
    And Employee clicks any customer edit button in the customer table
    Then Employee validates that the edit customers button is available with the data on the next page

  #@US0124
  Scenario: Employee can delete a customer, but sees a question about deletion
    When Employee clicks dropdown account menu
    And Employee clicks on the Sign in
    And Employee types the valid username in the relevant field
    And Employee types the valid password in the relevant field
    And Employee clicks on Sign in button
    And Employee clicks on My Operations menu
    And Employee clicks on Manage Customers
    And Employee clicks any customer delete button in the customer table
    Then Employee sees a question message about wanting to delete

