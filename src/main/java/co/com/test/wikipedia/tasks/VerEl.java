package co.com.test.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.InputField;

import static co.com.test.wikipedia.pages.ValidarFuncionalidadPages.*;

public class VerEl implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(VER_HISTORIAL));

    }

    public static VerEl historial(){
      return Tasks.instrumented(VerEl.class);
    }

}
