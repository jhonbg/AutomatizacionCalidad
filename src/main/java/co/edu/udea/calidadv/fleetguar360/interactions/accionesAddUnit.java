package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesAddUnit implements Interaction {

    private final String placa;
    private final String modelo;
    private final String capacidad;

    public accionesAddUnit(String placa, String modelo, String capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
        actor.wasAbleTo(Click.on(buttonAgregarUnidad));
        actor.attemptsTo(Enter.theValue(placa).into(placaA));
        actor.attemptsTo(Enter.theValue(modelo).into(modeloA));
        actor.wasAbleTo(Click.on(coductorA));
        actor.wasAbleTo(Click.on(primerConductor));
        actor.attemptsTo(Enter.theValue(capacidad).into(capacidadA));
        actor.wasAbleTo(Click.on(buttonGuardarUnidad));
    }

    public static accionesAddUnit clickAgregarUnidad(String placa, String modelo, String capacidad) {
        return Tasks.instrumented(accionesAddUnit.class, placa, modelo, capacidad);
    }
}
