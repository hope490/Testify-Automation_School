package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelenimJava {
    public static void main(String[] args)   {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.ng");
       // driver.findElement(By.id("fi-q")).sendKeys("Samsung");

        //driver.findElement(By.className("btn _prim _md -mls -fsh0")).click();


    }
}
