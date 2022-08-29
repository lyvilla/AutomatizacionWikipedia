package co.com.test.wikipedia.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class InicioPage extends PageObject {

    public static final Target BIENVENIDOS = Target.the("Texto Bienvenidos")
            .locatedBy("//span[@id= 'Bienvenidos_a_Wikipedia,']");

}
