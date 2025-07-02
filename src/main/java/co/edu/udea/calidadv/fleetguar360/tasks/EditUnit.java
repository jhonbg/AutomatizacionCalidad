package co.edu.udea.calidadv.fleetguar360.tasks;


import co.edu.udea.calidadv.fleetguar360.interactions.accionesEditUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EditUnit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesEditUnit.editUnit());
    }

    public static EditUnit editUnit() {
        return Tasks.instrumented(EditUnit.class);
    }
}
