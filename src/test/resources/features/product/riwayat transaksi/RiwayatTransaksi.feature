Feature: Riwayat transaksi user

  Scenario: View riwayat transaksi user
    Given I have login on MYCUAN
    When I click riwayat transaksi
    And I choose paket data
    Then I can view list transactio history of paket data