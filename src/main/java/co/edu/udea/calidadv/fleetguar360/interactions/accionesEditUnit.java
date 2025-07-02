package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesEditUnit implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
        actor.wasAbleTo(Click.on(buttonEditor));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + "ABC-124").into(placa));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + "Toyota Hilux 2023").into(modelo));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + "2 toneladas").into(capacidad));
        actor.wasAbleTo(Click.on(buttonGuardarCambios));
    }

    public static accionesEditUnit editUnit(){
        return Tasks.instrumented(accionesEditUnit.class);
    }
}
