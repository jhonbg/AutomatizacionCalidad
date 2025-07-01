package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesLogin implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("usuarioTest@gmail.com").into(email));
        actor.attemptsTo(Enter.theValue("ABCD1234").into(password));
        actor.wasAbleTo(Click.on(buttonLogin));
    }

    public static accionesLogin loginUsuario(){
        return Tasks.instrumented(accionesLogin.class);
    }
}