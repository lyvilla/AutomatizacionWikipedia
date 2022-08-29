package co.com.test.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.wikipedia.pages.ValidarFuncionalidadPages.TITULO;

public class ResultadoComparar implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TITULO).answeredBy(actor);
    }
    public static ResultadoComparar revisiones(){
        return new ResultadoComparar();
    }
}
