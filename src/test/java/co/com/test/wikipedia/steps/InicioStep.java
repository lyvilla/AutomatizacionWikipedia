package co.com.test.wikipedia.steps;

import co.com.test.wikipedia.questions.ResultadoPagina;
import co.com.test.wikipedia.tasks.AbrirPagina;
import static org.hamcrest.Matchers.equalTo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioStep {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Dado("que {string} ingresa a la pagina Wikipedia")
    public void queIngresaALaPaginaWikipedia(String actor) {
        theActorCalled(actor).wasAbleTo(AbrirPagina.wikipedia());
    }
    @Entonces("debo visualizar el titulo {string}")
    public void deboVisualizaElTitulo(String Bienvenido) {
        theActorInTheSpotlight().should(seeThat(ResultadoPagina.principalEs(), equalTo(Bienvenido)));
    }
}
