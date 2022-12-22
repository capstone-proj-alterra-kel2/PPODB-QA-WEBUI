Feature: Delete Paket Data Simpati

  Scenario: Delete Paket Data
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    When I click delete produk
    And I click confirm
    Then I can view list paket data simpati