package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class practica {
 
    @Test
    void Ventana() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.google.com");

        //Maximizar la ventana del navegador
        driver.manage().window().maximize();
       
       
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
       
        driver.get("https://chat.openai.com");


        // Pantalla a la mitad y centrada

        Dimension halfWindowSize = new Dimension(driver.manage().window().getSize().getWidth() / 2, driver.manage().window().getSize().getHeight());
        driver.manage().window().setSize(halfWindowSize);

        ((JavascriptExecutor) driver).executeScript("window.moveTo(0, 0);");
        ((JavascriptExecutor) driver).executeScript("window.resizeTo(screen.width, screen.height/2);");


        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
                e.printStackTrace();
        }

        driver.get("https://wikipedia.com");

        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
                e.printStackTrace();
        }

        driver.manage().window().maximize();

        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
                e.printStackTrace();
        }

        // 5. Cerrar el navegador
        driver.quit();
    }
}
