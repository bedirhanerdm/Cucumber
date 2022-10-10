Feature: Parametre Kullanimi

  @gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "facebook" sayfasina gider
    Then kulanici 3 saniye bekler
    When url'nin "facebook" icerdigini test edelim
    And sayfayi kapatir


  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "google" sayfasina gider
    Then kulanici 3 saniye bekler
    When url'nin "google" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "bluerentalcars" sayfasina gider
    Then kulanici 3 saniye bekler
    When url'nin "blue" icerdigini test edelim
    And sayfayi kapatir

  Scenario: TC04 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amazon" sayfasina gider
    Then kulanici 3 saniye bekler
    When url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir