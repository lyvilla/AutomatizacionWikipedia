package co.com.test.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.wikipedia.pages.InicioPage.BIENVENIDOS;

public class ResultadoPagina implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BIENVENIDOS).answeredBy(actor);
    }

    public static ResultadoPagina principalEs(){
        return new ResultadoPagina();
    }
}
