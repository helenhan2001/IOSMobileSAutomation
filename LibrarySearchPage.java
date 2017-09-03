package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LibrarySearchPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public LibrarySearchPage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "Search for meditations, interests or teachers")
	public MobileElement searchBtn;

	@iOSFindBy(className = "XCUIElementTypeButton")
	public MobileElement searchTextField;

	@iOSFindBy(accessibility = "Clear text")
	public MobileElement cleartext;

	@iOSFindBy(accessibility = "Cancel")
	public MobileElement cancelSearchBtn;

	@iOSFindBy(accessibility = "Glasses")
	public MobileElement glasses;

	@iOSFindBy(accessibility = "Please make sure your words are spelled correctly or use different keywords")
	public MobileElement searchErrorText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement searchTopResult;
	// Duration filer by mins
	@iOSFindBy(accessibility = "One Minute Meditaion")
	public MobileElement fiveMinsDurationOne;
	@iOSFindBy(accessibility = "Tell Yourself Relax")
	public MobileElement fiveMinsDurationTwo;
	@iOSFindBy(accessibility = "Sleep Meditation")
	public MobileElement tenMinsDurationOne;
	@iOSFindBy(accessibility = "Just for Today")
	public MobileElement tenMinsDurationTwo;
	@iOSFindBy(accessibility = "Morning Meditaio with Music")
	public MobileElement fifteenMinsDurationOne;
	@iOSFindBy(accessibility = "Morning Meditaion")
	public MobileElement fifteenMinsDurationTwo;
	@iOSFindBy(accessibility = "Breathing into Sleep")
	// Same as Filter By Mins. so no need seperate elements
	// public MobileElement twentyMinsDurationOne;
	// @iOSFindBy(accessibility = "Relax into Sleep Guided Meditation")
	// public MobileElement twentyMinsDurationTwo;
	// @iOSFindBy(accessibility = "Yoga Nidra for Sleep")
	// public MobileElement thirtyMinsDurationOne;
	// @iOSFindBy(accessibility = "Relax & Sleep Well")
	// public MobileElement thirtyMinsDurationTwo;
	// @iOSFindBy(accessibility = "Peaceful Sleep Meditation")
	// public MobileElement thirtyPlusMinsDurationOne;
	// @iOSFindBy(accessibility = "Deep Sleep Guided Meditation")
	// public MobileElement thirtyPlusMinsDurationTwo;
	// @iOSFindBy(accessibility = "Whispering Notes")

	// sleep Filter by Mins
	@iOSFindBy(accessibility = "3X3 Restful Sleep")
	public MobileElement fiveMinsSleepOne;
	@iOSFindBy(accessibility = "Breath Meditation")
	public MobileElement fiveMinsSleepTwo;
	@iOSFindBy(accessibility = "Sleep Meditation")
	public MobileElement tenMinsSleepOne;
	@iOSFindBy(accessibility = "Restful Sleep Meditation")
	public MobileElement tenMinsSleepTwo;
	@iOSFindBy(accessibility = "The Perfect Way to Get to Sleep")
	public MobileElement fifteenMinsSleepOne;
	@iOSFindBy(accessibility = "Meditation for Good Night Sleep")
	public MobileElement fifteenMinsSleepTwo;
	@iOSFindBy(accessibility = "Breathing into Sleep")
	public MobileElement twentyMinsSleepOne;
	@iOSFindBy(accessibility = "Relax into Sleep Guided Meditation")
	public MobileElement twentyMinsSleepTwo;
	@iOSFindBy(accessibility = "Yoga Nidra for Sleep")
	public MobileElement thirtyMinsSleepOne;
	@iOSFindBy(accessibility = "Relax & Sleep Well")
	public MobileElement thirtyMinsSleepTwo;
	@iOSFindBy(accessibility = "Peaceful Sleep Meditation")
	public MobileElement thirtyPlusMinsSleepOne;
	@iOSFindBy(accessibility = "Deep Sleep Guided Meditation")
	public MobileElement thirtyPlusMinsSleepTwo;
	@iOSFindBy(accessibility = "Whispering Notes")
	public MobileElement maleOnlyOne;
	@iOSFindBy(accessibility = "Full Body Relaxation for Sleep")
	public MobileElement maleOnlyTwo;
	@iOSFindBy(accessibility = "Yoga Nidra for Sleep")
	public MobileElement femaleOnlyOne;
	@iOSFindBy(accessibility = "Healing Darkness for Sleep")
	public MobileElement femaleOnlyTwo;

	@iOSFindBy(accessibility = "Breathing into Sleep")
	public MobileElement withBackMusicOne;
	@iOSFindBy(accessibility = "Guided Meditation for Deep Sleep")
	public MobileElement withBackMusicTwo;
	@iOSFindBy(accessibility = "Yoga Nidra for Sleep")
	public MobileElement withoutBackMusicOne;
	@iOSFindBy(accessibility = "Sleep Meditation")
	public MobileElement withoutBackMusicTwo;

	// Teachers follow and unfollow

	@iOSFindBy(accessibility = "Heather Sundberg")
	public MobileElement teacherName;
	// XCUIElementTypeApplication[@name="Insight
	// Timer"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell

	public void clickTeacherName() {

		teacherName.click();
	}

	public boolean existTeacherName() {
		return teacherName.isDisplayed();
	}

	public void clickSearchBtn() {

		searchBtn.click();
	}

	public void clickSearchTextField() {

		searchTextField.click();
	}

	public void clickCleartext() {

		cleartext.click();
	}

	public void clickCancelSearchBtn() {

		cancelSearchBtn.click();
	}

	public boolean existSearchErrorText() {
		return searchErrorText.isDisplayed();
	}

	public boolean existGlasses() {
		return glasses.isDisplayed();
	}

	public void clickSearchTopResult() {

		searchTopResult.click();
	}

	public void fillSearchTextField(String string) {
		searchTextField.sendKeys(string);
	}
	// Duration methods

	public boolean existFiveMinsDurationOne() {
		return fiveMinsDurationOne.isDisplayed();
	}

	public boolean existFiveMinsDurationTwo() {
		return fiveMinsDurationTwo.isDisplayed();
	}

	public boolean existTenMinsDurationOne() {
		return tenMinsDurationOne.isDisplayed();
	}

	public boolean existTenMinsDurationTwo() {
		return tenMinsDurationTwo.isDisplayed();
	}

	public boolean existFifteenMinsDurationOne() {
		return fifteenMinsDurationOne.isDisplayed();
	}

	public boolean existFifteenMinsDurationTwo() {
		return fifteenMinsDurationTwo.isDisplayed();
	}

	// sleep methods
	public boolean existFiveMinsSleepOne() {
		return fiveMinsSleepOne.isDisplayed();
	}

	public boolean existFiveMinsSleepTwo() {
		return fiveMinsSleepTwo.isDisplayed();
	}

	public boolean existTenMinsSleepOne() {
		return tenMinsSleepOne.isDisplayed();
	}

	public boolean existTenMinsSleepTwo() {
		return tenMinsSleepTwo.isDisplayed();
	}

	public boolean existFifteenMinsSleepOne() {
		return fifteenMinsSleepOne.isDisplayed();
	}

	public boolean existFifteenMinsSleepTwo() {
		return fifteenMinsSleepTwo.isDisplayed();
	}

	public boolean existTwentyMinsSleepOne() {
		return twentyMinsSleepOne.isDisplayed();
	}

	public boolean existTwentyMinsSleepTwo() {
		return twentyMinsSleepTwo.isDisplayed();
	}

	public boolean existThrityMinsSleepOne() {
		return thirtyMinsSleepOne.isDisplayed();
	}

	public boolean existThrityMinsSleepTwo() {
		return thirtyMinsSleepTwo.isDisplayed();
	}

	public boolean existThrityPlusMinsSleepOne() {
		return thirtyPlusMinsSleepOne.isDisplayed();
	}

	public boolean existThrityPlusMinsSleepTwo() {
		return thirtyPlusMinsSleepTwo.isDisplayed();
	}

	public boolean existMaleOnlyOne() {
		return maleOnlyOne.isDisplayed();
	}

	public boolean existMaleOnlyTwo() {
		return maleOnlyTwo.isDisplayed();
	}

	public boolean existFemaleOnlyOne() {
		return femaleOnlyOne.isDisplayed();
	}

	public boolean existFemaleOnlyTwo() {
		return femaleOnlyTwo.isDisplayed();
	}

	public boolean existWithBackMusicOne() {
		return withBackMusicOne.isDisplayed();
	}

	public boolean existWithBackMusicTwo() {
		return withBackMusicTwo.isDisplayed();
	}

	public boolean existWithoutBackMusicOne() {
		return withoutBackMusicOne.isDisplayed();
	}

	public boolean existWithoutBackMusicTwo() {
		return withoutBackMusicTwo.isDisplayed();
	}

	//
	// public boolean isMusicExist() {
	// return elementExists(music);
	// }
	//
	// public boolean isOriginsTextExist() {
	// return elementExists(originsText);
	// }
	//
	// public boolean isSciencesExist() {
	// return elementExists(sciences);
	// }
	//
	// public boolean isPlayFollowExist() {
	// return elementExists(playFollow);
	// }

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

}
