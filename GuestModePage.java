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

public class GuestModePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public GuestModePage(AppiumDriver driver) {
		super(driver);

	}

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "landing_skip_button")
	public MobileElement skipBtn;
	// List<MobileElement> skipBtns

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(accessibility = "header_bowl_logos")
	@iOSFindBy(accessibility = "header_bowl_logo")
	public MobileElement logo;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "activity_map")
	@iOSFindBy(accessibility = "activity_map")
	public MobileElement map;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "landing_login_button")
	public MobileElement loginBtn;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "landing-screen-logo.png")
	public MobileElement landingLogo;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Home to millions of people like you")
	public MobileElement landingMsg;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(xpath = "//*[@value='landing_login_button']")
	public MobileElement loginBtnThree;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "landing_terms_button")
	public MobileElement termsBtn;

	@iOSFindBy(accessibility = "landing_bottom_button")
	public MobileElement bottonBtn;

	@iOSFindBy(accessibility = "landing_main_button")
	public MobileElement mainBtn;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(className = "XCUIElementTypeStaticText")
	// @iOSFindBy(xpath = "//*[value='']")
	@iOSFindBy(accessibility = "Just starting out")
	public MobileElement justStart;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(className = "XCUIElementTypeButton")
	public MobileElement back;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "A few months or more")
	public MobileElement fewMonth;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "More than a year")
	public MobileElement moreThanYear;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "I'm a teacher")
	public MobileElement aTeacher;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Explore app")
	public MobileElement exploreApp;

	// Friends Elements
	@iOSFindBy(accessibility = "nav bar invite user")
	public MobileElement landAddFriend;

	@WithTimeout(time = 40, unit = TimeUnit.SECONDS)
	@iOSFindBy(accessibility = "Invite friends from Contacts")
	public MobileElement inviteFriendFromContact;

	@WithTimeout(time = 20, unit = TimeUnit.SECONDS)
	@iOSFindBy(accessibility = "Done")
	public MobileElement doneFromInvitePage;

	@iOSFindBy(accessibility = "Invite friends from Facebook")
	public MobileElement inviteFriendFromFacebook;

	@iOSFindBy(accessibility = "Find friends on Insight")
	public MobileElement inviteFriendFromInsight;

	// HomePage
	// @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(accessibility = "tab_now")
	@iOSFindBy(accessibility = "tab_now")
	public MobileElement tabNow;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Sign in")
	@iOSFindBy(accessibility = "Sign in")
	public MobileElement signinHomePage;

	@iOSFindBy(accessibility = "Friends")
	public MobileElement friendHomePage;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Community")
	@iOSFindBy(accessibility = "Community")
	public MobileElement community;

	public void clickTabNow() {
		tabNow.click();
	}

	public void clickSigninHomePage() {
		signinHomePage.click();
	}

	public void clickFriendHomePage() {
		friendHomePage.click();
	}

	public boolean verifyFriendHomePage() {
		return friendHomePage.isEnabled();

	}

	public void landAddFriend() {
		landAddFriend.click();
	}

	public void inviteFriendFromContact() {
		inviteFriendFromContact.click();
	}

	public void doneFromInvitePage() {
		doneFromInvitePage.click();
	}

	public void inviteFriendFromFacebook() {
		inviteFriendFromFacebook.click();
	}

	public void inviteFriendFromInsight() {
		inviteFriendFromInsight.click();
	}

	// Home Page sign in and Nearby

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Nearby")
	@iOSFindBy(accessibility = "Nearby")
	public MobileElement nearBy;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeTextField")
	public MobileElement nearByField;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(accessibility = "Done")
	public MobileElement nearByDone;

	@iOSFindBy(accessibility = "Add your location")
	public MobileElement addYourLocation;

	// Register elements
	@iOSFindBy(xpath = "//*[@value='Full Name']")
	public MobileElement fullName;

	@iOSFindBy(xpath = "//*[@value='Email']")
	public MobileElement email;

	@iOSFindBy(xpath = "//*[@value='Password']")
	public MobileElement password;

	@iOSFindBy(accessibility = "REGISTER")
	public MobileElement register;

	// Guided Page

	@iOSFindBy(accessibility = "tab_guided")
	public MobileElement tabGuided;

	@iOSFindBy(accessibility = "FEATURED")
	public MobileElement featured;
	@iOSFindBy(accessibility = "TOP 20")
	public MobileElement top20;
	@iOSFindBy(accessibility = "NEW")
	public MobileElement newGuided;

	@iOSFindBy(accessibility = "EXPLORE")
	public MobileElement explore;

	@iOSFindBy(accessibility = "PLAYLISTS")
	public MobileElement playlists;

	// Timer page
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "tab_timer")
	public MobileElement tabTimer;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "START")
	public MobileElement timerStart;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeButton")
	@iOSFindBy(className = "XCUIElementTypeButton")
	public MobileElement timerPause;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "Finish early")
	public MobileElement timerFinishEarly;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "DONE")
	public MobileElement timerDone;

	// @HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSFindBy(accessibility = "DONE")
	// public MobileElement timerThankedPeopleImg;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(className = "XCUIElementTypeCell")
	@iOSFindBy(className = "XCUIElementTypeCell")
	public MobileElement timerFirstThanksPeopleImg;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Thanks for meditating with me")
	@iOSFindBy(accessibility = "Thanks for meditating with me")
	public MobileElement timerThanksPeopleBtn;

	// Group Page

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "tab_groups")
	@iOSFindBy(accessibility = "tab_groups")
	public MobileElement tabGroups;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Sign in")
	@iOSFindBy(accessibility = "Sign in")
	public MobileElement groupPageSignin;

	// GuestMode Profile Page

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "tab_more")
	@iOSFindBy(accessibility = "tab_more")
	public MobileElement tabProfile;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "add photo")
	@iOSFindBy(accessibility = "add photo")
	public MobileElement addPhoto;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Enter your name")
	@iOSFindBy(accessibility = "Enter your name")
	public MobileElement enterYourname;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Detailed charts and stats")
	@iOSFindBy(accessibility = "Detailed charts and stats")
	public MobileElement detailedChatsAndStats;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "DAYS")
	@iOSFindBy(accessibility = "DAYS")
	public MobileElement myProgressDays;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(accessibility = "Time per Day")
	@iOSFindBy(accessibility = "Time per Day")
	public MobileElement timePerDay;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// @iOSXCUITFindBy(accessibility = "Sessions per Day")
	@iOSFindBy(accessibility = "Sessions per Day")
	public MobileElement sessionsPerDay;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "WEEKS")
	@iOSFindBy(accessibility = "WEEKS")
	public MobileElement weeks;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "MONTHS")
	@iOSFindBy(accessibility = "MONTHS")
	public MobileElement months;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "ALL")
	@iOSFindBy(accessibility = "ALL")
	public MobileElement allforChats;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Consecutive days - current")
	@iOSFindBy(accessibility = "Consecutive days - current")
	public MobileElement consecutiveDaysCurrent;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Consecutive days - current")
	@iOSFindBy(accessibility = "Consecutive days - best")
	public MobileElement consecutiveDaysBest;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "All Time")
	@iOSFindBy(accessibility = "All Time")
	public MobileElement allTime;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "TIME")
	@iOSFindBy(accessibility = "TIME")
	public MobileElement timeCharts;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Total")
	@iOSFindBy(accessibility = "Total")
	public MobileElement total;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Guided")
	@iOSFindBy(accessibility = "Guided")
	public MobileElement guided;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Daily average")
	@iOSFindBy(accessibility = "Daily average")
	public MobileElement dailyAverage;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Average session duratio")
	@iOSFindBy(accessibility = "Average session duratio")
	public MobileElement averageSessionDuratio;

	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Longest session duratio")
	@iOSFindBy(accessibility = "Longest session duratio")
	public MobileElement longestSessionDuratio;

	// Profile mile Stones Page

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Your milestones")
	@iOSFindBy(accessibility = "Your milestones")
	public MobileElement yourMilestones;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Friends")
	@iOSFindBy(accessibility = "Friends")
	public MobileElement friendsProfile;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Profile")
	@iOSFindBy(accessibility = "Profile")
	public MobileElement backfromMyProgress;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(accessibility = "Log in")
	@iOSFindBy(accessibility = "Log in")
	public MobileElement facebookLogin;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\" main \"/]/XCUIElementTypeSecureTextField")
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"  main \"/]/XCUIElementTypeTextField")
	public MobileElement facebookPassword;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\" main\"]/XCUIElementTypeSecureTextField")
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
	public MobileElement facebookUsername;

	// Methods

	public void loginBtn() {
		loginBtn.click();
	}

	public void fullName() {
		fullName.sendKeys("Tina Gove");
	}

	public void email() {
		email.sendKeys("tina@test.com");
	}

	public void password() {
		password.sendKeys("Password");
	}

	public void clickRegister() throws InterruptedException {
		register.click();
		Thread.sleep(300);
	}

	public void skipBtn() {
		skipBtn.click();
	}

	// public void skipBtn() {
	//
	// JavascriptExecutor jse = (JavascriptExecutor) driver;
	// jse.executeScript("arguments[0].click();", skipBtn);
	//
	// }

	public void bottonBtn() {
		bottonBtn.click();
	}

	public void termsBtn() {
		termsBtn.click();
	}

	public void mainBtn() {
		mainBtn.click();
	}

	public void justStart() {
		justStart.click();
	}

	// public void justStartOut() {
	// justStartOutTwo.click();
	// }

	public boolean verifyLandingLogoPng() {

		return landingLogo.isEnabled();

	}

	public boolean verifyMap() {
		return map.isEnabled();
	}

	public boolean verifyLogo() {
		return logo.isEnabled();

	}

	public boolean verifyExpolorApp() {
		if (exploreApp.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyLandingMsg() {
		return landingMsg.isEnabled();
	}

	public void clickExploreApp() {
		exploreApp.click();
	}

	public void back() {
		back.click();
	}

	public void fewMonth() {
		fewMonth.click();
	}

	public boolean verifyMonthisDisplay() {
		return fewMonth.isDisplayed();
	}

	public boolean verifyMonthisEnable() {
		return fewMonth.isEnabled();
	}

	public void clickTeacher() {
		aTeacher.click();
	}

	public void moreThanYear() {
		moreThanYear.click();
	}

	public void clickNearby() {
		nearBy.click();
	}

	public void addYourLocation() {
		addYourLocation.click();
	}

	public void sendYourLocation() {
		nearByField.sendKeys("Sydney");
	}

	public void clickNearbyDone() {
		nearByDone.click();
	}

	public boolean verifyCommunity() {
		if (community.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabGuided() {
		tabGuided.click();
	}

	public void clickNewGuided() {
		newGuided.click();
	}

	public void clicFeatured() {
		featured.click();
	}

	public void clickPlaylistes() {
		playlists.click();
	}

	public void clickTop20() {
		top20.click();
	}

	public void clickExplore() {
		explore.click();
	}

	public boolean verifyNewGuided() {
		if (newGuided.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTop20() {
		if (top20.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyPlaylists() {
		if (playlists.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyFeatured() {
		if (featured.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyExplore() {
		if (explore.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabTimer() {
		tabTimer.click();
	}

	public void clickTimerStart() {
		timerStart.click();
	}

	public void clickTimerFinishEarly() {
		timerFinishEarly.click();
	}

	public void clickTimerPause() {
		timerPause.click();
	}

	public void clickTimerDone() {
		timerDone.click();
	}

	public void clickFirstThanksPeopleImg() {
		timerFirstThanksPeopleImg.click();
	}

	public void clickTimerThanksPeopleBtn() {
		timerThanksPeopleBtn.click();
	}

	public void clickTabGroup() {
		tabGroups.click();
	}

	public void clickGroupPageSignin() {

		groupPageSignin.click();
	}

	// Profile
	public void clickMonths() {
		months.click();
	}

	public void clickAlls() {
		allforChats.click();
	}

	public boolean verifyConsecutiveDaysCurrent() {
		if (consecutiveDaysCurrent.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyConsecutiveDaysBest() {
		if (consecutiveDaysBest.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTabProfile() {
		tabProfile.click();
	}

	public void myProgressDays() {
		myProgressDays.click();
	}

	public boolean verifyTimerPerDay() {
		if (timePerDay.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifySessionsPerDay() {
		if (sessionsPerDay.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickMyProgressWeeks() {
		weeks.click();
	}

	public void clickAddPhoto() {
		addPhoto.click();
	}

	public void enterYourname() {
		enterYourname.click();
	}

	public void clickDetailedChatsAndStats() {
		detailedChatsAndStats.click();
	}

	public void yourMilestones() {
		yourMilestones.click();
	}

	public void friendsProfile() {
		friendsProfile.click();
	}

	public void backfromMyProgress() {
		backfromMyProgress.click();
	}

	public void facebookPassword() {
		facebookPassword.sendKeys("1qaz@WSX");
	}

	public void facebookUsername() {
		facebookUsername.sendKeys("han.helen8@gmail.com");
	}

	public void facebookLogin() {
		facebookLogin.click();
	};

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
