Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sdet@sdet.com' and password'Sdet@12345'
    And User click on login button
    And User should be logged into Account

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Dragons' and Phone '916-786-8765'
    And User click on Update button
    Then user profile information should be updated
  @Payment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber        | nameOnCard       | expirationMonth     | expirationYear     | securityCode    |
      | 7684903765254789  | Smith Michael    | 12                  | 2025               | 987             |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’
    
    
    
