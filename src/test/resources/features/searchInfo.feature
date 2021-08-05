# Autor: Alberto Caballero
  @stories
  Feature: Search for information in the Bancolombia Page
    As a user i want to search some information in the Bancolombia Page
  @scenario1
  Scenario: Search for information about Informe Economico Mensual
    Given than Jorge want to search the Informe Economico mensual
    When he search for the document
    Then he finds the PDF document about Informe Economico Mensual
    |        urlInformeEconomicoMensualPDF        |
    |informe-economico-mensual-colombia-marzo-2021|

  @scenario2
  Scenario: Search for information about Condciones Generales de Seguro de vida
    Given than Jorge want to search for the condiciones generales de seguro de vida
    When he search for the documents
    Then he finds the PDF document about Condiciones Generales de seguro de vida
      |urlCondicionesGeneralesPDF|
      |   CONDICIONES+GENERALES  |