@regression  #can add n number of tags
Feature: Bookcart Application place order

Background:
    Given the user clicks on the login option
  
  @cleanUp  #can add n number of tags
  Scenario Outline: cartpage should be updated
    Given the user should login as "<UseName>" and "<Password>"
    And the user search book "<bookName>"
    When user add the book to the cart
    Then The cart page should be updated

    @tesEnvData   #can add n number of tags
    Examples: 
      | UseName  | Password      | bookName      |
      | anandraj | Anandraj@1234 | slayer        |
      | cathy    | Cathy@1234    | Catching Fire |

    @UATEnvData
    Examples: 
      | UseName  | Password      | bookName   |
      | anandraj | Anandraj@1234 | Red Rising |
      | cathy    | Cathy@1234    | The Chosen |
