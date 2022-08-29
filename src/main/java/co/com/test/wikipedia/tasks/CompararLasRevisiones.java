package co.com.test.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.InputField;

import static co.com.test.wikipedia.pages.ValidarFuncionalidadPages.*;

public class CompararLasRevisiones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(InputField.withNameOrId(BTN1)),
                Click.on(InputField.withNameOrId(BTN2)),
                Click.on(COMPRAR_REVISIONES));


    }

    public static CompararLasRevisiones seleccionadas(){
        return Tasks.instrumented(CompararLasRevisiones.class);
    }
}
