package hookdefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import utility.CommonUtils;
import basedriver.BaseClass;

import java.io.IOException;
import java.net.MalformedURLException;
public class HookIntialisation {
    public static AppiumDriver driver;

    // leaving this code incase if multiple files needs to call
    // we can use this as a common module to call the driver and the appium server
    // right now its is not being used

    @Before
    public void openapp() throws IOException, InterruptedException {
        // Load Android configuration from properties file
        CommonUtils.loadConfigProp("Android.properties");

        // Set the desired capabilities
        CommonUtils.setCapabilities();

        // Get the AppiumDriver instance - use getDriver() which starts Appium server
        driver = CommonUtils.getDriver();

        // Initialize BaseClass with the driver for page object initialization
        new BaseClass(driver);
    }
}
