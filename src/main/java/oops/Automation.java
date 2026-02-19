package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Automation
{
    public static void main(String[] args)
    {
        Pojo obj = new Pojo();
        obj.setUsername("Madhan");
        obj.setPassword("Password");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("dssd")).sendKeys(obj.getUsername());

        // inheritance ( Bank username,passowrd (parent ) - Saving , current ) extends

    }
}
