@login
Feature: Login Feature
  As a customer
  I want to login
  to check the login functionality

  Scenario:Validate Login Page
    Given I am on the home page
    When I click on Login button
    Then I should see "Welcome, Please Sign In!"is visible
    And I should see text "/login" in URL

  Scenario: Login with Valid credential
    Given I am on the home page
    When I click on Login button
    And I Enter Valid email "pbb@gmail.com"
    And I Enter Valid Password "BAC123"
    And I click on Login button on Login page
    Then I should see logout button displayed

  Scenario: Validate my account detail after Login

  Scenario: Login with invalid credential
    Given I am on the home page
    When I click on Login button
    And I enter invalid email "Pqrs"
    And I click on password input page on login page
    Then I should see "wrong email" taxt displayed

Scenario: Login with empty credential


