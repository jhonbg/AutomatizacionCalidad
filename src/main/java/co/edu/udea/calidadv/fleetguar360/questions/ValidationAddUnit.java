package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.newUnit;

public class ValidationAddUnit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroIdUnit = Text.of(newUnit).answeredBy(actor);
        return numeroIdUnit.equals("006");
    }

    public static ValidationAddUnit validationAddUnit(){
        return new ValidationAddUnit();
    }
}
