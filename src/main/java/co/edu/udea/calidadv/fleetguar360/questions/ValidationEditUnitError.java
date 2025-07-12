package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationEditUnitError implements Question<Boolean> {

    private final String mesPlaca;
    private final String mesModelo;
    private final String mesCapacidad;

    public ValidationEditUnitError(String placa, String modelo, String capacidad) {
        this.mesPlaca = placa;
        this.mesModelo = modelo;
        this.mesCapacidad = capacidad;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String validarPlaca = Text.of(validacionPlacaError).answeredBy(actor);
        String validarModelo = Text.of(validacionModeloError).answeredBy(actor);
        String validarCapacidad = Text.of(validacionCapacidadError).answeredBy(actor);
        return validarPlaca.equals(mesPlaca) && validarModelo.equals(mesModelo) && validarCapacidad.equals(mesCapacidad);
    }

    public static ValidationEditUnitError validationEditUnitError(String mesPlaca, String mesModelo, String mesCapacidad) {
        return new ValidationEditUnitError(mesPlaca, mesModelo, mesCapacidad);
    }
}
