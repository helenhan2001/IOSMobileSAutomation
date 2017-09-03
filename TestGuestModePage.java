package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GuestModePage;
import Pages.HomePage;

import Pages.LibraryExplorePage;
import Pages.LoginPage;

public class TestGuestModePage extends TestBase {

	GuestModePage page;
	LibraryExplorePage libraryPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		page = new GuestModePage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {
		// LoginPage loginPage = new LoginPage(driver);
		// loginPage.LoginApp();
		// Thread.sleep(1500);
		// driver.switchTo().alert().accept();
	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod

	public void AfterTestMethod() {

	}

	@Test(priority = 0)
	public void testGuestModeSkip() throws Throwable {

		page.skipBtn();
		takeScreenshot("GuestModeskip");
		page.fewMonth();
		takeScreenshot("GuestModeMonth");
		acceptAlertIfExists();
		takeScreenshot("");
		assertVisibleWithTimer(page.logo, "Insight Timer LOGOs display not correct");
		assertVisibleWithTimer(page.map, "Insight Timer MAP display not correct");
		assertVisibleWithTimer(page.friendHomePage, "Home Page Friends  display not correct");

	}

	@Test(priority = 1)
	public void testGuestModeLandPageAddFriend() throws Throwable {

		page.skipBtn();
		page.fewMonth();
		acceptAlertIfExists();

		page.landAddFriend();
		// takeScreenshot("Guest Mode NearBY");
		page.skipBtn();
		Thread.sleep(100);
		takeScreenshot("");
		assertVisibleWithTimer(page.logo, "Insight Timer LOGOs display not correct");
		assertVisibleWithTimer(page.map, "Insight Timer MAP display not correct");
		assertVisibleWithTimer(page.friendHomePage, "Home Page Friends  display not correct");
		/*
		 * sign in has problem. fix later page.clickSigninHomePage();
		 * 
		 * page.skipBtn();
		 */

	}

	@Test(priority = 2)
	public void testGuestModeFriends() throws Throwable {
		page.skipBtn();
		page.fewMonth();
		takeScreenshot("");
		acceptAlertIfExists();

		page.clickFriendHomePage();
		takeScreenshot("");
		page.skipBtn();
		takeScreenshot("");
		Thread.sleep(100);
		assertVisibleWithTimer(page.logo, "Insight Timer LOGOs display not correct");
	}

	@Test(priority = 3)
	public void testGuestModeHomePageNearby() throws Throwable {

		page.skipBtn();

		page.clickTeacher();

		acceptAlertIfExists();

		page.clickNearby();
		takeScreenshot("");
		// page.sendYourLocation(); //it is not has ID to test
		page.clickNearbyDone();

	}

	@Test(priority = 4)
	public void testGuestModeHomePageCommunity() throws Throwable {
		page.skipBtn();

		page.moreThanYear();

		acceptAlertIfExists();
		scroll("down");
		takeScreenshot("");
		assertVisibleWithTimer(page.community, "Comunityis  not display correct");

	}

	@Test(priority = 5)
	public void testGuestModeLibrary() throws Throwable {

		page.skipBtn();
		page.moreThanYear();
		acceptAlertIfExists();
		page.clickTabGuided();
		Thread.sleep(1300);
		// assertVisibleWithTimer(libraryPage.verifyExplore(), "library Explore
		// not
		// correctly");
		takeScreenshot("");
		assertVisibleWithTimer(libraryPage.english, "library English bell not correctly");

	}
	/*
	 * Timer AID not ready for tesitng. will do later
	 * 
	 * @Test(priority = 6) public void testGuestModeTimer() throws Throwable {
	 * 
	 * page.clickTabTimer(); page.clickTimerStart(); //
	 * helper.getDriver().wait(20); Thread.sleep(200); page.clickTimerPause();
	 * page.clickTimerFinishEarly(); page.clickTimerDone();
	 * page.clickFirstThanksPeopleImg(); page.clickTimerThanksPeopleBtn();
	 * page.skipBtn();
	 * 
	 * } }
	 **/

	@Test(priority = 6)
	public void testGuestModeGroupe() throws Throwable {

		page.skipBtn();
		page.moreThanYear();
		acceptAlertIfExists();

		page.clickGroupPageSignin();
		takeScreenshot("");
		page.skipBtn();
		Thread.sleep(100);

		assertVisibleWithTimer(page.logo, "Insight Timer LOGOs display not correct");

	}

	@Test(priority = 7)
	public void testGuestModeProfile() throws Throwable {

		page.skipBtn();
		page.moreThanYear();
		acceptAlertIfExists();
		page.clickTabProfile();
		takeScreenshot("");
		page.clickAddPhoto();
		takeScreenshot("");
		page.skipBtn();
		page.enterYourname();
		takeScreenshot("");
		page.skipBtn();
		page.clickDetailedChatsAndStats();
		takeScreenshot("");
		page.myProgressDays();
		takeScreenshot("");
		page.clickMyProgressWeeks();
		takeScreenshot("");
		page.clickMonths();
		takeScreenshot("");
		page.clickAlls();// check weeks
		takeScreenshot("");
		driver.navigate().back();
		takeScreenshot("");
		page.backfromMyProgress();

		/**
		 * it is a web view. verify test later
		 * assertVisibleWithTimer(page.verifyTimerPerDay(), " Time Per Day not
		 * display correct");
		 * assertVisibleWithTimer(page.verifySessionsPerDay(), " Session Per Day
		 * is not display correct");
		 * 
		 * page.clickMyProgressWeeks(); // check weeks page.clickMonths(); //
		 * checking page.clickAlls();
		 * assertVisibleWithTimer(page.verifyConsecutiveDaysCurrent(), "Time Per
		 * Dayis not display correct");
		 * assertVisibleWithTimer(page.verifyConsecutiveDaysBest(), " Session
		 * Per Dayis not display correct");
		 * 
		 * scroll("down"); driver.findElementByAccessibilityId("All
		 * Time").isDisplayed(); //
		 * driver.findElementByAccessibilityId("TIME").isDisplayed();
		 * 
		 * driver.findElementByAccessibilityId("Total").isDisplayed();
		 * driver.findElementByAccessibilityId("Guided").isDisplayed(); //
		 * helper.getDriver().findElementByAccessibilityId("Daily //
		 * average").isDisplayed(); //
		 * driver.findElementByAccessibilityId("Average session //
		 * duration").isDisplayed(); //
		 * driver.findElementByAccessibilityId("Longest session //
		 * duration").isDisplayed();
		 * 
		 * driver.findElementByAccessibilityId("SESSIONS").isDisplayed(); // //
		 * driver.findElementByAccessibilityId("Total").isDisplayed(); //
		 * driver.findElementByAccessibilityId("Timer").isDisplayed(); //
		 * driver.findElementByAccessibilityId("Guided").isDisplayed(); //
		 * helper.getDriver().findElementByAccessibilityId("Daily //
		 * frequency").isDisplayed(); //
		 * driver.findElementByAccessibilityId("Most in single //
		 * day").isDisplayed(); // driver.findElementByAccessibilityId("Days
		 * with at least // 1session").isDisplayed(); driver.navigate().back();
		 * page.backfromMyProgress();
		 **/
	}

	@Test(priority = 8)
	public void testGuestModeProfileMilestone() throws Throwable {

		page.skipBtn();
		page.moreThanYear();
		acceptAlertIfExists();
		page.clickTabProfile();

		page.yourMilestones();
		takeScreenshot("");
		// takeScreenshot("Guest Mode MileStone");
		page.back();
		takeScreenshot("");
		page.friendsProfile();
		takeScreenshot("");
		// takeScreenshot("Guest Mode Profile");
		page.skipBtn();
		// takeScreenshot("Guest Mode skip");
	}

	// @Test(priority = 9)
	// public void testGuestModeRegister() throws Throwable {
	//
	// page.mainBtn();
	// page.fullName();
	// page.email();
	// page.password();
	// page.clickRegister();
	// takeScreenshot("Guest Mode Register");
	// acceptAlertIfExists();
	// assertVisibleWithTimer(page.verifyCommunity(), "Comunityis not display
	// correct");
	//
	// }
	//
	// @Test(priority = 10)
	// public void testGuestModeLogin() throws Throwable {
	//
	// LoginPage loginPage = new LoginPage(driver);
	// HomePage homePage = new HomePage(driver);
	// loginPage.LoginApp();
	// takeScreenshot("Guest Mode Login");
	// acceptAlertIfExists();
	// scroll("down");
	// assertVisibleWithTimer(homePage.verifyNearby(), "NearByis not display
	// correct");
	// }
	//
	// @Test(priority = 11)
	// public void testGuestModeFacebook() throws Throwable {
	//
	// page.bottonBtn();
	// // page.facebookUsername();
	// // page.facebookPassword();
	// // page.facebookLogin();
	// page.clickNearbyDone();
	// takeScreenshot("Guest Mode Facebook");
	//
	// }
}
