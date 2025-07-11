package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesLoginError implements Interaction {

    private final String correo;
    private final String contrasena;

    public accionesLoginError(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correo).into(email));
        actor.attemptsTo(Enter.theValue(contrasena).into(password));
        actor.wasAbleTo(Click.on(buttonLogin));
    }

    public static accionesLoginError loginUsuario(String correo, String contrasena) {
        return Tasks.instrumented(accionesLoginError.class, correo, contrasena);
    }
}
