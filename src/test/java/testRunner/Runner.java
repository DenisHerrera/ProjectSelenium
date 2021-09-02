package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue={"stepDefinition"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/Cucumber-TestReport.json",
                "junit:target/cucumber-reports/cucumber.xml"

        })

public class Runner extends AbstractTestNGCucumberTests {

}
