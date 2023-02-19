package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = ".//Features//Login.feature",
		features = {".//Features/"},
        glue = {"stepDefinition"},
        dryRun = false,
//        tags = "@sanity",
        monochrome = true,
//        plugin = {"pretty","html:target/Cucumber-reports/report1.html","json:target/Cucumber-reports/report_json.json",
//        		"xml:target/Cucumber-reports/report_xml.xml"}
		plugin = {"pretty","html:target/Cucumber-reports/report.html"}
)
public class Run {

}