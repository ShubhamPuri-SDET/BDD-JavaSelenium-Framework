package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefination",
        tags = "@AddToCart",
        plugin = {"pretty", "html:Reports (Generated)/cucumber-report.html"},
        monochrome = true,
        dryRun = true
)
public class TestRunner {
}
