Feature: Delete User

  Scenario: Delete registered user
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click delete pengguna
    And I confirm delete pengguna
    Then I can view list user