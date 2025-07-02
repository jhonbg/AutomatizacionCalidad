package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesAddUnitError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddUnitError implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesAddUnitError.clickAgregarUnidad());
    }

    public static AddUnitError clickAgregarUnidad() {
        return Tasks.instrumented(AddUnitError.class);
    }
}
