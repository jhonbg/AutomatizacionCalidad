package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesAddUnit implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
        actor.wasAbleTo(Click.on(buttonAgregarUnidad));
        actor.attemptsTo(Enter.theValue("ABC-124").into(placaA));
        actor.attemptsTo(Enter.theValue("Toyota Hilux 2023").into(modeloA));
        actor.wasAbleTo(Click.on(coductorA));
        actor.wasAbleTo(Click.on(primerConductor));
        actor.attemptsTo(Enter.theValue("2 toneladas").into(capacidadA));
        actor.wasAbleTo(Click.on(buttonGuardarUnidad));
    }

    public static accionesAddUnit clickAgregarUnidad(){
        return Tasks.instrumented(accionesAddUnit.class);
    }
}
