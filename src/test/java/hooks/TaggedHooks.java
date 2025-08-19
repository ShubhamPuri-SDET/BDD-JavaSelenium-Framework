package hooks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TaggedHooks {

    public static WebDriver driver;
    private final CommonActions commonActions;

    public TaggedHooks(CommonActions commonActions) {
        this.commonActions = commonActions;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @Before(order = 0)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        commonActions.setDriver(driver);  // inject driver here
    }

    @After(order = 1)
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String fileName = "Reports (Generated)/Screenshots/" + scenario.getName().replaceAll(" ", "_") + ".png";

            try {
                Files.createDirectories(Path.of("Reports (Generated)/Screenshots"));
                Files.copy(src.toPath(), Path.of(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", scenario.getName());
        }

        if (driver != null) {
            driver = new ChromeDriver();
            driver.quit();
        }
    }
}
