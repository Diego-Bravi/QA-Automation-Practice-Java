package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class avanzar_retroceder {
    
    @Test
    void atras_adelante() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.google.com");

        // 2. Maximizar la ventana del navegador
        driver.manage().window().maximize();

        // 3. Esperar unos segundos (puedes cambiar el tiempo si lo deseas)
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. Navegar hacia atrás en el historial del navegador
        driver.navigate().back();

        
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 6. Navegar hacia adelante en el historial del navegador
        driver.navigate().forward();

        
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 8. Cerrar el navegador
        driver.quit();
    }
}
