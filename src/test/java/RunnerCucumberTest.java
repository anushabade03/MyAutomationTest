import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@CucumberOptions(features="src/test/resources",plugin = {"pretty", "html:target/cucumber"})
@RunWith(Cucumber.class)
public class RunnerCucumberTest {

}
