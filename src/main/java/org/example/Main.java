package org.example;

//Ejercicio Realizado con la arquitectura POM


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Dejamos la configuración en el main a pesar de que se puede ver con como un comportamiento
        //Debido a la importancia de la configuración
        System.setProperty("webdriver.gecko.driver", "/home/fer/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();

        //Instancia de la clase y mediante esta clase traemos sus metodos

        TextBoxPage textBoxPage = new TextBoxPage(driver);

        //Referencia a los metodos de textBoxPage

        try{
            //Codigo con referencia a los metodos
            textBoxPage.navigateTo();
            textBoxPage.takeScreenshot("/home/fer/capturas/ejemploPOM.png");
            System.out.println("Se genero la captura de pantalla desde MAIN");
        }catch(IOException e){
            System.out.println("Existe un error al capturar la pantalla ");
        }







    }
}