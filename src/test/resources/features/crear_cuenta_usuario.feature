#language: es
Característica: Automatizacion de Wikipedia para crear una cuenta de usuario
  Yo quiero crear una cuenta de usuario

  Esquema del escenario: Crear cuenta de usuario
    Dado que 'lisney' ingresa a la pagina Wikipedia
    Cuando Lisney diligencie el formulario con la informacion '<usuario>' '<contrasenia>''<confirmarContrasenia>' '<correo>'
    Entonces deberá ver el botón 'Crea tu cuenta'

    Ejemplos:
      | usuario | contrasenia | confirmarContrasenia | correo            |
      | prueba  | prueba123   | prueba123            | prueba@prueba.com |