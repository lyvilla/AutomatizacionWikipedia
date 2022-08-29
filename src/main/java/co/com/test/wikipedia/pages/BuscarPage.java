package co.com.test.wikipedia.pages;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarPage {


    public static final String LBLBUSCAR = "search";

    public static final String BTNBUSCAR = "searchButton";

    public static final Target ANALISIS_CEEM = Target.the("Analisis Ceem")
            .locatedBy("//h3/span[contains(text(), 'Análisis CEEM')]");

}
