package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class Maps
{
    @Test
    public void map()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.mapz.com/map");
        WebElement draw = driver.findElement(By.xpath("//div[@class='menu-option-disabled' and normalize-space()='Draw']"));
        draw.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        wait.until(ExpectedConditions.visibilityOf(emailField));
        String getEmailAttribute = emailField.getAttribute("placeholder");
        Assert.assertEquals(getEmailAttribute,"Email");
        Actions actions = new Actions(driver);
        actions.moveToElement(emailField);
        String getField = emailField.getAttribute("validationMessage");
        System.out.println(getField);

    }
}
