package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:taget/xml-report/cucumber.xml",

        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = {"stepDefinitions"},
        tags="@draganddropBy",
        dryRun =false
)

public class Runner {
}
