package co.com.test.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.wikipedia.pages.BuscarPage.ANALISIS_CEEM;

public class ResultadoBusqueda implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ANALISIS_CEEM).answeredBy(actor);
    }

    public static ResultadoBusqueda palabra(){
        return new ResultadoBusqueda();
    }

}
