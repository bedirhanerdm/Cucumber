@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given kullanici amazon sayfasina gider



  Scenario: TC01 kullanici amazonda Nutella aratir

    Then kullanici Nutella aratir
    And sonuclarin Nutella icerdigini test eder



  Scenario: TC02 kullanici amazonda Selenium aratir

    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder



  Scenario: TC03 kullanici amazonda iphone aratir

    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir