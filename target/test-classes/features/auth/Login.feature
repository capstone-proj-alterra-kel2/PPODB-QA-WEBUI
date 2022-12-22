Feature: Login Page
  As a admin
  I want to login
  So I can access my dashboard

  Scenario: Login with valid email and Password
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click Login button
    Then I navigated to MYCUAN dashboard

  Scenario: Login with valid email and invalid password
    Given I am on the login page
    When I input valid email
    And I input invalid password
    And I click Login button
    Then I will get invalid message

  Scenario: Login with invalid email and invalid password
    Given I am on the login page
    When I input invalid email
    And I input invalid password
    And I click Login button
    Then I will get invalid message

  Scenario: Login with invalid email and valid password
    Given I am on the login page
    When I input invalid email
    And I input valid password
    And I click Login button
    Then I will get invalid message

  Scenario: Login with no email
    Given I am on the login page
    And I input valid password
    And I click Login button
    Then I will get invalid message

  Scenario: Login with no password
    Given I am on the login page
    When I input valid email
    And I click Login button
    Then I will get invalid message