package org.example;


//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDetails {

    @Test
    public  void GetDestailsExample() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ebubechukwu.Moghalu\\IdeaProjects\\SeleniumDemo\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.ng/");
       String autoCom= driver.findElement(By.xpath("//input[@aria-label=\'Search\']")).getAttribute("autocomplete");
        System.out.println(autoCom);



    }
}
