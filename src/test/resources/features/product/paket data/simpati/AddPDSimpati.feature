Feature: Add Paket Data Simpati

  Scenario: Add paket data simpati with correct value
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click tambah produk
    And I input nama produk
    And I input stock produk
    And I input provider simpati
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I can view list paket data simpati

  Scenario: Add paket data simpati with no nama produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click tambah produk
    And I input stock produk
    And I input provider simpati
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk

  Scenario: Add paket data simpati with no stock produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click tambah produk
    And I input nama produk
    And I input provider simpati
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk

  Scenario: Add paket data simpati with no harga produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click tambah produk
    And I input nama produk
    And I input stock produk
    And I input provider simpati
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk