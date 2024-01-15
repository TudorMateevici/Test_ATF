package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import preconditions.MainMethods;

//Inheritance: LoginPage from MainMethods
public class LoginPage extends MainMethods {

    // Constructor: Initializes the LoginPage object
    // Calls the constructor of the superclass MainMethods via super(driver)
    // Initializes the elements of the page using PageFactory.initElements(driver, this)
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Annotations are used to locate and initialize WebElement instances
    // They are associated with specific HTML elements on the login page
    @FindBy(id = "user-name")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public  WebElement inputPassword;

    @FindBy(id = "login-button")
    public WebElement clickLoginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    public WebElement errorMessage;
}
