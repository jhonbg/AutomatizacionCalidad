package co.edu.udea.calidadv.fleetguar360.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Fleetguar360Interface extends PageObject {
    public static final Target email= Target.the("email").locatedBy("//*[@id='email']");
    public static final Target password= Target.the("password").locatedBy("//*[@id='password']");
    public static final Target buttonLogin= Target.the( "buttonLogin").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/form/div[1]/button");
    public static final Target texto= Target.the( "texto").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/div");
}