package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"stepDefinitions"},
    tags = {"@activity1_1"},
    strict = true
)

public class ActivitiesRunner {
    //empty
}