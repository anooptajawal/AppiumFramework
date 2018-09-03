import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumber-html-report", "pretty:build/cucumber-report.json"})
public class RunCucumberTest {
}
