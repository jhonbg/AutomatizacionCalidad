package co.edu.udea.calidadv.fleetguar360.stepdefinitions;

import co.edu.udea.calidadv.fleetguar360.questions.ObtenerCantidadFilas;
import co.edu.udea.calidadv.fleetguar360.questions.ValidationAddUnit;
import co.edu.udea.calidadv.fleetguar360.questions.ValidationAddUnitError;
import co.edu.udea.calidadv.fleetguar360.tasks.AddUnit;

import co.edu.udea.calidadv.fleetguar360.tasks.AddUnitError;
import co.edu.udea.calidadv.fleetguar360.tasks.GetRows;
import co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.buttonGestionFlota;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class AddUnitStepDefinition {

    public WebDriver driver;
    int filasAntes;

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

    @When("el usuario ingresa la placa {string}, modelo {string}, selecciona un conductor, capacidad {string} y hace clic en el boton guadar")
    public void elUsuarioIngresaLaPlacaModeloSeleccionaUnConductorCapacidadYHaceClicEnElBotonGuadar3(String placa, String modelo, String capacidad) {
        usuario.attemptsTo(GetRows.getRows());
        filasAntes = usuario.asksFor(ObtenerCantidadFilas.ObtenerCantidadFilas());
        usuario.attemptsTo(AddUnit.addUnit(placa, modelo, capacidad));
    }

    @Then("la nueva unidad se muestra registrada en la lista de unidades")
    public void laNuevaUnidadSeMuestraRegistradaEnLaListaDeUnidades() {
        usuario.attemptsTo(Click.on(buttonGestionFlota));
        usuario.should(seeThat(ValidationAddUnit.validationAddUnit(filasAntes), equalTo(true)));
    }

    @When("el usuario deja los campos obligatorios vacíos y hace clic en el boton guardar")
    public void elUsurioDejaLosCamposObligatoriosVaciosYHaceClicEnElBotonGuardar() {
        usuario.attemptsTo(AddUnitError.clickAgregarUnidad());
    }

    @Then("se muestra un mensaje indicando que debe completar todos los campos requeridos {string}{string}{string}")
    public void seMuestraUnMensajeIndicandoQueDebeCompletarTodosLosCamposRequeridos(String mesPlaca, String mesModelo, String mesCapacidad) {
        usuario.should(seeThat(ValidationAddUnitError.clickAgregarUnidad(mesPlaca, mesModelo, mesCapacidad), equalTo(true)));
    }
}
