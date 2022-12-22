Feature: Delete Admin

  Scenario: Delete registered admin
    Given I have login on MYCUAN
    When I click Akun Admin
    Then I click delete admin
    And I confirm delete admin
    Then I can view list admins