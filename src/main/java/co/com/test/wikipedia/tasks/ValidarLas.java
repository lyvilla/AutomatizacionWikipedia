package co.com.test.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.test.wikipedia.pages.ValidarFuncionalidadPages.VERION_MOVIL;
import static co.com.test.wikipedia.pages.ValidarFuncionalidadPages.VERION_ESCRITORIO;

public class ValidarLas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(VERION_MOVIL),
                Click.on(VERION_MOVIL),
                Scroll.to(VERION_ESCRITORIO),
                Click.on(VERION_ESCRITORIO));
    }

    public static ValidarLas funcionalidades(){
        return Tasks.instrumented(ValidarLas.class);
    }
}
