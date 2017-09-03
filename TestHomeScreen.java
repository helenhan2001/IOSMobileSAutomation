package Tests;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;

import Pages.LoginPage;
import Pages.TimerPage;

public class TestHomeScreen extends TestBase {

	private HomePage page;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		page = new HomePage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginApp();
		takeScreenshot("Before");

		acceptAlertIfExists();
		acceptTCAgreeIfExists();
	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod

	public void AfterTestMethod() {

	}

	@Test(priority = 0)
	public void testHomeScreenRefresh() throws Throwable {

		for (int i = 1; i < 5; i++) {
			scroll("up");
			takeScreenshot("");

			assertVisibleWithTimer(page.map, "Insight Timer Home Screen map not  dipslay correctly");
			// assertVisibleWithTimer(page.isNumberCorrect(), "Insight Timer
			// Home
			// Screen online number not dipslay correctly");
			assertVisibleWithTimer(page.logo, "Insight Timer Home Screen Logo not sdipslay correctly");
		}

		// takeScreenshot("Map and logo");
	}

	@Test(priority = 1)
	public void testNearby() throws Throwable {

		for (int i = 1; i < 5; i++) {
			scroll("down");

			if (page.isNearbyExist()) {
				break;
			}
		}
		takeScreenshot("");

		assertVisibleWithTimer(page.nearby, "Insight Timer Home Screen Nearby not display correctly");
		// page.clickNearby();
		// assertVisibleWithTimer(page.verifyNearby(), "Insight Timer Home
		// Screen
		// Nearby not display correctly");
		// page.clickNearbyEdit();
		// page.clickDone();
		// page.clickBack();
		// takeScreenshot("Group NearBy");

	}

	@Test(priority = 2)
	public void testGroupOne() throws Throwable {

		for (int i = 1; i < 5; i++) {
			scroll("down");

			if (page.isGroupOneExist()) {
				break;
			}
		}
		takeScreenshot("");
		assertVisibleWithTimer(page.groupOne, "Insight Timer Home Screen GroupOne not dipslay correctly");
		// takeScreenshot("Group One");
	}

	@Test(priority = 3)
	public void testGroupTwo() throws Throwable {

		for (int i = 1; i < 5; i++) {
			scroll("down");

			if (page.isGroupTwoExist()) {
				break;
			}
		}

		assertVisibleWithTimer(page.groupTwo, "Insight Timer Home Screen  GroupTwo not dipslay correctly");
		// takeScreenshot("Group Two");
	}

	@Test(priority = 4)
	public void testGroupThree() throws Throwable {

		for (int i = 1; i < 5; i++) {
			scroll("down");

			if (page.isGroupThreeExist()) {
				break;
			}
		}
		takeScreenshot("");
		assertVisibleWithTimer(page.groupThree, "Insight Timer Home Screen  GroupThree not dipslay correctly");
		// takeScreenshot("Group Three");
	}

	@Test(priority = 5)
	public void testGroupFour() throws Throwable {

		for (int i = 1; i < 6; i++) {
			scroll("down");

			if (page.isGroupFourExist()) {
				break;
			}
		}
		takeScreenshot("");

		assertVisibleWithTimer(page.groupFour, "Insight Timer Home Screen  GroupFour not dipslay correctly");
		// takeScreenshot("Group Four");
	}

	@Test(priority = 6)
	public void testCommunity() throws Throwable {

		for (int i = 1; i < 7; i++) {
			scroll("down");

			if (page.isCommunityExist()) {
				break;
			}
		}
		takeScreenshot("");

		assertVisibleWithTimer(page.community, "Insight Timer Home Screen  Community not dipslay correctly");
		// takeScreenshot("community");
	}

}
