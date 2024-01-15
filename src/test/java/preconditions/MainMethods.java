package preconditions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainMethods {

    // Variable holds the WebDriver instance.
    // Protected access modifier provides access to subclasses from current or other packages
    protected WebDriver driver;

    // A WebDriverWait instance for waiting for elements
    private final WebDriverWait wait;

    // A logger instance for logging messages
    private static final Logger logger = LogManager.getLogger(MainMethods.class);

    // Constructor initializes the MainPage object with a WebDriver instance.
    // Sets up a WebDriverWait with a maximum timeout of 5 seconds.
    public MainMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // Method performs a click action on a WebElement.
    // If the element is not found, proper error message is logged.
    public void click(WebElement element) throws NoSuchElementException {
        if (element != null) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element)).click();
            } catch (NoSuchElementException e) {
                logger.error("Element not found: " + e.getMessage());
                throw new NoSuchElementException("Element not found", e);
            }
        } else {
            logger.error("Element is null; cannot perform the click.");
        }
    }

    // Method enters text into a WebElement.
    // It waits for the element to be visible before entering text.
    // If an exception occurs, it is caught, logged, and re-thrown.
    public void enterText(WebElement element, String text) throws NoSuchElementException {
        if (element != null) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
            } catch (Exception e) {
                logger.error("Error while entering text: " + e.getMessage());
                throw new NoSuchElementException("Error while entering text", e);
            }
        } else {
            logger.error("Element is null; cannot enter text.");
        }
    }

    // Method retrieves the text from a WebElement.
    // It waits for the element to be visible and returns the text.
    // If an exception occurs, it is caught, logged, and re-thrown.
    public String returnText(WebElement element) throws NoSuchElementException {
        if (element != null) {
            try {
                return wait.until(ExpectedConditions.visibilityOf(element)).getText();
            } catch (Exception e) {
                logger.error("Error while getting text: " + e.getMessage());
                throw new NoSuchElementException("Error while getting text", e);
            }
        } else {
            logger.error("Element is null; cannot get text.");
            return "";
        }
    }

}
