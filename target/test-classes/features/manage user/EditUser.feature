Feature: Edit User

  Scenario: Edit user with correct value
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit name
    And I edit correct email
    And I edit correct phone number
    When I click simpan edit
    Then I can view list user

  Scenario: Edit user with no name
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit correct email
    And I edit correct phone number
    When I click simpan edit
    Then I can view list user

  Scenario: Edit user with wrong email
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit name
    And I edit incorrect email
    And I edit correct phone number
    When I click simpan edit
    Then I can view list user

  Scenario: Edit user with no email
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit name
    And I edit correct phone number
    When I click simpan edit
    Then I can view list user

  Scenario: Edit user with wrong phone number
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit name
    And I edit correct email
    And I edit incorrect phone number
    When I click simpan edit
    Then I can view list user

  Scenario: Edit user with no phone number
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click edit
    And I edit name
    And I edit correct email
    When I click simpan edit
    Then I can view list user