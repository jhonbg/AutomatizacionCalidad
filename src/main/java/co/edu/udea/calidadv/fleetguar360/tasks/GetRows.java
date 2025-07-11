package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesRowsBefore;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GetRows implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesRowsBefore.clickObtenerFilas());
    }

    public static GetRows getRows() {
        return Tasks.instrumented(GetRows.class);
    }
}
