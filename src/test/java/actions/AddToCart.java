package actions;

import elements.AddToCartElements;
import elements.HomePageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AddToCart {

    private final WebDriver driver;
    private final HomePageElements homePageElements;
    private final AddToCartElements addToCartElements;
    private final WebDriverWait wait;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        homePageElements = new HomePageElements(driver);
        addToCartElements = new AddToCartElements(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchbar(String itemName) {
        homePageElements.searchbox.sendKeys(itemName);
    }

    public void searchCTAclick() {
        homePageElements.searchbutton.click();
    }

    public void validateCart() {
        addToCartElements.Cart.click();
        WebElement cartIcon = wait.until(ExpectedConditions.visibilityOf(addToCartElements.Cart));
        if (!cartIcon.isDisplayed()) {
            throw new AssertionError("Cart icon not visible");
        }
    }

    public void selectProduct() {
        WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(addToCartElements.FirstProduct));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", productLink);
    }

    public void addToCart() {
        String ParentWindow = driver.getWindowHandle();
        Set<String> ChildWindow = driver.getWindowHandles();

        for (String win : ChildWindow) {
            if (!win.equals(ParentWindow)) {
                driver.switchTo().window(win);
                break;
            }
        }
        WebElement addToCartBtn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(addToCartElements.AddtoCartButton));

        addToCartBtn.click();
    }
}
