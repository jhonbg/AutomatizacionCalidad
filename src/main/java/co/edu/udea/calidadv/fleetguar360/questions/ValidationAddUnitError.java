package co.edu.udea.calidadv.fleetguar360.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationAddUnitError implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mesPlaca = Text.of(mesPlacaA).answeredBy(actor);
        String mesModelo = Text.of(mesModeloA).answeredBy(actor);
        String mesCapacidad = Text.of(mesCapacidadA).answeredBy(actor);
        return mesPlaca.equals("La placa debe tener al menos 6 caracteres")
                && mesModelo.equals("El modelo debe tener al menos 3 caracteres")
                && mesCapacidad.equals("Debe ingresar la capacidad");
    }

    public static ValidationAddUnitError clickAgregarUnidad() {
        return new ValidationAddUnitError();
    }
}
