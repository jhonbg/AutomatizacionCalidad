package co.edu.udea.calidadv.fleetguar360.stepdefinitions;

import co.edu.udea.calidadv.fleetguar360.questions.ValidationAddUnit;
import co.edu.udea.calidadv.fleetguar360.questions.ValidationAddUnitError;
import co.edu.udea.calidadv.fleetguar360.tasks.AddUnit;

import co.edu.udea.calidadv.fleetguar360.tasks.AddUnitError;
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


public class AddUnitStepDefinition {

    public WebDriver driver;

    private Actor usuario = new Actor("usuario");
    Fleetguar360Interface fleetguar360Interface = new Fleetguar360Interface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que el usuario se encuentra en el formulario de agregar nueva unidad")
    public void queElUsuarioSeEncuentraEnElFormularioDeNuevosUnidad() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://fleet-guar360.vercel.app/gestionFlota"));
    }

    @When("el usuario ingresa la placa, modelo, selecciona un conductor, capacidad y hace clic en el boton guadar")
    public void elUsuarioIngresaLaPlacaModeloSeleccionaUnConductorCapacidadYHaceClicEnElBotonGuadar3() {
        usuario.attemptsTo(AddUnit.addUnit());
    }

    @Then("la nueva unidad se muestra registrada en la lista de unidades")
    public void laNuevaUnidadSeMuestraRegistradaEnLaListaDeUnidades() {
        usuario.should(seeThat(ValidationAddUnit.validationAddUnit(), equalTo(true)));
    }

    @When("el usuario deja los campos obligatorios vacíos y hace clic en el boton guardar")
    public void elUsurioDejaLosCamposObligatoriosVaciosYHaceClicEnElBotonGuardar() {
        usuario.attemptsTo(AddUnitError.clickAgregarUnidad());
    }

    @Then("se muestra un mensaje indicando que debe completar todos los campos requeridos")
    public void seMuestraUnMensajeIndicandoQueDebeCompletarTodosLosCamposRequeridos() {
        usuario.should(seeThat(ValidationAddUnitError.clickAgregarUnidad(), equalTo(true)));
    }
}
