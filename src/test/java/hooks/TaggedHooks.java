package hooks;

import actions.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class TaggedHooks {
    public static WebDriver driver;
    CommonActions commonActions;

    public TaggedHooks() {
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @Before(order = 0)
    public void setup() {
        commonActions.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After(order = 1)
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String fileName = "Reports (Generated)/Screenshots" + scenario.getName().replaceAll(" ", "_") + ".png";


            try {
                Files.createDirectories(Path.of("screenshots"));
                Files.copy(src.toPath(), Path.of(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", scenario.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }
}
