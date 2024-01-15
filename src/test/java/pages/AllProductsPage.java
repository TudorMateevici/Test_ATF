package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import preconditions.MainMethods;

public class AllProductsPage extends MainMethods {

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement allProductsPage;

    @FindBy(className = "product_sort_container")
    public WebElement sortItem;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]" )
    public WebElement sortItemLowToHi;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement addToCart;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart1;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addToCart2;

    @FindBy(className = "shopping_cart_link")
    public WebElement goToCart;

}