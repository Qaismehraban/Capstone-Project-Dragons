Feature: Retail SignIn

  @test
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sdet@sdet.com' and password 'Sdet@12345'
    And User click on login button
    Then User should be logged into Account

  @CreateAccount
  Scenario: Verify user can create on account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email           | password  | confirmPassword |
      | student | Jason@gmail.com | Tek@123413 | Tek@123413       |
    And User click on SignUp button
    Then User should be logged into account page
