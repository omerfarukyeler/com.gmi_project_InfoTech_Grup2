Feature: Address of customer can be created

  Background:
    Given User goes the GmiBank home page

  @US010
  Scenario: Manager types customer's address as street and number and this field cannot be left blank

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager types the address with street and number in the address box
    And Manager clicks the city box
    Then Manager does not see any error message for address box

  #@US0101
  Scenario: Manager types customer's city and this field cannot be left blank

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager types the address with street and number in the address box
    And Manager types the city in the city box
    Then Manager does not see any error message for city box

   #@US0102
  Scenario: Manager selects customer's country and this field cannot be left blank

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager types the address with street and number in the address box
    And Manager types the city in the city box
    And Manager selects USA from the country dropdown
    Then Manager does not see any error message for country dropdown

    #@US0103
  Scenario: Manager types customer's as USA state and this field cannot be left blank

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager types the address with street and number in the address box
    And Manager types the city in the city box
    And Manager selects USA from the country dropdown
    And Manager types the state as USA state in the state box
    Then Manager does not see any error message for country dropdown

    #@US0104
  Scenario Outline: Manager types customer's address as only street or only number and this field cannot be left blank

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager types the "<address>"  in the address box
    Then Manager sees an error message for address box
    Examples:
    |address      |
    |Text Street  |
    |100          |

    #@US0105
  Scenario: Manager does not type customer's address field

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager leaves address field blank
    And Manager clicks the city box
    Then Manager sees an error message for address box

   #@US0106
  Scenario: Manager does not type customer's city field

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager leaves city field blank
    Then Manager sees an error message for city box

  #@US0107
  Scenario: Manager does not select customer's country

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager leaves country field blank
    Then Manager sees an error message for country dropdown

   #@US0108
  Scenario: Manager does not type customer's state field

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    And Manager leaves state field blank
    Then Manager sees an error message for state box

   #@US0109
  Scenario Outline: Manager does not type one of the US states in the customer's state field

    When Manager clicks dropdown account menu
    And Manager clicks on the Sign in
    And Manager types the valid username in the relevant field
    And Manager types the valid password in the relevant field
    And Manager clicks on Sign in button
    And Manager clicks on My Operations menu
    And Manager clicks on Manage Customers
    And Manager clicks on create a new customer button
    Then Manager types a "<different state than US states>" and sees an error message
    Examples:
    |different state than US states |
    |Friesland                      |
    |Groningen                      |