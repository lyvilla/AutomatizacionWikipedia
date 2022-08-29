package co.com.test.wikipedia.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CrearCuentaUsuarioPage {

    public final static String LBLUSUARIO = "wpName2";

    public final static String LBLCONTRASENIA = "wpPassword2";

    public final static String LBLCONFIRMAR_CONTRASENIA = "wpRetype";

    public final static String LBLCORREO = "wpEmail";

    public static final Target CREAR_CUENTA = Target.the("Click en crear cuenta")
            .locatedBy("//li[@id='pt-createaccount']");

    public static final Target TXTCREAR_CUENTA = Target.the("Comparar el texto")
            .locatedBy("//button[@id='wpCreateaccount']");


}
