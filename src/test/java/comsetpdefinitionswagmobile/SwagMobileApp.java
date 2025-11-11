package comsetpdefinitionswagmobile;

import basedriver.BaseClass;
import commoduledefinition.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.CommonUtils;

import java.io.IOException;
import java.time.Duration;

public class SwagMobileApp {
	public AppiumDriver driver;

	public SwagMobileApp() {
		driver = BaseClass.driver;
	}

	@Given("I open the application")
	public void i_open_the_application() throws IOException {
		CommonUtils.loadConfigProp("Android.properties");
		CommonUtils.setCapabilities();

		driver = CommonUtils.getDriver();
	}

	@Then("I verify the application login screen")
	public void i_verify_the_application_login_screen() {
		LoginSwagApp loginswagapp = new LoginSwagApp(driver);
		loginswagapp.verifyLogin(driver);
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String username) {
		LoginSwagApp loginswagapp = new LoginSwagApp(driver);
		loginswagapp.enterUsername(driver, username);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String password) {
		LoginSwagApp loginswagapp = new LoginSwagApp(driver);
		loginswagapp.enterPassword(driver, password);
	}

	@When("I click on the login")
	public void i_click_on_the_login() {
		LoginSwagApp loginswagapp = new LoginSwagApp(driver);
		loginswagapp.clickLogin(driver);
	}

	@Then("I will be able to view the dashboard screen")
	public void i_will_be_able_to_view_the_dashboard_screen() {
		ProductsSwagApp productsswagapp = new ProductsSwagApp(driver);
		productsswagapp.verifyDashboardProducts(driver);

	}

	@Then("I add a Item to cart")
	public void i_add_a_Item_to_cart() {
		ProductsSwagApp productsswagapp = new ProductsSwagApp(driver);
		productsswagapp.verifyAddtocart(driver);
	}

	@Then("I click on the cart for checkout")
	public void i_click_on_the_cart_for_checkout() {
		ProductsSwagApp productsswagapp = new ProductsSwagApp(driver);
		productsswagapp.clickCart(driver);
	}

	@Then("I verify your cart")
	public void i_verify_your_cart() {
		YourCartSwagApp yourcartswagapp = new YourCartSwagApp(driver);
		yourcartswagapp.validateYourCart(driver);
	}

	@Then("I enter the check out information")
	public void i_enter_the_check_out_information() throws IOException {
		CheckoutInfoSwagApp checkoutinfoswagapp = new CheckoutInfoSwagApp(driver);
		checkoutinfoswagapp.verifyCheckoutInfo(driver);
	}

	@Then("I validate the checkout Overview")
	public void i_validate_the_checkout_Overview() {
		CheckoutOverviewSwagApp checkoutoverviewswagapp = new CheckoutOverviewSwagApp(driver);
		CheckoutOverviewSwagApp.verifyCheckoutOverview(driver);
	}

	@Then("I verify the order completion")
	public void i_verify_the_order_completion() {
		CheckoutCompleteSwagApp checkoutcompleteswagapp = new CheckoutCompleteSwagApp(driver);
		checkoutcompleteswagapp.validateCheckoutComplete(driver);
	}

	@Then("I verify error {string}")
	public void i_verify_error(String error) {
		LoginSwagApp loginswagapp = new LoginSwagApp(driver);
		loginswagapp.validateError(driver, error);
		;
	}

	@Then("I enter the check out information as empty")
	public void i_enter_the_check_out_information_as_empty() throws IOException {
		CheckoutInfoSwagApp checkoutinfoswagapp = new CheckoutInfoSwagApp(driver);
		checkoutinfoswagapp.verifyCheckoutInfoEmpty(driver);
	}
	
	@Then("I add multiple Item to cart")
	public void i_add_multiple_Item_to_cart() {
		ProductsSwagApp productsswagapp = new ProductsSwagApp(driver);
		productsswagapp.verifyMultipleAddtocart(driver);
	}

	@Then("I remove the item from cart")
	public void i_remove_the_item_from_cart() {
		YourCartSwagApp yourcartswagapp = new YourCartSwagApp(driver);
		yourcartswagapp.validateYourCart(driver);
	}

}
