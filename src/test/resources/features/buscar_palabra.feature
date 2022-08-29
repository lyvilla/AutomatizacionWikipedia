#language: es
Característica: Automatizacion de Wikipedia para realizar una búsqueda
  Yo quiero realizar la busqueda de la palabra sistema en Wikipedia

  Esquema del escenario: Buscar palabra
    Dado que 'lisney' ingresa a la pagina Wikipedia
    Cuando Lisney ingrese la '<palabra>'
    Entonces debera ver en el resultado el '<titulo>'

    Ejemplos:
      | palabra  | titulo        |
      | sistemas | Análisis CEEM |
      | Sistemas | Análisis CEEM |