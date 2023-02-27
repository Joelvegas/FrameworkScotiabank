package aut.testcreation.tasks.ConstanciasFiscalesSitioCliente;

import framework.engine.selenium.SeleniumWrapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;

import static aut.testcreation.pages.Page_Scotiabank.XXX;
import static framework.engine.selenium.ReportFunctionalities.reporte;

public class Validar extends SeleniumWrapper {
    public Validar(WebDriver driver) {
        super(driver);
    }

    public static boolean mensajeSistema(String pMensaje)throws IOException, InvalidFormatException, AWTException{
        //verificarTexto(XXX, pMensaje);
        reporte.reportarEvento("", true, false);
        return false;
    }
}
