package hookdefinitions;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HookIntialisation {
	public static WebDriver driver;


	@Before
	public void openapp() throws IOException, InterruptedException {


	}

}
