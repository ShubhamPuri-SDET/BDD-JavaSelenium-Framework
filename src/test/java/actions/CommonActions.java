package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {
    private WebDriver driver;

    public CommonActions() {
        this.driver = new ChromeDriver(); // No more dependency injection
    }

    public void NavigateToEbay(String url) {
        driver.get(url);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closebrowser(){
        driver.quit();
    }
}
