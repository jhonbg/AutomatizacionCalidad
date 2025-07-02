package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;
import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.buttonGuardarCambios;
import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.capacidadE;
import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.modeloE;

public class accionesEditUnitError implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
        actor.wasAbleTo(Click.on(buttonEditor));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a",Keys.DELETE)).into(placaE));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a",Keys.DELETE)).into(modeloE));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a",Keys.DELETE)).into(capacidadE));
        actor.wasAbleTo(Click.on(buttonGuardarCambios));
    }

    public static accionesEditUnitError editUnitError(){
        return Tasks.instrumented(accionesEditUnitError.class);
    }
}
