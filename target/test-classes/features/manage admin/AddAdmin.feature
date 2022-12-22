Feature: Add Admin

  Scenario: Add admin using correct value
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct email
    And I input correct phone number
    And I input password admin
    When I click simpan
    Then I can view list admins

  Scenario: Add user with registered value
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct email
    And I input correct phone number
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario: Add admin using incorrect email
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input incorrect email
    And I input correct phone number
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario:  Add admin using incorect phone number
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct email
    And I input incorrect phone number
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario: Add admin with no name
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input correct email
    And I input correct phone number
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario: Add admin with no email
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct phone number
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario: Add admin with no phone number
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct email
    And I input password admin
    When I click simpan
    Then I still in add admin page

  Scenario: Add admin with no password
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click tambah admin
    And I input name
    And I input correct email
    And I input correct phone number
    When I click simpan
    Then I still in add admin page