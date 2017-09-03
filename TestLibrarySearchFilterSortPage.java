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

public class TestLibrarySearchFilterSortPage extends TestBase {

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

		acceptAlertIfExists();
		acceptTCAgreeIfExists();

	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod

	public void AfterTestMethod() {

	}

	@Test(enabled = false)
	public void testSearchNoResult() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		libraryExplorePage.sendkeySearchBtn("no result");
		takeScreenshot("");

		assertVisibleWithTimer(librarySearchPage.glasses, "Search No Result not correctly");
		assertVisibleWithTimer(librarySearchPage.searchErrorText, "library search error text not correctly");
		librarySearchPage.clickCleartext();

		takeScreenshot("");
		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

	}

	@Test(priority = 1)
	public void testFilterSortingFiveMins() throws Throwable {
		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		// librarySearchPage.clickSearchTopResult();
		// libraryExplorePage.clickSleep();
		//
		// takeScreenshot("");
		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickFiveMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");

		// assertVisibleWithTimer(librarySearchPage.existFiveMinsSleepOne(),
		// "existFiveMinsSleepOne is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.fiveMinsSleepTwo, "existFiveMinsSleepTwo is not sdipslay correctly");

	}

	@Test(priority = 2)
	public void testFilterSortingTenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickTenMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.tenMinsSleepOne, "TenMinsSleepOne is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.tenMinsSleepTwo, "TenMinsSleepTwo is not sdipslay correctly");
	}

	@Test(priority = 3)
	public void testFilterSortingFifteenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickFifteenMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.fifteenMinsSleepOne,
				"Insight Timer Home Screen Logo is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.fifteenMinsSleepTwo,
				"Insight Timer Home Screen Logo is not sdipslay correctly");
	}

	@Test(priority = 4)
	public void testFilterSortingTwentyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickTwentyMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.twentyMinsSleepOne, "TwentyMinsSleepOne is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.twentyMinsSleepTwo, "TwentyMinsSleepTwo is not sdipslay correctly");

	}

	@Test(priority = 5)
	public void testFilterSortingThirtyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickThirtyMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.thirtyMinsSleepOne,
				"Insight Timer Home Screen Logo is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.thirtyMinsSleepTwo,
				"Insight Timer Home Screen Logo is not sdipslay correctly");

	}

	@Test(priority = 6)
	public void testFilterSortingThirtyPlusMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		myLibraryPage.clickThirtyPlusMins();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.thirtyPlusMinsSleepOne,
				"ThrityPlusMinsSleepOne is not display correctly");
		assertVisibleWithTimer(librarySearchPage.thirtyPlusMinsSleepTwo,
				"ThrityPlusMinsSleepTwo  is not display correctly");

	}

	@Test(priority = 7)
	public void testFilterSortingMaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement maleOnly = Radios.get(0);

		maleOnly.click();

		// myLibraryPage.clickMaleOnly();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.maleOnlyOne, "MaleOnlyOne not dipslay correctly");
		assertVisibleWithTimer(librarySearchPage.maleOnlyTwo, "MaleOnlyTwo is not sdipslay correctly");

	}

	@Test(priority = 8)
	public void testFilterSortingFamaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement femaleOnly = Radios.get(1);

		femaleOnly.click();

		// myLibraryPage.clickMaleOnly();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.femaleOnlyOne, "FemaleOnlyOne not dipslay correctly");
		assertVisibleWithTimer(librarySearchPage.femaleOnlyTwo, "FemaleOnlyTwo is not sdipslay correctly");

	}

	@Test(priority = 9)
	public void testFilterSortingWithBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement withBack = Radios.get(2);

		withBack.click();

		// myLibraryPage.clickMaleOnly();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();
		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.withBackMusicOne, "WithBackMusicOnenot dipslay correctly");
		assertVisibleWithTimer(librarySearchPage.withBackMusicTwo, "WithBackMusicTwo is not sdipslay correctly");

	}

	@Test(priority = 10)
	public void testFilterSortingWithoutBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");

		discoveryInterestGroupsPage.clickSleepNow();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickListAll();

		takeScreenshot("");
		myLibraryPage.clickFilterBtn();

		takeScreenshot("");

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement without = Radios.get(3);

		without.click();

		// myLibraryPage.clickMaleOnly();

		takeScreenshot("");

		myLibraryPage.clickSubmitBtn();

		takeScreenshot("");
		assertVisibleWithTimer(librarySearchPage.withoutBackMusicOne, "WithoutBackMusicOne not dipslay correctly");
		assertVisibleWithTimer(librarySearchPage.withoutBackMusicTwo, "WithoutBackMusicTwo is not sdipslay correctly");

	}

}
