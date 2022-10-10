Feature: US004 Parametre Kullanimi

  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.hepsiburada.com" sayfasinda
    Then kulanici 3 saniye bekler
    When url'nin "hepsi" icerdigini test edelim
    And sayfayi kapatir