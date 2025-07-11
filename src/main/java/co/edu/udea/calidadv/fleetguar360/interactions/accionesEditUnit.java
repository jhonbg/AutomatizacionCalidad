package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesEditUnit implements Interaction {

    private final String placa;
    private final String modelo;
    private final String capacidad;

    public accionesEditUnit(String placa, String modelo, String capacidad){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(buttonGestionFlota));
        actor.wasAbleTo(Click.on(buttonEditor));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + placa).into(placaE));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + modelo).into(modeloE));
        actor.attemptsTo(Enter.theValue(Keys.chord(Keys.CONTROL, "a") + capacidad).into(capacidadE));
        actor.wasAbleTo(Click.on(buttonGuardarCambios));
    }

    public static accionesEditUnit editUnit(String placa, String modelo, String capacidad){
        return Tasks.instrumented(accionesEditUnit.class,placa,modelo,capacidad);
    }
}
