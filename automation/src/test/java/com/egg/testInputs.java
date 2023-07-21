package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


class testInputs {

    @Test
    void busquedaGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://www.selenium.dev/selenium/web/inputs.html");

        WebElement searchInput1 = driver.findElement(By.name("no_type"));
        searchInput1.clear();
        searchInput1.sendKeys("perros");
        WebElement searchInput2 = driver.findElement(By.name("number_input"));
        searchInput2.clear();
        searchInput2.sendKeys("42");


    }

}
