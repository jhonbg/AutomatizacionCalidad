package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.*;

public class ValidationAddUnit implements Question<Boolean> {

    private final int filasAntes;

    public ValidationAddUnit(int filasAntes) {

        this.filasAntes = filasAntes;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int filasDespues = nuberUnit.resolveAllFor(actor).size();
        return filasDespues == filasAntes + 1;
    }

    public static ValidationAddUnit validationAddUnit(int filasAntes) {
        return new ValidationAddUnit(filasAntes);
    }
}
