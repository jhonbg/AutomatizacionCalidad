#Autor Ana Patiño Jhon Botero
  #Language: en

  Feature: Edicilon de unidad de transporte en plataforma fleetguar360
    como usuario autorizado
    quiero editar los campos modelo, placa, capacidad y estado de una unidad
    para que los cambios se guarden correctamente y se muestren actualizados

    Background:
      Given que el usuario esta en el formulario

    Scenario Outline: Edicion exitosa de los campos permitidos
      When el usuario empieza hacer la modificacion de los campos placa "<placa>", modelo "<modelo>", capacidad "<capacidad>" y hace clic en guardar cambios
      Then la vista se actualiza mostrando los nuevos datos

      Examples:
        | placa    | modelo            | capacidad   |
        | ABC-124  | Toyota Hilux 2023 | 2 toneladas |

    Scenario: Edicion con campos obligatorios vacios
      When el usuario deja los campos obligatorios vacios y hace clic en guardar cambios
      Then no deja salir del formulario