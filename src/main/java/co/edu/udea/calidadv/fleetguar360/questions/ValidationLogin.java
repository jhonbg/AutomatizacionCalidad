package co.edu.udea.calidadv.fleetguar360.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;




public class ValidationLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String currentUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        if(currentUrl.equals("https://fleet-guar360.vercel.app/gestionFlota")){
            return true;
        }
        return false;
    }

    public static ValidationLogin validaLogin(){
        return new ValidationLogin();
    }
}