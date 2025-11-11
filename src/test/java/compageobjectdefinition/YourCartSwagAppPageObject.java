package compageobjectdefinition;

import basedriver.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourCartSwagAppPageObject extends BaseClass {

	public YourCartSwagAppPageObject(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// your cart
	@AndroidFindBy(xpath = "//*[@content-desc='test-Description']")
	public static WebElement lbl_description;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-CHECKOUT']")
	public static WebElement btn_checkout;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-REMOVE']")
	public static List<WebElement> btn_remove;
	
}
