package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import preconditions.MainMethods;

public class CartPage extends MainMethods {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkout")
    public  WebElement checkOutButton;
}
