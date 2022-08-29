package co.com.test.wikipedia.tasks;


import co.com.test.wikipedia.pages.InicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private InicioPage paginaPrincipal;

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn(paginaPrincipal));
    }

    public static AbrirPagina wikipedia(){
        return Tasks.instrumented(AbrirPagina.class);
    }
}
