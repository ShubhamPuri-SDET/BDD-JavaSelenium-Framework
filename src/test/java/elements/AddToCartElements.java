package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartElements {

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    public WebElement AddtoCartButton;
    @FindBy(xpath = "(//div[@role='heading' and @aria-level='3' and contains(@class, 's-card__title')])[1]")
    public WebElement FirstProduct;
    @FindBy(xpath = "//span[@class='gh-cart__icon']")
    public WebElement Cart;
    private final WebDriver driver;


    public AddToCartElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
