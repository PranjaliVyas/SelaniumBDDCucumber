Feature:  Registration Page
  AS a customer
  I want to register


  @register
  Scenario:  Valid Registration with valid data
  Given I am on the home page
    And I  click on register button
  When I enter First name "pv"
    And I enter LastName "rv"
    And I enter Valid email or register page"cdr5@gmail.com"
    And I enter password on register page "bac123!"
    And I enter confirm password "bac123!"
  And i click on Register button on registration page
    Then I should see your registration completed on registration page
    And I should see log out button displayed
    And I should "continue" button is displayed

