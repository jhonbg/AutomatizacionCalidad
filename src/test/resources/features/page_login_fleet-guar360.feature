#Autor: Jhon Botero Ana Patiño
  #Language: en

  Feature: Loguearme en la plataforma FleetGuard360
    Como usuario de la plataforma FleetGuard360
    necesito ingresar mi usuario y contraseña
    para que me redirija a la página principal y pueda acceder a la información

    Scenario: Logueo exitoso
      Given que estoy en el sitio FleetGuard360
      When ingreso mi usuario y contrasena
      Then me redirige a la pagina principal para acceder a la informacion de la plataforma

    Scenario: Logueo erroneo
      Given Que estoy en el sitio FleetGuard360
      When ingreso un usuario y contrasena invalidos
      Then me saca un mensaje que dice Credenciales incorrectas