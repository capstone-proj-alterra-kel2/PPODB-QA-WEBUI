Feature: List Paket Data Telkomsel

  Scenario: View list all paket data telkomsel
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    Then  I can view list paket data telkomsel