package com.egg;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


class minimizar_cerrar {

    @Test
    void Ventana() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.google.com");

        // Maximizar la ventana del navegador
        driver.manage().window().maximize();
       
       
        try {
            Thread.sleep(3000); // Espera 3 segundos
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
       
        // Cerrar el navegador
        driver.quit();
    }

}

