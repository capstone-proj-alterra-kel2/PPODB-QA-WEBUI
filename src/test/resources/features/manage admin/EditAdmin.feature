Feature: Edit Admin

  Scenario: Edit admin with correct value
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click edit
    And I edit name
    And I edit correct email
    When I click simpan edit
    Then I can view list admins

  Scenario: Edit admin with no name
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click edit
    And I edit correct email
    When I click simpan edit
    And I click kembali
    Then I can view list admins

  Scenario: Edit admin with wrong email
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click edit
    And I edit name
    And I edit incorrect email
    When I click simpan edit
    And I click kembali
    Then I can view list admins

  Scenario: Edit admin with no email
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click edit
    And I edit name
    When I click simpan edit
    And I click kembali
    Then I can view list admins
