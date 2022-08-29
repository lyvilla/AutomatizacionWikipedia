#language: es
Característica: Automatización de Wikipedia para validar ciertas funcionalidades
  Yo quiero validar las funcionalidades de la pagina

  Antecedentes:Ingreso a la pagina
    Dado que 'lisney' ingresa a la pagina Wikipedia

  @version
  Escenario: Validación funcionalidad escritorio y movil wikipedia
    Cuando lisney seleccione la opcion version movil y la opcion version escritorio
    Entonces debo visualizar el titulo 'Bienvenidos a Wikipedia,'

  @historial
  Escenario: Validación ver historial
    Cuando Lisney seleccione ver historial
    Y selecciona dos radio button seguidamente da click en Comparar revisiones seleccionadas
    Entonces podrá ver el título 'Explorar historial interactivamente'
