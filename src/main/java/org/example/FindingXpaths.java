package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindingXpaths {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ng/");
        //xpath with single attribute


      // driver.findElement(By.xpath("//input[@value=\"I'm Feeling Lucky\" and @aria-label=\"I'm Feeling Lucky\"]")).sendKeys("Tshirts");
        //xpath with and and or operators
        //driver.findElement(By.xpath("//input[@value="I'm Feeling Lucky" and @aria-label="I'm Feeling Lucky"]")).sendKeys("Tshirts");
        //driver.findElement(By.xpath("//input[@id='fi-q' or @placeholder='search products']")).sendKeys("Tshirts");
    }
}
