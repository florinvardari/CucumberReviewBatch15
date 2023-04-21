Feature: Add Employee

  Background:
    # Given user is navigated to HRMS application
    When user enters valid email and valid password
    And  click on login button
    When user clicks on PIM option
    And user clicks on Add Employee button
    Then user is logged in successfully

    @datatable @addEmployee
  Scenario: Adding multiple employees in the dataBase
    When user starts adding the employee
      |firstname| middleName | lastName|
      |   abra   |ca          |dabra   |
      |  leo     | ne         |messi   |