package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/javascript-alerts/");
        JavascriptExecutor scrolling = (JavascriptExecutor) driver;
        scrolling.executeScript("window.scrollBy(0,500)");
       //Alert alert =driver.switchTo().alert();

        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(3000);
         alert.accept();
        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();

        alert = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        alert.dismiss();


        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        //Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("This is an automation test");
        Thread.sleep(3000);
        alert.accept();

    }
}
