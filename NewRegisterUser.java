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

public class NewRegisterUser extends BasePage {

	private IOSDriver<IOSElement> driver;

	public NewRegisterUser(AppiumDriver driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "Register, It's free")
	private MobileElement registerItisFree;

	@iOSFindBy(xpath = "//*[@value='Full Name']")
	private MobileElement fullName;

	@iOSFindBy(xpath = "//*[@value='Email']")
	private MobileElement email;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(xpath = "//*[@value='Password']")
	private MobileElement password;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "REGISTER")
	private MobileElement registerButton;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "LOGIN")
	private MobileElement homeLogin;

}
