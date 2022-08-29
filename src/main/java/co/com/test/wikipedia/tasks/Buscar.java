package co.com.test.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

import static co.com.test.wikipedia.pages.BuscarPage.*;

public class Buscar implements Task {
    private String palabra;

    public Buscar(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(palabra);

        actor.attemptsTo(
                Enter.theValue(palabra).into(InputField.withNameOrId(LBLBUSCAR)),
                Click.on(InputField.withNameOrId(BTNBUSCAR)
                ));

        actor.attemptsTo(Scroll.to(ANALISIS_CEEM));
    }

    public static Buscar laPalbra(String palabra){
        return Tasks.instrumented(Buscar.class, palabra);
    }
}
