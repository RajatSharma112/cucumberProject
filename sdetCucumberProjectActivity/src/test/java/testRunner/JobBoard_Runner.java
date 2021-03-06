package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/Features",
		glue= {"stepDefinition"},
		monochrome= true,
		tags= "@jobBoard",
		dryRun= false,
		publish= true
		)

public class JobBoard_Runner {

}
