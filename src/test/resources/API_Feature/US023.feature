@us23
Feature: US23_System should allow to read all applicants
  Scenario: Read all registrants you created and validate them from your data set
    Given user sends get request for getting registrants
    Then user gets the datas and assert