import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {

    // set browser related props
    @BeforeTest
    public void setup() {
        super.setup();
    }

    // clean the props
    @AfterTest
    public void clear() {
        super.clear();
    }

    @Test
    public void placeOrder() {
        /* 
            Search for a restaurant by entering the name in the search box
            Select the restaurant from the search results
            Click on add to the cart on an item
            Click on add to the cart on an item
            Click on the cart icon to view the added items
            Click on the 'Proceed to Checkout' button
            Select 'Cash on Delivery' as the payment option
            Enter shipping details
            Click on the 'Place Order' button to complete the transaction
        */

        driver.findElement(By.xpath("//input[@placeholder='Search for restaurants...']")).sendKeys("West, Mayer and Wintheiser");
        driver.findElement(By.xpath("//h2[normalize-space()='West, Mayer and Wintheiser']")).click();
        driver.findElement(By.xpath("//div[@class='bg-white rounded-lg shadow-md overflow-hidden']//div[1]//div[1]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//div[5]//div[1]//div[1]//div[1]//button[1]")).click();
        
        driver.findElement(By.xpath("//*[local-name()='svg' and @class='h-8 w-8' and @stroke='currentColor']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Proceed to Checkout']")).click();
        
        driver.findElement(By.xpath("//input[@id='cash']")).click();
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Main St");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("10001");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9123456789");

        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
    }
}
