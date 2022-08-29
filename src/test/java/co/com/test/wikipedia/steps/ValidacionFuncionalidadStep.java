package co.com.test.wikipedia.steps;

import co.com.test.wikipedia.questions.ResultadoComparar;
import co.com.test.wikipedia.tasks.CompararLasRevisiones;
import co.com.test.wikipedia.tasks.ValidarLas;
import co.com.test.wikipedia.tasks.VerEl;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ValidacionFuncionalidadStep {

    @Cuando("lisney seleccione la opcion version movil y la opcion version escritorio")
    public void lisneySeleccioneLaOpcionVersionMovilYLaOpcionVersionEscritorio() {
        theActorInTheSpotlight().attemptsTo(ValidarLas.funcionalidades());
    }

    @Cuando("Lisney seleccione ver historial")
    public void lisneySeleccioneVerHistorial() {
        theActorInTheSpotlight().attemptsTo(VerEl.historial());
    }

    @Cuando("selecciona dos radio button seguidamente da click en Comparar revisiones seleccionadas")
    public void seleccionaDosRadioButtonSeguidamenteDaClickEnCompararRevisionesSeleccionadas() {
        theActorInTheSpotlight().attemptsTo(CompararLasRevisiones.seleccionadas());
    }

    @Entonces("podrá ver el título {string}")
    public void podráVerElTítulo(String Titulo) {
       theActorInTheSpotlight().should(seeThat(ResultadoComparar.revisiones(), equalTo(Titulo)));
    }

}
