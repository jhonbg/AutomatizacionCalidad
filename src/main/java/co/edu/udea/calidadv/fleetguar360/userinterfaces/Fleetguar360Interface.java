package co.edu.udea.calidadv.fleetguar360.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Fleetguar360Interface extends PageObject {
    public static final Target email = Target.the("email").locatedBy("//*[@id='email']");
    public static final Target password = Target.the("password").locatedBy("//*[@id='password']");
    public static final Target buttonLogin = Target.the( "buttonLogin").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/form/div[1]/button");
    public static final Target texto = Target.the( "texto").locatedBy("//*[@id='__next']/div/div/div/div/div[2]/div");
    public static final Target buttonGestionFlota = Target.the("buttonGestionFlota").locatedBy("//*[@id='__next']/div/aside/nav/div/button[2]");
    public static final Target buttonEditor = Target.the("buttonEditor").locatedBy("//*[@id='__next']/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[7]/div/button[1]");
    public static final Target placaE = Target.the("placa").locatedBy("//*[@id='«r6»-form-item']");
    public static final Target modeloE = Target.the( "modelo").locatedBy("//*[@id='«r7»-form-item']");
    public static final Target capacidadE = Target.the("capacidad").locatedBy("//*[@id='«ra»-form-item']");
    public static final Target buttonGuardarCambios = Target.the("buttoGuardarCambios").locatedBy("//*[@id='radix-«r3»']/form/div[6]/button[2]");
    public static final Target validacionEditPlaca = Target.the("validacionEditPlaca").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]");
    public static final Target validacionEditModelo = Target.the("validacionEditModelo").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]");
    public static final Target validacionEditCapacidad = Target.the("validacionEditCapacidad").locatedBy("//*[@id='__next']/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]");
    public static final Target validacionPlacaError = Target.the("validacionPlacaError").locatedBy("/html/body/div[3]/form/div[1]/p");
    public static final Target validacionModeloError = Target.the("validacionModeloError").locatedBy("/html/body/div[3]/form/div[2]/p");
    public static final Target validacionCapacidadError = Target.the("validacionCapacidadError").locatedBy("/html/body/div[3]/form/div[4]/p");
    public static final Target buttonAgregarUnidad = Target.the("buttonAgregarUnidad").locatedBy("//*[@id='__next']/div/div[2]/div/div[1]/button");
    public static final Target placaA = Target.the("placaA").locatedBy("/html/body/div[3]/form/div[1]/input");
    public static final Target modeloA = Target.the("modeloA").locatedBy("/html/body/div[3]/form/div[2]/input");
    public static final Target coductorA = Target.the("coductorA").locatedBy("/html/body/div[3]/form/div[3]/button");
    public static final Target primerConductor = Target.the("primerConductor").locatedBy("//div[@role='option']//span[text()='Juan Pérez']");
    public static final Target capacidadA = Target.the("capacidadA").locatedBy("/html/body/div[3]/form/div[4]/input");
    public static final Target buttonGuardarUnidad = Target.the("buttonGuardarUnidad").locatedBy("/html/body/div[3]/form/div[6]/button[2]");
    public static final Target newUnit = Target.the("newUnit").locatedBy("//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/div/table/tbody/tr[6]/td[1]");
    public static final Target mesPlacaA = Target.the("mesPlacaA").locatedBy("/html/body/div[3]/form/div[1]/p");
    public static final Target mesModeloA = Target.the("mesModeloA").locatedBy("/html/body/div[3]/form/div[2]/p");
    public static final Target mesCapacidadA =  Target.the("mesCapacidadA").locatedBy("/html/body/div[3]/form/div[4]/p");
}