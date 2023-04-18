Feature: A Manager can manage Customer

  Background:
    Given User goes the GmiBank home page

  @US018
  Scenario Outline: Manager sees all information headers

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    Then Manager validates the customers fact "<sheet headers>"
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

  #@US0181
  Scenario: Manager sees view option button all customers

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    Then Manager validates view option button all for all customers

  #@US0182
  Scenario: Manager sees view edit button all customers

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    Then Manager validates view edit button all for all customers

  #@US0183
  Scenario: Manager should be able to use the Edit button for the customer

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks any customer edit button in the customer table
    Then Manager validates that the edit customers button is available with the data on the next page

  #@US0184
  Scenario: Manager can delete a customer, but sees a question about deletion
    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks any customer delete button in the customer table
    Then Manager sees a question message about wanting to delete

