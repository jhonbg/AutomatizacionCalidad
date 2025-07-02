#Autor Ana Patiño Jhon Botero
  #Language: en

  Feature: Edicilon de unidad de transporte en plataforma fleetguar360
    como usuario autorizado
    quiero editar los campos modelo, placa, capacidad y estado de una unidad
    para que los cambios se guarden correctamente y se muestren actualizados

    Scenario: Edicion exitosa de los campos permitidos
      Given que el usuario esta en el formulario
      When el usuario empieza hacer la modificacion de los campos y hace clic en guardar cambios
      Then la vista se actualiza mostrando los nuevos datos

    Scenario: Edicion con campos obligatorios vacios
      Given Que El Usuario Esta En El Formulario
      When el usuario deja los campos obligatorios vacios y hace clic en guardar cambios
      Then no deja salir del formulario