Feature: Logout Page
  As a admin
  I want to logout
  So I can logout my account

  Scenario: Logout with valid email and Password
    Given I have login on MYCUAN
    When I click logout button
    Then I will go to login page