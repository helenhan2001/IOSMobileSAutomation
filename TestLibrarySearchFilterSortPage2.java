package Tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.GuestModePage;
import Pages.HomePage;

import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestLibrarySearchFilterSortPage2 extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	MyLibraryPage myLibraryPage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginApp();
		takeScreenshot("Before");
		Thread.sleep(1500);
		acceptAlertIfExists();
		acceptTCAgreeIfExists();

	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod

	public void AfterTestMethod() {

	}

	@Test(priority = 1)
	public void testDurationFilterFiveMins() throws Throwable {
		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickFiveMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");

		Assert.assertTrue(librarySearchPage.existFiveMinsDurationOne(),
				"existFiveMinsDurationOne not sdipslay correctly");
		Assert.assertTrue(librarySearchPage.existFiveMinsDurationTwo(),
				"existFiveMinsDurationTwo not sdipslay correctly");

	}

	@Test(priority = 2)
	public void testDurationFilterTenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickTenMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");
		Assert.assertTrue(librarySearchPage.existTenMinsDurationOne(),
				"exist TenMinsDurationOne not sdipslay correctly");
		Assert.assertTrue(librarySearchPage.existTenMinsDurationTwo(),
				"exist TenMinsDurationTwo not sdipslay correctly");
	}

	@Test(priority = 3)
	public void testDurationFilterFifteenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickFifteenMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");
		Assert.assertTrue(librarySearchPage.existFiveMinsDurationOne(),
				"existFiveMinsDurationOne not sdipslay correctly");
		Assert.assertTrue(librarySearchPage.existFifteenMinsSleepTwo(),
				"existFiveMinsDurationTwo not sdipslay correctly");
	}

	@Test(priority = 4)
	public void testDurationFilterTwentyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickTwentyMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");
		Assert.assertTrue(librarySearchPage.existTwentyMinsSleepOne(), "TwentyMinsSleepOne not sdipslay correctly");
		Assert.assertTrue(librarySearchPage.existTwentyMinsSleepTwo(), "TwentyMinsSleepTwo not sdipslay correctly");

	}

	@Test(priority = 5)
	public void testDurationFilterThirtyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickThirtyMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");
		Assert.assertTrue(librarySearchPage.existThrityMinsSleepOne(),
				"Insight Timer Home Screen Logo not sdipslay correctly");
		Assert.assertTrue(librarySearchPage.existThrityMinsSleepTwo(),
				"Insight Timer Home Screen Logo not sdipslay correctly");

	}

	@Test(priority = 6)
	public void testDurationFilterThirtyPlusMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(3000);
		scroll("down");
		scroll("down");

		myLibraryPage.clickThirtyPlusMins();
		Thread.sleep(1000);
		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		Thread.sleep(1000);
		takeScreenshot("");
		Assert.assertTrue(librarySearchPage.existThrityPlusMinsSleepOne(),
				"ThrityPlusMinsSleepOne not display correctly");
		Assert.assertTrue(librarySearchPage.existThrityPlusMinsSleepTwo(),
				"ThrityPlusMinsSleepTwo  not display correctly");

	}

}
