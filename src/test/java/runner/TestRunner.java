package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"stepDefinitions", "preconditions"},// Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}, // Optional plugins
        tags = "@API" // Specify the tag(s) to run
)
public class TestRunner {

}
