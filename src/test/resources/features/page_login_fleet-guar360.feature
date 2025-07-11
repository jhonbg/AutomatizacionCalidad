#Autor: Jhon Botero Ana Patiño
  #Language: en

  Feature: Loguearme en la plataforma FleetGuard360
    Como usuario de la plataforma FleetGuard360
    necesito ingresar mi usuario y contraseña
    para que me redirija a la página principal y pueda acceder a la información

    Background:
      Given que estoy en el sitio FleetGuard360

    Scenario Outline: Logueo exitoso
      When ingreso mi usuario "<correo>" y contrasena "<contrasena>"
      Then me redirige a la pagina principal para acceder a la informacion de la plataforma

      Examples:
        | correo                 | contrasena        |
        | usuarioTest@gmail.com  | ABCD1234          |

    Scenario Outline: Logueo erroneo
      When ingreso un usuario "<correo>" y contrasena "<contrasena>" invalidos
      Then me saca un mensaje que dice Credenciales incorrectas

      Examples:
        | correo                 | contrasena        |
        | usuarioTest@gmail.com  | ABCD123         |