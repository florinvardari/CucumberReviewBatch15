Feature: Login Functionalities

@Smoke
  Scenario: Valid Admin login
   # Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And  click on login button
    Then user is logged in successfully
   # And Close the browser

  @Smoke
  Scenario: User enters valid username invalid password
    #Given open the browser and launch HRMS application
    When user enters  username "Admin" and  password "florin123"
    And  click on login button
  #  And Close the browser

  Scenario: User enters valid username empty password
   # Given open the browser and launch HRMS application
    When user enters  username "Admin" and  password ""
    And  click on login button
   # And Close the browser

  Scenario: User enters empty username empty password
    #Given open the browser and launch HRMS application
    When user enters  username "" and  password ""
    And  click on login button
    #And Close the browser

  Scenario: User enters invalid username valid password
   # Given open the browser and launch HRMS application
    When user enters  username "Florin" and  password "Hum@nhrm123"
    And  click on login button
  #  And Close the browser

  Scenario: User enters empty username valid password
   # Given open the browser and launch HRMS application
    When user enters  username "" and  password "Hum@nhrm123"
    And  click on login button
    And get message wrong credentials
   # And Close the browser

  Scenario Outline: Vaildate Wrong credentials
    When user enters  "<username>" and  "<password>"
    And  click on login button
    And get message "<errorMsg>"
    Examples:
    |username|password|errorMsg|
    |ertyes  |Hum@nhrm123|Invalid credentials|
    |admin |ddsvvs@233423|Invalid credentials|
    |  |Hum@nhrm123|Username cannot be empty|
    |admin ||Password cannot be empty|
    |||Username cannot be empty|
