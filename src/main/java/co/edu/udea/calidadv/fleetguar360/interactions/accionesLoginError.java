package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesLoginError implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("usuarioTest@gmail.com").into(email));
        actor.attemptsTo(Enter.theValue("ABCD123").into(password));
        actor.wasAbleTo(Click.on(buttonLogin));
    }

    public static accionesLoginError loginUsuario(){
        return Tasks.instrumented(accionesLoginError.class);
    }
}
