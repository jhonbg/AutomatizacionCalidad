package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ObtenerCantidadFilas implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return nuberUnit.resolveAllFor(actor).size();
    }

    public static ObtenerCantidadFilas ObtenerCantidadFilas() {
        return new ObtenerCantidadFilas();
    }
}
