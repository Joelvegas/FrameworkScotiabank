package aut.testcreation.steps;

import framework.engine.bdd.CucumberBaseTestRunner;
import io.cucumber.java8.En;
import aut.testcreation.tasks.scotiabank.*;

public class Stepdefs_SRC_AUT_003_ConstanciasFiscalesBanco extends CucumberBaseTestRunner implements En{
    public Stepdefs_SRC_AUT_003_ConstanciasFiscalesBanco() {
        Given("El Usuario se logea en el Home Page con el idioma {string}", (String pIdioma) -> {
            Login.FuncionUsuario(pIdioma);
        });
        When("El Usuario selecciona el Rol {string}", (String Rol) -> {
            //System.out.println(Rol);
            switch (Rol){
                case "Bank Client":
                    //Rol.funcionRol(Rol);
                    break;
                case "Cliente banco":
                    //Rol.funcionRol(Rol);
                    break;
                case "Cliente Casa de Bolsa":
                    //Rol.funcionRol(Rol);
                    break;
                case "MexDer":
                    break;
                case "otros":
                    break;
            }
        });
        And("El Usuario ingresa los datos requeridos para descargar la constancia {string}", (String pDatos) -> {
            String[] lDatos = pDatos.split("&");
            //System.out.println(pDatos);

            switch (pDatos){
                case "pNumCliente&pContrasenia":
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "pNumContrato&pContrasenia":
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "pNumCuentaBancaria":
                    Datos.IngresarDatos(lDatos[0], lDatos[1]);
                    break;
                case "otros":
                    break;
            }
        });
        Then("El Sistema muestra en pantalla el mensaje: {string}", (String parametro) -> {
            Validar.mensajeSistema(parametro);
        });
    }
}