package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/multiple-browser-windows/");

        String parentWindow =driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='u_7_8']")).click();

        Set<String> windows =driver.getWindowHandles();
        for(String window: windows){
            driver.switchTo().window(window);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/")){
                Thread.sleep(3000);
                driver.findElement(By.className("nav__button-secondary btn-secondary-emphasis btn-md")).click();
            }



        }


    }
}
