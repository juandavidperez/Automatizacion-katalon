#Author: juandavidperezvergara@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Soy un usuario que quiere iniciar sesion en katalon cura

  Scenario:
    Given Abrir el navegador en Katalon Cura
    When Clickear el boton y obtener y rellenar los datos
    And Rellenar datos para pedir cita
    Then Verificar que pidio cita satisfactoriamente