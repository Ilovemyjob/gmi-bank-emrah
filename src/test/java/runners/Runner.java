package runners;





import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/default-cucumber-reports",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml" },
            features = "src/test/resources/features",
            glue = "stepdefinitions",
            tags = "@mali",
            dryRun = false,
            publish = false
    )
    public class Runner {
    }


