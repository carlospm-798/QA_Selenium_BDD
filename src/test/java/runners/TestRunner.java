package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepdefinitions", "hooks"},
        features = {"src/test/java/features"},
        tags = "not @omit"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false )
    public Object[][] scenarios() {
        return super.scenarios();
    }
}