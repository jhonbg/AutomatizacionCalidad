package co.edu.udea.calidadv.fleetguar360.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_unit_fleet-guar360.feature",
        glue = "co.edu.udea.calidadv.fleetguar360.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddUnitRunner {
}
