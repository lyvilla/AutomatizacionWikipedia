package co.com.test.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.wikipedia.pages.CrearCuentaUsuarioPage.TXTCREAR_CUENTA;

public class CrearTu implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXTCREAR_CUENTA).answeredBy(actor);
    }

    public static CrearTu Cuenta(){
        return new CrearTu();
    }
}
