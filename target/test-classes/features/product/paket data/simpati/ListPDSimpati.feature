Feature: List Paket Data Simpati

  Scenario: View list all paket data simpati
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then  I can view list paket data simpati