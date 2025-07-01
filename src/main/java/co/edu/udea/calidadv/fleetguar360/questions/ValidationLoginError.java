package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidadv.fleetguar360.userinterfaces.Fleetguar360Interface.texto;

public class ValidationLoginError implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String errorMessage= Text.of(texto).answeredBy(actor);
        if(errorMessage.equals("Credenciales incorrectas")){
            return true;
        }
        return false;
    }

    public static ValidationLoginError validaLoginError(){
        return new ValidationLoginError();
    }
}
