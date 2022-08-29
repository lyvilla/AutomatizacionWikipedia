package co.com.test.wikipedia.steps;

import co.com.test.wikipedia.questions.ResultadoBusqueda;
import co.com.test.wikipedia.questions.ResultadoPagina;
import co.com.test.wikipedia.tasks.Buscar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuscarPalabraStep {

    @Cuando("Lisney ingrese la {string}")
    public void lisneyIngreseLa(String sistema) {
        theActorInTheSpotlight().attemptsTo(Buscar.laPalbra(sistema));
    }
    @Entonces("debera ver en el resultado el {string}")
    public void deberaVerEnElResultadoEl(String resultado) {
        theActorInTheSpotlight().should(seeThat(ResultadoBusqueda.palabra(), equalTo(resultado)));

    }
}
