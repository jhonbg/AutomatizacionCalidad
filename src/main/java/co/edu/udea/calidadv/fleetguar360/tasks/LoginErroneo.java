package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesLoginError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginErroneo implements Task {

    private final String correo;
    private final String contrasena;

    public LoginErroneo(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesLoginError.loginUsuario(correo, contrasena));
    }

    public static LoginErroneo conCredencialesInvalidas(String correo, String contrasena) {
        return Tasks.instrumented(LoginErroneo.class, correo, contrasena);
    }
}
