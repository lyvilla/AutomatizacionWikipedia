package co.com.test.wikipedia.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ValidarFuncionalidadPages {

    public static final Target VERION_MOVIL = Target.the("Click en el botón para volver la version en movil")
            .locatedBy("//li[@id='footer-places-mobileview']");

    public static final Target VERION_ESCRITORIO = Target.the("Click en el botón para volver la version en escritorio")
            .locatedBy("//li[@id='footer-places-desktop-toggle']");

    public static final Target VER_HISTORIAL = Target.the("Click para ver el historial")
            .locatedBy("//li[@id='ca-history']");

    public static final String BTN1 = "mw-oldid-112969012";

    public static final String BTN2 = "mw-diff-115085235";

    public static final Target COMPRAR_REVISIONES = Target.the("Click para comparar las revisiones seleccionadas")
            .locatedBy("//form[@id='mw-history-compare']/div/input");

    public static final Target TITULO = Target.the("Compara el titulo")
            .locatedBy("//span[@class='oo-ui-labelElement-label']");



}
