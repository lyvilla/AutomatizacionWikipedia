# ![Serenity BDD](docs/wikipedia logo.png "Logo Title Text 1")


# Prueba automatizada para realizar la búsqueda en Wikipedia

# ![Serenity BDD](docs/serenity.png "Logo Title Text 1")

## Framework

* Serenity: Se utiliza como framework Serenity BDD, que utiliza los resultados de las pruebas para realizar la documentación describiendo lo que hace la aplicación, informa que pruebas se han realizado, las pruebas que fallaron y las que pasaron. 

## Patron de desarrollo

* Se utiliza Screenplay pattern ya que esta centrado en el usuario y orientado a tareas, utiliza los principios S.O.L.I.D. Con screenplay se puede escribir el codigo en un lenguaje mas natural.

## Herramientas de compilación 

# ![Serenity BDD](docs/maven.png "Logo Title Text 1")

### Maven

* Es un gestor de proyectos.

# ![Serenity BDD](docs/cucumber.png "Logo Title Text 1")

### Cucumber

* Es una herramienta que permite escribir los casos de prueba.

## La estructura completa del proyecto es la siguiente:

* Features: Utiliza lenguaje Gherkin y contienen los escenarios de negocio del caso de prueba. 
* Tasks: Clases que representan tareas que realiza el actor a nivel de proceso de negocio. 
* Questions: Comprueban los resultados de las operaciones realizadas.
* Pages: Es una clase abstracta que se utiliza para agrupar métodos relacionados con cuerpos vacíos.


# Requerimientos

* Java JDK 1.8 
* Gestor de proyectos maven 

# Comandos para ejecutar el proyecto.

* mvn clean verify


## Autores

Lisney Villa Salgado - lisney005@gmail.com
