Feature: Add User

  Scenario: Add user using correct value
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct email
    And I input correct phone number
    And I input password
    When I click simpan
    Then I can view list user

  Scenario: Add user with registered value
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct email
    And I input correct phone number
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario: Add user using incorrect email
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input incorrect email
    And I input correct phone number
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario:  Add user using incorect phone number
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct email
    And I input incorrect phone number
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario: Add user with no name
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input correct email
    And I input correct phone number
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario: Add user with no email
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct phone number
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario: Add user with no phone number
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct email
    And I input password
    When I click simpan
    Then I still in add user page

  Scenario: Add user with no password
    Given I have login on MYCUAN
    When I click Pengguna
    Then I click tambah pengguna
    And I input name
    And I input correct email
    And I input correct phone number
    When I click simpan
    Then I still in add user page