package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.buttonGestionFlota;

public class accionesRowsBefore implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
    }

    public static accionesRowsBefore clickObtenerFilas() {
        return Tasks.instrumented(accionesRowsBefore.class);
    }
}
