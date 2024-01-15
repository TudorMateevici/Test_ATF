package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import preconditions.MainMethods;

public class FinalPage extends MainMethods {

    public FinalPage(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "complete-header")
    public WebElement orderMessage;
}
