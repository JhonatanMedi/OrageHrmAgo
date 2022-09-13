#Proyecto de pruebas y cargado en Github
#27/08/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Admin

  @HU765
  Scenario Outline: eliminar usuario
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    When busque al usuario <nameUser>

    Examples: 
      | user  | pass     | nameUser      |
      | Admin | admin123 | Goutam.Ganesh |
