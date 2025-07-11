package co.edu.udea.calidadv.fleetguar360.tasks;


import co.edu.udea.calidadv.fleetguar360.interactions.accionesEditUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EditUnit implements Task {

    private final String placa;
    private final String modelo;
    private final String capacidad;

    public EditUnit(String placa, String modelo, String capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesEditUnit.editUnit(placa,modelo, capacidad));
    }

    public static EditUnit editUnit(String placa, String modelo, String capacidad) {
        return Tasks.instrumented(EditUnit.class,  placa,modelo, capacidad);
    }
}
