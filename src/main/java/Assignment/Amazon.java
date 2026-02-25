package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
public class Amazon
{
    public static void main(String[] args) throws InterruptedException
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags", Keys.ENTER);
        int position = 6;
        //i[contains(@class,'a-icon a-icon-checkbox')])[position() >= 8]
        while (position<=9)
        {
            Actions actions = new Actions(driver);
            WebElement box = driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[position() >= "+position+"]"));
            actions.moveToElement(box).build();
            box.click();
            Thread.sleep(6000L);
            position++;
        }
        System.out.println("Test Executed");
    }
}
