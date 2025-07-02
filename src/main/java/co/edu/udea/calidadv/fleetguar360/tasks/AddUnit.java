package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesAddUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddUnit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesAddUnit.clickAgregarUnidad());
    }

    public static AddUnit addUnit(){
        return Tasks.instrumented(AddUnit.class);
    }
}
