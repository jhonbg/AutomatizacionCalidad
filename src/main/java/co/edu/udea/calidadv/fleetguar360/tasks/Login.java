package co.edu.udea.calidadv.fleetguar360.tasks;

import co.edu.udea.calidadv.fleetguar360.interactions.accionesLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Login implements Task {

    private final String correo;
    private final String contrasena;

    public Login(String usuario, String contrasena) {
        this.correo = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(accionesLogin.loginUsuario(correo, contrasena));
    }

    public static Login LoginUsuario(String usuario, String contrasena) {
        return Tasks.instrumented(Login.class, usuario,contrasena);
    }
}