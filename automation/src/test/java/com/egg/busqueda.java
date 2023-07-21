package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


class busqueda {

    @Test
    void busquedaGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://www.google.com.ar/");
        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.sendKeys("perros");
        
    }

}
