package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public HomePage(AppiumDriver driver) {
		super(driver);

	}

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Login")
	public MobileElement buttonLogin;

	@iOSFindBy(xpath = "//*[@value='Email']")
	public MobileElement email;

	@iOSFindBy(xpath = "//*[@value='Password']")
	public MobileElement password;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement homeLogin;

	@iOSFindBy(className = "XCUIElementTypeStaticText")
	public MobileElement meditationNowNumber;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "header_bowl_logo")
	public MobileElement logo;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "activity_map")
	public MobileElement map;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "nav bar invite user")
	// @iOSFindBy(xpath = "//*[name='nav bar invite user']")
	public MobileElement addFriend;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "See more friend activity")
	@iOSFindBy(xpath = "@[name='See more friend activity']")
	public MobileElement seeMoreFriend;

	@WithTimeout(time = 60, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Sydney Olympic Park, Australia")
	public MobileElement nearby;

	@iOSFindBy(accessibility = "Done")
	public MobileElement done;

	@iOSFindBy(accessibility = "Edit")
	public MobileElement editNearby;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "See more in Sydney Olympic Park, Australia")
	public MobileElement seeMoreNearby;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	public MobileElement back;

	@WithTimeout(time = 60, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Thich Nhat Hanh")
	public MobileElement groupOne;

	@WithTimeout(time = 60, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Insight Community")
	public MobileElement groupTwo;

	@WithTimeout(time = 100, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Beginner's Mind")
	// "//android.widget.TextView[@text=\"Beginner's Mind\"]")
	public MobileElement groupThree;

	@WithTimeout(time = 120, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Women Meditate Worldwide")
	public MobileElement groupFour;

	@WithTimeout(time = 140, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Community")
	public MobileElement community;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "tab_now")
	@iOSFindBy(accessibility = "tab_now")
	public MobileElement tabNow;

	// closeAnnouns

	public void homeLogin() {

		buttonLogin.click();
	}

	public void email() {
		email.sendKeys("han.helen8@gmail.com");
	}

	public void password() {
		password.sendKeys("Passw0rd");
	}

	public void login() {
		homeLogin.click();
	}

	public boolean isNumberCorrect() {
		String numberString = meditationNowNumber.getText();
		String sub_str = " meditating now";
		String number_str = ",";
		String numberStr = numberString.replace(sub_str, "");

		int numberNow = Integer.parseInt(numberStr.replaceAll(number_str, ""));
		if (numberNow > 1000)
			return true;
		else
			return false;
	}

	public boolean isElementCorrect(String result) {
		return false;
	}

	public boolean verifyLogo() {
		return logo.isEnabled();
	}

	public boolean verifyMap() {
		return map.isEnabled();

	}

	public boolean verifyAddFriend() {
		return addFriend.isEnabled();
	}

	public boolean verifySeeMoreFriend() {
		if (seeMoreFriend.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifySeeMoreNearby() {
		if (seeMoreNearby.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyNearby() {
		return nearby.isEnabled();

	}

	public void clickNearby() throws InterruptedException {
		nearby.click();
		Thread.sleep(3000);

	}

	public void clickNearbyEdit() {
		editNearby.click();

	}

	public void clickDone() {
		done.click();

	}

	public void clickBack() {
		back.click();

	}

	public boolean verifyGroupOne() {
		return groupOne.isEnabled();
	}

	public void clickGroupOne() {
		groupOne.click();

	}

	public boolean verifyGroupTwo() {
		return groupTwo.isEnabled();
	}

	public void clickGroupTwo() {
		groupTwo.click();

	}

	public boolean verifyGroupThree() {
		return groupThree.isEnabled();
	}

	public void clickGroupThree() {
		groupThree.click();

	}

	public boolean verifyGroupFour() {
		return groupFour.isEnabled();

	}

	public void clickGroupFour() {
		groupFour.click();

	}

	public boolean verifyCommunity() {
		return community.isEnabled();

	}

	public boolean isLogExist() {
		return elementExists(logo);
	}

	public boolean isMapExist() {
		return elementExists(map);
	}

	public boolean isAddFriendExist() {
		return elementExists(addFriend);
	}

	public boolean isSeeMoreFriendExist() {
		return elementExists(seeMoreFriend);
	}

	public boolean isSeeMoreNaerbydExist() {
		return elementExists(seeMoreNearby);
	}

	public boolean isGroupOneExist() {
		return elementExists(groupOne);
	}

	public boolean isGroupTwoExist() {
		return elementExists(groupTwo);
	}

	public boolean isGroupThreeExist() {
		return elementExists(groupThree);
	}

	public boolean isGroupFourExist() {
		return elementExists(groupFour);
	}

	public boolean isCommunityExist() {
		return elementExists(community);
	}

	public boolean isNearbyExist() {
		return elementExists(nearby);
	}

	// public void clickCloseAnnouns() {
	//
	// closeAnnouns.click();
	// }

	public void clickTabNow() {

		tabNow.click();
	}

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}
}
