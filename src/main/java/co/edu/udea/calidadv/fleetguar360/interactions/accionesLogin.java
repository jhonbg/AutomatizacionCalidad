package co.edu.udea.calidadv.fleetguar360.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class accionesLogin implements Interaction {

    private final String correo;
    private final String contrasena;

    public accionesLogin(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correo).into(email));
        actor.attemptsTo(Enter.theValue(contrasena).into(password));
        actor.wasAbleTo(Click.on(buttonLogin));
    }

    public static accionesLogin loginUsuario(String usuario, String contrasena) {
        return Tasks.instrumented(accionesLogin.class, usuario, contrasena);
    }
}