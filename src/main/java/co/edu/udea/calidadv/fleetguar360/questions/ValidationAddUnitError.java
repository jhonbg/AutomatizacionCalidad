package co.edu.udea.calidadv.fleetguar360.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationAddUnitError implements Question<Boolean> {

    private final String mesPlaca;
    private final String mesModelo;
    private final String mesCapacidad;

    public ValidationAddUnitError(String placa, String modelo, String capacidad) {
        this.mesPlaca = placa;
        this.mesModelo = modelo;
        this.mesCapacidad = capacidad;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mesPlaca = Text.of(mesPlacaA).answeredBy(actor);
        String mesModelo = Text.of(mesModeloA).answeredBy(actor);
        String mesCapacidad = Text.of(mesCapacidadA).answeredBy(actor);
        return mesPlaca.equals(mesPlaca)
                && mesModelo.equals(mesModelo)
                && mesCapacidad.equals(mesCapacidad);
    }

    public static ValidationAddUnitError clickAgregarUnidad(String mesPlaca, String mesModelo, String mesCapacidad) {
        return new ValidationAddUnitError(mesPlaca, mesModelo, mesCapacidad);
    }
}
