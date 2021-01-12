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
            plugin = {"html:src/test/java/cucumber-reports/index.html",
                    "json:src/test/java/cucumber-reports/index.json"},
            features = "src/test/resources/features/ui",
            glue = "stepdefinitions_ui",
            tags = "@tags",
            dryRun = false,
            publish = true
    )
    public class Runner {
        @BeforeClass
        public static void setUp() {
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            ReusableMethods.waitForPageToLoad(10);

        }
        @AfterClass
        public static void tearDown() {
            Driver.closeDriver();
        }
    }


