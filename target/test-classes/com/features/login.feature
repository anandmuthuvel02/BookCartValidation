@Sanity  #can add n number of tags
Feature: Bookcart Application Login

Background:
    Given the user clicks on the login option
    
  @Positive
  Scenario: Login should be successful
    
    And the user enters the username as "anandraj"
    And the user enters the password as "Anandraj@1234"
    When the user clicks on the login button
    Then the user should be able to login successfully
 
  @Negative
  Scenario: Login should fail
  
    And the user enters the username as "anandarajM"
    And the user enters the password as "123456@Anand"
    When the user clicks on the login button
    But the user should not be able to login successfully
 