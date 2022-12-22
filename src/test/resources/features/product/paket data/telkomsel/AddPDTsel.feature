Feature: Add Paket Data Telkomsel

  Scenario: Add paket data telkomsel with correct value
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    Then I click tambah produk
    And I input nama produk
    And I input stock produk
    And I input provider telkomsel
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I can view list paket data telkomsel

  Scenario: Add paket data telkomsel with no nama produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    Then I click tambah produk
    And I input stock produk
    And I input provider telkomsel
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk

  Scenario: Add paket data telkomsel with no stock produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    Then I click tambah produk
    And I input nama produk
    And I input provider telkomsel
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk

  Scenario: Add paket data telkomsel with no harga produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click telkomsel
    Then I click tambah produk
    And I input nama produk
    And I input stock produk
    And I input provider telkomsel
    And I input harga produk
    Then I choose status harga
    And I click tambahkan
    Then I still in add produk