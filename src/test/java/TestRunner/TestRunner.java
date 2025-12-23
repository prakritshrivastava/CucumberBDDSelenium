package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/com.features"},
        glue={"StepDefinitions","AppHooks"},
        tags="@MyTest",
        plugin={"pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests {




}
