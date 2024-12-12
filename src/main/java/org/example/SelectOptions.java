package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
       WebElement oldStyle = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select menuDropdowns = new Select(oldStyle);
        //menuDropdowns.selectByVisibleText("White");
        menuDropdowns.selectByValue("5");
    }
}
