package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#login-button")).click();

        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();

        String loginButton= driver.findElement(By.cssSelector("#login-button")).getAttribute("Value");
        System.out.println(loginButton);

        Thread.sleep(5000);
        driver.navigate().forward();

        String firstProduct = driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println(firstProduct);



    }
}
