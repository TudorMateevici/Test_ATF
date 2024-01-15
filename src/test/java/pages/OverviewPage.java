package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import preconditions.MainMethods;

public class OverviewPage extends MainMethods {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    public WebElement finishButton;
}
