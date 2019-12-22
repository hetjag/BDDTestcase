Feature: as user I want to login so I can use my facility

  Scenario:user should be logged in with valid credentials.


    Given User should be on login page
    When  User types valid username 'het2019'
    And   User types valid password "99999999"
    And   User click on login button
    Then  User should be logged in successfully
    And   User should see welcome massage

  Scenario:user should not be logged in with invalid credentials.

    Given User should be on login page
    When  User types invalid username 'jag2019'
    And   User types invalid password "000000000"
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with invalid username and valid password

    Given User should be on login page
    When  User types invalid username 'jag2019'
    And   User types valid password "99999999"
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with valid username and invalid password

    Given User should be on login page
    When  User types valid username 'het2019'
    And   User types invalid password "000000000"
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with valid username and blank password

    Given User should be on login page
    When  User types valid username 'het2019'
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with invalid username and blank password

    Given User should be on login page
    When  User types invalid username 'jag2019'
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with blank username and valid password

    Given User should be on login page
    And   User types invalid password "99999999"
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with blank username and invalid password

    Given User should be on login page
    And   User types invalid password "000000000"
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage

  Scenario:user should not be logged in with blank username and blank password

    Given User should be on login page
    And   User click on login button
    Then  User should not be logged in successfully
    And   User should not see welcome massage