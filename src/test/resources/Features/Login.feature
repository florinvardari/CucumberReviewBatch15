Feature: Login Functionalities


  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And  click on login button
    Then user is logged in successfully
    And Close the browser


  Scenario: User enters valid username invalid password
    Given open the browser and launch HRMS application
    When user enters  username "Admin" and  password "florin123"
    And  click on login button
    And Close the browser

  Scenario: User enters valid username empty password
    Given open the browser and launch HRMS application
    When user enters  username "Admin" and  password ""
    And  click on login button
    And Close the browser

  Scenario: User enters empty username empty password
    Given open the browser and launch HRMS application
    When user enters  username "" and  password ""
    And  click on login button
    And Close the browser

  Scenario: User enters invalid username valid password
    Given open the browser and launch HRMS application
    When user enters  username "Florin" and  password "Hum@nhrm123"
    And  click on login button
    And Close the browser

  Scenario: User enters empty username valid password
    Given open the browser and launch HRMS application
    When user enters  username "" and  password "Hum@nhrm123"
    And  click on login button
    And get message wrong credentials
    And Close the browser