package co.com.test.wikipedia.steps;

import co.com.test.wikipedia.questions.CrearTu;
import co.com.test.wikipedia.tasks.CrearlaCuenta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CrearCuentaUsuarioSteps {

    @Cuando("Lisney diligencie el formulario con la informacion {string} {string}{string} {string}")
    public void lisneyDiligencieElFormularioConLaInformacion(String usuario, String contrasenia, String confirmarContrasenia, String correo) {
        theActorInTheSpotlight().attemptsTo(CrearlaCuenta.deUsuario(usuario, contrasenia, confirmarContrasenia,correo));
    }
    @Entonces("deberá ver el botón {string}")
    public void deberáVerElBotón(String crearTuCuenta) {
        theActorInTheSpotlight().should(seeThat(CrearTu.Cuenta(), equalTo(crearTuCuenta)));
    }
}
