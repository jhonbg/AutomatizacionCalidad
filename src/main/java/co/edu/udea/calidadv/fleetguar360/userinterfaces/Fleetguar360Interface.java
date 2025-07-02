package co.edu.udea.calidadv.fleetguar360.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Fleetguar360Interface extends PageObject {
    public static final Target email= Target.the("email").locatedBy("//*[@id='email']");
    public static final Target password= Target.the("password").locatedBy("//*[@id='password']");
    public static final Target buttonLogin= Target.the( "buttonLogin").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/form/div[1]/button");
    public static final Target texto= Target.the( "texto").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/div");
    public static final Target buttonGestionFlota= Target.the("buttonGestionFlota").locatedBy("//*[@id='__next']/div/aside/nav/div/button[2]");
    public static final Target buttonEditor= Target.the("buttonEditor").locatedBy("//*[@id='__next']/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[7]/div/button[1]");
    public static final Target placa= Target.the("placa").locatedBy("//*[@id='«r6»-form-item']");
    public static final Target modelo= Target.the( "modelo").locatedBy("//*[@id='«r7»-form-item']");
    public static final Target capacidad= Target.the("capacidad").locatedBy("//*[@id='«ra»-form-item']");
    public static final Target buttonGuardarCambios= Target.the("buttoGuardarCambios").locatedBy("//*[@id='radix-«r3»']/form/div[6]/button[2]");
    public static final Target validacionEditPlaca=Target.the("validacionEditPlaca").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]");
    public static final Target validacionEditModelo=Target.the("validacionEditModelo").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]");
    public static final Target validacionEditCapacidad=Target.the("validacionEditCapacidad").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]");
    public static final Target placaError=Target.the("placaError").locatedBy("//*[@id='radix-«r1c»']");
}