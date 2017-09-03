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

public class LibraryPlayPage extends BasePage {

	private IOSDriver<IOSElement> driver;

	public LibraryPlayPage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "Search for meditations, interests or teachers")
	private MobileElement searchBtn;

	@iOSFindBy(accessibility = "Explore")
	private MobileElement explore;

	@iOSFindBy(accessibility = "English")
	private MobileElement english;

	@iOSFindBy(accessibility = "My Library")
	private MobileElement myLibrary;

	// New today
	@iOSFindBy(accessibility = "New today")
	private MobileElement newToday;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	private MobileElement newTodayImageOne;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	private MobileElement newTodayImageTwo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	private MobileElement newTodayImageThree;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]")
	private MobileElement newTodayImageFour;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]")
	private MobileElement newTodayImageFive;

	@iOSFindBy(xpath = "////XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	private MobileElement playlistenPrivatelyButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	private MobileElement newPlayBackButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[2]")
	private MobileElement playShareButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]")
	private MobileElement playBookmarkButton;

	@iOSFindBy(accessibility = "FOLLOW")
	private MobileElement playFollow;

	public void clickNewPlayBackButton() {

		newPlayBackButton.click();
	}

	public void clickPlaylistenPrivatelyButton() {

		playlistenPrivatelyButton.click();
	}

	public void clickPlayShareButton() {

		playShareButton.click();
	}

	public void clickPlayBookmarkButton() {

		playBookmarkButton.click();
	}

	public void clickPlayFollow() {

		playFollow.click();
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
	public boolean isPlayFollowExist() {
		return elementExists(playFollow);
	}

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

}
