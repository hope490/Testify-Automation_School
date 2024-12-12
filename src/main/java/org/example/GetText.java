package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
   String UserName = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();
   String Password =driver.findElement(By.cssSelector(".login_password")).getText();
      UserName=UserName.substring(24,37) ;
      Password=Password.substring(23,36);

        System.out.println(UserName);
        System.out.println("---------");
        System.out.println(Password);

        driver.findElement(By.id("user-name")).sendKeys(UserName);
        //How to get a tag name
        //System.out.println(driver.findElement(By.id("user-name")).getTagName());
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("login-button")).click();
    }
}
