package actions;

import com.ebay.framework.utility.drivers.DriverManager;
import hooks.TaggedHooks;
import org.openqa.selenium.WebDriver;

import elements.HomePageElements;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CommonActions {
    WebDriver driver = DriverManager.getDriver();
    public CommonActions() {

    }

    @Given("I am on the eBay homepage")
    public void navigateToEbay() {
        driver.get("https://www.ebay.com");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        HomePageElements homePageElements = new HomePageElements(driver); // Initialize elements with driver
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}