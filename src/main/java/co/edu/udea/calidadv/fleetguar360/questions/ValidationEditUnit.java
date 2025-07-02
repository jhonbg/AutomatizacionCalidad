package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationEditUnit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String validadorPlaca = Text.of(validacionEditPlaca).answeredBy(actor);
        String validadorModelo = Text.of(validacionEditModelo).answeredBy(actor);
        String validadorCapacidad = Text.of(validacionEditCapacidad).answeredBy(actor);
        return validadorPlaca.equals("ABC-124")
                && validadorModelo.equals("Toyota Hilux 2023")
                && validadorCapacidad.equals("2 toneladas");
    }

    public static ValidationEditUnit validationEditUnit(){
        return new ValidationEditUnit();
    }
}
