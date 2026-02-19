package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SaucedemoAutomation
{
    public static void main(String[] args) throws InterruptedException
    {
        //1. Launch Chrome browser in guest mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2.Navigate to https://www.saucedemo.com/v1/
        driver.get("https://www.saucedemo.com/");
        //3.  Enter username and password
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //4.Click on Login button
        driver.findElement(By.id("login-button")).click();
        //5. Capture and print the first product name
        String product_name = driver.findElement(By.xpath("//div[@class='inventory_item_description']//div[@class='inventory_item_label']//a")).getText();
        System.out.println(product_name);
        //6.Capture and print the first product price
        String price = driver.findElement(By.xpath("//div[@class='inventory_item_description']//div[@class='inventory_item_price']")).getText();
        System.out.println(price);
        //14. Sort the prices and print the second largest price
        List<WebElement> listPrice = driver.findElements(By.xpath("//div[@class='inventory_item_description']//div[@class='inventory_item_price']"));
        int[] arr = new int[listPrice.size()];
        for(int i = 0;i<arr.length;i++)
        {
            String element = listPrice.get(i).getText();
            String replace = element.replace("$","");
            float parse = Float.parseFloat(replace);
            int roundOff = (int) Math.round(parse);
            arr[i] = roundOff;
        }
        Arrays.sort(arr);
        int second_largset = arr[arr.length-2] ;

        System.out.println("Second Largest of Price : "+second_largset);

        //7.Click Add to Cart for the first sorted product

        List<WebElement> pricesList = driver.findElements(By.xpath("//div[@class='inventory_item_description']//div[@class='inventory_item_price']"));
        List<WebElement> e = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
        for(int i = 0;i<pricesList.size();i++)
        {
            if(pricesList.get(i).getText().contains(String.valueOf(second_largset-1)))
            {
                System.out.println("Hey ... "+pricesList.get(i));
                e.get(i).click();
            }
        }
        Thread.sleep(2000L);
        //8.Click on the Cart icon
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']//a//span")).click();
        //9. Verify product price in cart matches the inventory price
        String cartPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        if(cartPrice.equalsIgnoreCase(price))
        {
            System.out.println("Price is verified in cart section");
        }
        else {
            System.out.println("Price is wrong in Cart Section");
        }
        //10. Click on Checkout
        driver.findElement(By.id("checkout")).click();
        //11.  Enter First Name, Last Name, and Postal Code
        String first_name = "Madhan";
        String last_name = "Kumar";
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(first_name);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(last_name);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("641025");
        //12. Click Continue
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        //13. Collect all product prices on checkout overview page
        String finalPrise = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
        System.out.println("CheckoutPage Price : "+finalPrise);
        //15. Click Finish
        driver.findElement(By.id("finish")).click();
    }
}
