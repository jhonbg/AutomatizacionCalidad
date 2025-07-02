package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationEditUnitError implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String validarPlaca = Text.of(validacionPlacaError).answeredBy(actor);
        String validarModelo = Text.of(validacionModeloError).answeredBy(actor);
        String validarCapacidad = Text.of(validacionCapacidadError).answeredBy(actor);
        return validarPlaca.equals("La placa debe tener al menos 6 caracteres") && validarModelo.equals("El modelo debe tener al menos 3 caracteres") && validarCapacidad.equals("Debe ingresar la capacidad");
    }

    public static ValidationEditUnitError validationEditUnitError(){
        return new ValidationEditUnitError();
    }
}
