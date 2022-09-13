#Proyecto de pruebas y cargado en Github
#27/08/2022
#Jhonatan Medina Blanco
@Regresion
Feature: pim

  @AddEmploye
  Scenario Outline: Agregar empleado
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    When diligencie el nuevo empleado nombre
    And diligenciar nombre <name> y apellido <apellido>

    Examples: 
      | user  | pass     | name     | apellido |
      | Admin | admin123 | jhonatan | medina   |

      