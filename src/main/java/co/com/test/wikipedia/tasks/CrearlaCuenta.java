package co.com.test.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ui.InputField;

import static co.com.test.wikipedia.pages.CrearCuentaUsuarioPage.*;

public class CrearlaCuenta implements Task {

    private String usuario;
    private String contrasenia;
    private String confirmarContrasenia;
    private String correo;

    public CrearlaCuenta(String usuario, String contrasenia, String confirmarContrasenia, String correo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.confirmarContrasenia = confirmarContrasenia;
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CREAR_CUENTA),
                Enter.theValue(usuario).into(InputField.withNameOrId(LBLUSUARIO)),
                Enter.theValue(contrasenia).into(InputField.withNameOrId(LBLCONTRASENIA)),
                Enter.theValue(confirmarContrasenia).into(InputField.withNameOrId(LBLCONFIRMAR_CONTRASENIA)),
                Enter.theValue(correo).into(InputField.withNameOrId(LBLCORREO)));


    }

    public static CrearlaCuenta deUsuario(String usuario, String contrasenia, String confirmarContrasenia, String correo){
        return Tasks.instrumented(CrearlaCuenta.class, usuario, contrasenia, confirmarContrasenia, correo);
    }
}
