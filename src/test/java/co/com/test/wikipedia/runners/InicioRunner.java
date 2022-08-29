package co.com.test.wikipedia.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Inicio.feature",
        glue = "co/com/test/wikipedia/steps",
        snippets = CAMELCASE)

public class InicioRunner {
}
