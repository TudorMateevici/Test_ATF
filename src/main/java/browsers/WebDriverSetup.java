//Declares the package where the class is stored
package browsers;

//Classes and interfaces needed for the code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import configuration.ConfigurationLoader;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Public class declaration
public class WebDriverSetup {

//Variable which holds the "WebDriver" instance
  private static WebDriver driver;

//Loads the configuration settings
    private static final Map<String, Object> config = ConfigurationLoader.loadConfig();
// Fetch the driver path from  the configuration
    public static String driverPath = (String) config.get("driverPath");
// A logger instance for logging messages
    private static final Logger logger = LogManager.getLogger(WebDriverSetup.class);

    //Method for WebDriver(driver) instance initialization with specific parameters for ChromeDriver
    public static void setUpDriver() {
        if (driver == null) {
            System.setProperty("web-driver.chrome.driver", driverPath);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            logger.info("Driver has been initialized.");
        } else {
            logger.info("Driver is already initialized.");
        }
    }

    // Method returns the WebDriver instance and if it is not initialized an exception is thrown
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver has not been initialized. Call setUpDriver() first.");
        }
        return driver;
    }

// Method close and/or quit the WebDriver instance
    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
            logger.info("WebDriver has been quit and reset.");
        }
    }

}
