import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import tisostudio.com.utils.ConfigReader;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    // Method to set up the WebDriver based on the browser specified in the config file
    protected void setup() {

        // Read browser type from the configuration file
        String browser = ConfigReader.getProperty("browser");

        // Read base URL from the configuration file
        String baseUrl = ConfigReader.getProperty("base.url");

        // Read timeout value from the configuration file
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout"));

        // Initialize the WebDriver based on the selected browser
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
    }

    // close the browser after execution
    protected void clear() {
        driver.close();
    }
}
