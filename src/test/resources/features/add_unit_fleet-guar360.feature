# Autor: Jhon Botero Ana Patiño
  # Language: en

  Feature: Agregar nueva unidad de transporte en la plataforma FleetGuard360
    Como usuario autorizado
    Quiero agregar una nueva unidad completando el formulario
    Para que esta se registre correctamente en la flota

  Background:
    Given que el usuario se encuentra en el formulario de agregar nueva unidad

    Scenario Outline: Agregar unidad exitosamente
      When el usuario ingresa la placa "<placa>", modelo "<modelo>", selecciona un conductor, capacidad "<capacidad>" y hace clic en el boton guadar
      Then la nueva unidad se muestra registrada en la lista de unidades

      Examples:
        | placa    | modelo            | capacidad   |
        | ABC-124  | Toyota Hilux 2023 | 2 toneladas |
        | ADC-321  | Toyota 2022       | 3 toneladas |

    Scenario: Intentar agregar unidad dejando campos obligatorios vacíos
      When el usuario deja los campos obligatorios vacíos y hace clic en el boton guardar
      Then se muestra un mensaje indicando que debe completar todos los campos requeridos

