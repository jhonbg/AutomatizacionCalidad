package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesAddUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddUnit implements Task {

    private final String placa;
    private final String modelo;
    private final String capacidad;

    public AddUnit(String placa, String modelo, String capacidad){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesAddUnit.clickAgregarUnidad(placa,modelo,capacidad));
    }

    public static AddUnit addUnit(String placa, String modelo, String capacidad){
        return Tasks.instrumented(AddUnit.class, placa, modelo, capacidad);
    }
}
