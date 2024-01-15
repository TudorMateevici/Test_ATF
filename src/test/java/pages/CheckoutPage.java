package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import preconditions.MainMethods;

public class CheckoutPage extends MainMethods {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name" )
    public WebElement checkOutFirstName;

    @FindBy(id = "last-name" )
    public WebElement checkOutLastName;

    @FindBy(id = "postal-code")
    public  WebElement checkOutZip;

    @FindBy(id = "continue")
    public WebElement continueButton;
}
