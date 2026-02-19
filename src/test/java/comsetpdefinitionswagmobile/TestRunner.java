package comsetpdefinitionswagmobile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/swagmobileapp",
		glue = { "hookdefinitions","comsetpdefinitionswagmobile" },
		monochrome = true, 
		plugin = { "pretty", "html:target/cucumber-html-report.html"},
		dryRun = false
		, tags="@test")
public class TestRunner {

	@BeforeClass
	public static void runthejar() throws IOException, InterruptedException {

	}

}