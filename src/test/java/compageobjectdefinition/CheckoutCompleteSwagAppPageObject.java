package compageobjectdefinition;

import basedriver.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompleteSwagAppPageObject extends BaseClass {

	public CheckoutCompleteSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	//checkout complete
	
	@AndroidFindBy(xpath="//*[@text='CHECKOUT: COMPLETE!']")
	public static WebElement lbl_checkoutcomplete;
	
	@iOSXCUITFindBy(xpath="//*[@text='CHECKOUT: COMPLETE!']")
	public static WebElement lbl_checkoutfinal;
}
