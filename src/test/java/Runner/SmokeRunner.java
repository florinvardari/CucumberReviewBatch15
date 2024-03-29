package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",

        glue = "Steps",
        tags = " @datatable",
        dryRun = false,
        plugin = {"pretty","html:target/Cucumber.html","json:target/Cucumber.json"})


public class SmokeRunner {
}
