package Pages;

import java.util.List;
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

public class MyLibraryPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public MyLibraryPage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "A single place for storing your bookmarks, favorite teachers, and interests you follow.")
	public MobileElement myLibraryText;

	@iOSFindBy(accessibility = "My Teachers")
	public MobileElement myTeachers;

	@iOSFindBy(accessibility = "ALPHABETICALLY")
	public MobileElement alpha;

	@iOSFindBy(accessibility = "Amber Amala Polo")
	public MobileElement teacherNameOne;

	@iOSFindBy(accessibility = "Bethany Auriel-Hagan")
	public MobileElement teacherNameTwo;

	@iOSFindBy(accessibility = "My Interests")
	public MobileElement myInterests;

	@iOSFindBy(accessibility = "Relaxation Meditation")
	public MobileElement myInterestsOne;
	@iOSFindBy(accessibility = "Analytic Meditation")
	public MobileElement myInterestsTwo;

	@iOSFindBy(accessibility = "Rest Your Mind & Drift into Sleep")
	public MobileElement myBookmarksOne;
	@iOSFindBy(accessibility = "Pain Relief Meditation")
	public MobileElement myBookmarksTwo;

	@iOSFindBy(accessibility = "Explore")
	public MobileElement explore;

	@iOSFindBy(accessibility = "English")
	public MobileElement english;

	@iOSFindBy(accessibility = "My Library")
	public MobileElement myLibrary;

	// Library Filter

	@iOSFindBy(accessibility = "Reset all")
	public MobileElement resetAll;

	@iOSFindBy(accessibility = "See all")
	public MobileElement seeAll;

	@iOSFindBy(accessibility = "0 - 5")
	public MobileElement fiveMins;
	@iOSFindBy(accessibility = "6 - 10")
	public MobileElement tenMins;
	@iOSFindBy(accessibility = "11 - 15")
	public MobileElement fifteenMins;
	@iOSFindBy(accessibility = "16 - 20")
	public MobileElement twentyMins;
	@iOSFindBy(accessibility = "21 - 30")
	public MobileElement thirtyMins;
	@iOSFindBy(accessibility = "30+")
	public MobileElement thirtyPlusMins;
	@iOSFindBy(accessibility = "Male only")
	public MobileElement maleOnly;
	@iOSFindBy(accessibility = "Female only")
	public MobileElement femaleOnly;
	@iOSFindBy(accessibility = "With")
	public MobileElement with;
	@iOSFindBy(accessibility = "Without")
	public MobileElement without;

	// @iOSFindBy(accessibility = "icon option unselected")
	// public List<IOSElement> redioButtos;
	//
	// MobileElement maleOnlyEle = redioButtos.get(1);

	@iOSFindBy(accessibility = "Some in our community prefer secular teachings only.")
	public MobileElement referencesText;
	@iOSFindBy(accessibility = "unselected option")
	public MobileElement unselectedOption;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton")
	public MobileElement filterBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	public MobileElement ShareButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	public MobileElement teacherFollowButton;

	@iOSFindBy(xpath = "////XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public MobileElement searchTeacherName;

	@iOSFindBy(className = "XCUIElementTypeSwitch")
	public MobileElement switchBtn;

	@iOSFindBy(accessibility = "SUBMIT")
	public MobileElement submitBtn;

	public void clicMyTeachers() {

		myTeachers.click();
	}

	public void clickSearchTeacherName() {

		searchTeacherName.click();
	}

	public void clickTeacherFollowButton() {

		teacherFollowButton.click();
	}

	public void clickMyInterests() {

		myInterests.click();
	}

	public boolean existReferencesText() {
		return referencesText.isDisplayed();
	}

	public void clickFiveMins() {

		fiveMins.click();
	}

	public void clickSeeAll() {

		seeAll.click();
	}

	public void clickTenMins() {

		tenMins.click();
	}

	public void clickFifteenMins() {

		fifteenMins.click();
	}

	public void clickTwentyMins() {

		twentyMins.click();
	}

	public void clickThirtyMins() {

		thirtyMins.click();
	}

	public void clickThirtyPlusMins() {

		thirtyPlusMins.click();
	}

	public boolean existAlpha() {
		return alpha.isDisplayed();
	}

	public boolean existTeacherNameOne() {
		return teacherNameOne.isDisplayed();
	}

	public boolean existTeacherNameTwo() {
		return teacherNameTwo.isDisplayed();
	}

	public boolean existMyInterestsOne() {
		return myInterestsOne.isDisplayed();
	}

	public boolean existMyInterestsTwo() {
		return myInterestsTwo.isDisplayed();
	}

	public boolean existMyBookmarksOne() {
		return myBookmarksOne.isDisplayed();
	}

	public boolean existMyBookmarksTwo() {
		return myBookmarksTwo.isDisplayed();
	}

	public boolean existMaleOnly() {
		return maleOnly.isDisplayed();
	}

	// public void clickMaleOnly() {
	//
	// maleOnlyEle.click();
	// }

	public boolean existFemaleOnly() {
		return femaleOnly.isDisplayed();
	}

	public void clickFemaleOnly() {

		femaleOnly.click();
	}

	public boolean existWith() {
		return with.isDisplayed();
	}

	public void clickWith() {

		with.click();
	}

	public boolean existWithout() {
		return without.isDisplayed();
	}

	public void clickWithout() {

		without.click();
	}

	public boolean existMyLibraryText() {
		return myLibraryText.isEnabled();
	}

	public void clickSubmitBtn() {

		submitBtn.click();
	}

	public void clickResetAll() {

		resetAll.click();
	}

	public void clickUnselectedOption() {

		unselectedOption.click();
	}

	public void clickSwitchBtn() {

		switchBtn.click();
	}

	public void clickFilterBtn() {

		filterBtn.click();
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
