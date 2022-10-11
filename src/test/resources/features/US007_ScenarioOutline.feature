Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananUrl>" sayfasina gider
    Then kulanici 2 saniye bekler
    When url'nin "<arananKelime>" icerdigini test edelim
    And sayfayi kapatir

    Examples:
      | arananUrl | arananKelime |
      | amazon | amazon |
      | facebook | face |
      | bluerentalcars | blue |
      | google | google |

    # CTRL + D