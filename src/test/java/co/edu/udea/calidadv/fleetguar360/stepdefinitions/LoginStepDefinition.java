package co.edu.udea.calidadv.fleetguar360.stepdefinitions;

import co.edu.udea.calidadv.fleetguar360.questions.ValidationLogin;
import co.edu.udea.calidadv.fleetguar360.questions.ValidationLoginError;
import co.edu.udea.calidadv.fleetguar360.tasks.Login;
import co.edu.udea.calidadv.fleetguar360.tasks.LoginErroneo;
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

public class LoginStepDefinition {

    public WebDriver driver;

    private Actor usuario = new Actor("usuario");
    Fleetguar360Interface fleetguar360Interface = new Fleetguar360Interface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("This method is responsible for parameterizing the instantiation of chromedriver")
    public void thisMethodIsResponsibleForParameterizingTheInstantiationOfChromedriver()
    {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("pages.swaglabsUrl"));
    }

    @Given("que estoy en el sitio FleetGuard360")
    public void entreAlSitioFleetguar360() {
        usuario.wasAbleTo(Open.browserOn(fleetguar360Interface));
    }

    @When("ingreso mi usuario y contrasena")
    public void cuandoIntroduscaMiUsuarioYContrasena() {
       usuario.attemptsTo(Login.LoginUsuario());
    }

    @Then("me redirige a la pagina principal para acceder a la informacion de la plataforma")
    public void meRedirigeALaPaginaPrincipalParaTenerAccesoALaInformacionDeLaPlataforma() {
        usuario.should(seeThat(ValidationLogin.validaLogin(), equalTo(true)));
    }

    @When("ingreso un usuario y contrasena invalidos")
    public void ingresoUnUsuarioYContrasenaInvalidos() {
        usuario.attemptsTo(LoginErroneo.conCredencialesInvalidas());
    }

    @Then("me saca un mensaje que dice Credenciales incorrectas")
    public void meSacaUnMensajeQueDiceCredencialesIncorrectas() {
        usuario.should(seeThat(ValidationLoginError.validaLoginError(), equalTo(true)));
    }

}
