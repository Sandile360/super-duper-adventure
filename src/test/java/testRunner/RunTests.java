package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/home/sandile/Desktop/github/super-duper-adventure/src/test/java/features"},
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {"html:/home/sandile/Desktop/github/super-duper-adventure/src/test/java/reports/cucumber-reports.html","junit:/home/sandile/Desktop/github/super-duper-adventure/src/test/java/reports/cucumber-reports.junit"}
)

public class RunTests {


}
