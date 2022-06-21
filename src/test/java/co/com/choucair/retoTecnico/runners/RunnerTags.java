package co.com.choucair.retoTecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/retoTecnico.feature",
        tags = "@stories",
        glue = "co.com.choucair.retoTecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
