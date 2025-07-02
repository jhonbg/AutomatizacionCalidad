package co.edu.udea.calidadv.fleetguar360.stepdefinitions;

import co.edu.udea.calidadv.fleetguar360.questions.ValidationEditUnit;
import co.edu.udea.calidadv.fleetguar360.tasks.EditUnit;
import co.edu.udea.calidadv.fleetguar360.tasks.EditUnitError;
import co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class EditUnitStepDefinition {

    public WebDriver driver;

    private Actor usuario = new Actor("usuario");
    Fleetguar360Interface fleetguar360Interface = new Fleetguar360Interface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que el usuario esta en el formulario")
    public void queElUsuarioEstaEnElFormulario() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://fleet-guar360.vercel.app/gestionFlota"));
    }

    @When("el usuario empieza hacer la modificacion de los campos y hace clic en guardar cambios")
    public void elUsuariempizaHacerLaModificacionDeLosCamposYHacerLaClicEn() {
        usuario.attemptsTo(EditUnit.editUnit());
    }

    @Then("la vista se actualiza mostrando los nuevos datos")
    public void laVistaSeActualizaMostrandoLosNuevosDatos() {
        usuario.should(seeThat(ValidationEditUnit.validationEditUnit(), equalTo(true)));
    }

    @Given("Que El Usuario Esta En El Formulario")
    public void QueElUsuarioEstaEnElFormulario() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://fleet-guar360.vercel.app/gestionFlota"));
    }

    @When("el usuario deja los campos obligatorios vacios y hace clic en guardar cambios")
    public void elUsuarioDejaLosCamposObligatoriosVaciosHaceClicEn() {
        usuario.attemptsTo(EditUnitError.editUnitError());
    }

    @Then("no deja salir del formulario")
    public void noDejaSalirDelFormulario() {
        //todo task
    }
}
