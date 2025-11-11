package compageobjectdefinition;

import basedriver.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewSwagAppPageObject extends BaseClass {

	public CheckoutOverviewSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//overview
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-Description']")
	public static WebElement lbl_checkoutdescription;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-FINISH']")
	public static WebElement btn_finish;
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
	        ".scrollIntoView(new UiSelector().text(\"FINISH\"))")
	WebElement element;

}
