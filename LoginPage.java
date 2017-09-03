package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {

	private IOSDriver<IOSElement> driver;

	public LoginPage(AppiumDriver driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "Login")
	private MobileElement buttonLogin;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "landing_login_button")
	private MobileElement guestLogin;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(xpath = "//*[@value='Email']")
	private MobileElement email;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(xpath = "//*[@value='Password']")
	private MobileElement password;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "LOGIN")
	private MobileElement homeLogin;

	public void LoginApp() {

		guestLogin.click();
		email.sendKeys("han.helen8@gmail.com");
		password.sendKeys("Passw0rd");
		homeLogin.click();

	}

}
