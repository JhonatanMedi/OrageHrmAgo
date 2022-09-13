#Proyecto de pruebas y cargado en Github
#27/08/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Leave

  @HU124
  Scenario Outline: Agregar empleado
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    When busque al empleado <nameEmployee> y seleccione la accion <actions>

    Examples: 
      | user  | pass     | nameEmployee    | actions |
      | Admin | admin123 | Charlie  Carter | Approve |

  @HU12
  Scenario Outline: lista
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    And llegar a la opcion leave y tipo de leave <typesLeave>

    Examples: 
      | user  | pass     | typesLeave |
      | Admin | admin123 | CAN - FMLA |
