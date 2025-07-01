package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesLoginError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginErroneo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesLoginError.loginUsuario());
    }

    public static LoginErroneo conCredencialesInvalidas(){
        return Tasks.instrumented(LoginErroneo.class);
    }
}
