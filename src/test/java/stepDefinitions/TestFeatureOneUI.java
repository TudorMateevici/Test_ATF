package stepDefinitions;

import browsers.WebDriverSetup;
import configuration.ConfigurationLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.AllProductsPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.OverviewPage;
import pages.FinalPage;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;


public class TestFeatureOneUI {

    // WebDriver instance obtained from WebDriverSetup
    private final WebDriver driver = WebDriverSetup.getDriver();

    // Page objects for interaction with UI elements
    private final LoginPage loginPage = new LoginPage(driver);

    private final AllProductsPage allProductsPage = new AllProductsPage(driver);

    private final CartPage cartPage = new CartPage(driver);

    private final CheckoutPage checkoutPage = new CheckoutPage(driver);

    private final OverviewPage overviewPage = new OverviewPage(driver);

    private final FinalPage finalPage = new FinalPage(driver);

    // Configuration settings loaded from config file
    private static final Map<String, Object> config = ConfigurationLoader.loadConfig();

    public static String UIUrl = (String) config.get("UIUrl");

    // Logger for logging messages
    private static final Logger logger = LogManager.getLogger(TestFeatureOneUI.class);


    @Given("user access login page")
    public void userAccessLoginPage() {
        driver.get(UIUrl);
    }

    // @TC_1

    @And("user enters credentials: {string}, {string}")
    public void userEnterCredentials(String username, String password)
    {
        loginPage.enterText(loginPage.inputUsername, username);
        loginPage.enterText(loginPage.inputPassword, password);
        logger.info("Customer credentials are: " + username + " " + password);
    }

    @And("user reach All Products page")
    public void userReachAllProductsPage(){
       allProductsPage.returnText(allProductsPage.pageTitle);
       allProductsPage.returnText(allProductsPage.allProductsPage);
       assertEquals("User on proper page", allProductsPage.pageTitle ,allProductsPage.allProductsPage);
    }

    @And("user sort items by price low to high")
    public void userSortItemsByPriceLowToHigh(){
        allProductsPage.click(allProductsPage.sortItem);
        allProductsPage.click(allProductsPage.sortItemLowToHi);
    }

    @And("user add item\\(s) to cart")
    public void userAddItemSToCart() {
        allProductsPage.click(allProductsPage.addToCart);
        allProductsPage.click(allProductsPage.addToCart1);
        allProductsPage.click(allProductsPage.addToCart2);
    }

    @And("user goes to cart\\(click on cart icon)")
    public void userGoesToCartClickOnCartIcon() { allProductsPage.click(allProductsPage.goToCart);}

    @And("user performs checkout\\(click checkout button, enter First Name {string}, Last Name {string} and Zip {string})")
    public void userPerformsCheckoutClickCheckoutButtonEnterFirstNameLastNameAndZip(String firstname, String lastname, String zip) {
        cartPage.click(cartPage.checkOutButton);
        checkoutPage.enterText(checkoutPage.checkOutFirstName, firstname);
        checkoutPage.enterText(checkoutPage.checkOutLastName, lastname);
        checkoutPage.enterText(checkoutPage.checkOutZip, zip);
        logger.info("Check out details are: " + firstname + " " + lastname + " " + zip);
    }

    @When("user completes the order \\(click Finish button)")
    public void userCompletesTheOrderClickFinishButton() {overviewPage.click(overviewPage.finishButton);}

    @Then("confirmation message is displayed {string}")
    public void confirmationMessageIsDisplayed(String message) {
        String confirmationMessage = finalPage.returnText(finalPage.orderMessage);
        assertEquals("Assertion failed!!!", message, confirmationMessage);
        logger.info(confirmationMessage);
    }
    // @TC_2

    @When("user enters credentials {string}, {string}")
    public void userEntersCredentials(String username, String password) {
        loginPage.enterText(loginPage.inputUsername, username);
        loginPage.enterText(loginPage.inputPassword, password);
    }

    @And("user click on Login button")
    public void userClickOnLoginButton() {
        loginPage.click(loginPage.clickLoginButton);
    }

    @Then("error message is displayed {string}")
    public void errorMessageIsDisplayed(String message){
            String errorMessage = loginPage.returnText(loginPage.errorMessage);
             assertEquals("Assertion failed!!! ", message, errorMessage);
             logger.info(errorMessage);
    }

}

