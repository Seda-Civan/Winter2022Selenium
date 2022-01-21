package com.automation.tests.jan20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {

        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //create chromedriver object
        ChromeDriver driver = new ChromeDriver();
        //open website
        driver.get("http://google.com");



    }
}
