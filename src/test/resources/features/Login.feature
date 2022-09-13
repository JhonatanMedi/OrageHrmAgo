#Proyecto de pruebas y cargado en Github
#27/08/2022
#Jhonatan Medina Blanco
@Regresion
Feature: login en la pagina orange

  @Login
  Scenario Outline: login
    Given abrir el navegador
    When diligencie el campo user <user> y contraseña <pass>

    Examples: 
      | user  | pass     |
      | Admin | admin123 |
