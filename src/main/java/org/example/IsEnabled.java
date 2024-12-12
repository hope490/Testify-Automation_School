package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        driver.findElement(By.id("firstName")).sendKeys("Ebubechukwu");
        driver.findElement(By.id("lastName")).sendKeys("Moghalu");
        driver.findElement(By.id("email")).sendKeys("moghaluhope@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Ilove123");
        driver.findElement(By.name("confirmPass")).sendKeys("Ilove123");
        driver.findElement(By.name("xpLevel")).sendKeys("I love me");
        driver.findElement(By.cssSelector("#female")).click();

        JavascriptExecutor scrolling =(JavascriptExecutor) driver;
        scrolling.executeScript("window.scrollBy(0,200)");

        boolean state = driver.findElement(By.id("create")).isEnabled();
        System.out.println(state);

    }
}
