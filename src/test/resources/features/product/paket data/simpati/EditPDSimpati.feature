Feature: Edit Paket Data Simpati

  Scenario: Edit paket data simpati with correct value
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click edit produk
    And I edit nama produk
    And I edit stock produk
    And I edit harga produk
    And I edit status harga
    When I click tambahkan edit
    Then I can view list paket data simpati

  Scenario: Edit paket data simpati with no nama produk
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click edit produk
    And I edit stock produk
    And I edit harga produk
    And I edit status harga
    When I click tambahkan edit
    Then I still in edit produk

  Scenario: Edit paket data simpati with no stock
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click edit produk
    And I edit nama produk
    And I edit harga produk
    And I edit status harga
    When I click tambahkan edit
    Then I still in edit produk

  Scenario: Edit paket data simpati with no harga
    Given I have login on MYCUAN
    When I click Produk Kami
    And I click paket data
    And I click simpati
    Then I click edit produk
    And I edit nama produk
    And I edit stock produk
    And I edit status harga
    When I click tambahkan edit
    Then I still in edit produk