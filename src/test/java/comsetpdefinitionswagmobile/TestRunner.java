package comsetpdefinitionswagmobile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/swagmobileapp",
        glue = {"comsetpdefinitionswagmobile"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        dryRun = false
        , tags = "@test")
public class TestRunner {

//    //completely options - this can be used only when there is a pre or post requisite that needs to be run
//    // when running the test runner class,
//    // the method with the @BeforeClass annotation will be executed first before any of the test cases are executed. This is useful for setting up any necessary preconditions or configurations that need to be in place before the tests run. In this case, the runthejar() method is defined to perform any required setup tasks, such as starting a server, initializing resources, or loading configurations, before the test cases are executed.
//    @BeforeClass
//    public static void runthejar() throws IOException, InterruptedException {
//
//    }

}