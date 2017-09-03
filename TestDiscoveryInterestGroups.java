package Tests;

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
import Pages.LibraryPlayPage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;

public class TestDiscoveryInterestGroups extends TestBase {

	LibraryExplorePage libraryExplorePage;
	MyLibraryPage myLibraryPage;
	LibrarySearchPage librarySearchPage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
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

	@Test(priority = 0)
	public void testMindfulnessOne() throws Throwable {
		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		scroll("down");
		takeScreenshot("");

		scroll("down");
		takeScreenshot("");
		scroll("down");
		takeScreenshot("");

		libraryExplorePage.clickMindfulness();

		takeScreenshot("");
		assertVisibleWithTimer(libraryExplorePage.mindfulness, "Mindfulness not correct");
		discoveryInterestGroupsPage.clickMindfulnessMeditation();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickFollow();
		takeScreenshot("");

		discoveryInterestGroupsPage.clickFollowing();
		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.awarenessMeditation, "AwarenessMeditation not correct");
		discoveryInterestGroupsPage.clickAwarenessMeditation();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickFollow();
		takeScreenshot("");
		discoveryInterestGroupsPage.clickFollowing();
		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

	}

	@Test(priority = 1)
	public void testMindfulnesstwo() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(4000);

		scroll("down");
		takeScreenshot("");

		scroll("down");
		takeScreenshot("");
		scroll("down");
		takeScreenshot("");

		libraryExplorePage.clickMindfulness();

		takeScreenshot("");

		assertVisibleWithTimer(discoveryInterestGroupsPage.awarenessMeditation, "AwarenessMeditation not correct");
		discoveryInterestGroupsPage.clickAwarenessMeditation();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.insightMeditation, "InsightMeditation not correct");
		discoveryInterestGroupsPage.clickInsightMeditation();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.mbsrMindfulness, "existMbsrMindfulness not correct");
		discoveryInterestGroupsPage.clickMbsrMindfulness();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.vipassana, "Vipassana not correct");
		discoveryInterestGroupsPage.clickVipassana();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.thaiForestMeditation, "ThaiForestMeditation not correct");
		discoveryInterestGroupsPage.clickThaiForestMeditation();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		scroll("down");

		assertVisibleWithTimer(discoveryInterestGroupsPage.zenZazen, "ZenZazen() not correct");
		discoveryInterestGroupsPage.clickZenZazen();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.mahamudra, "Mahamudra not correct");
		discoveryInterestGroupsPage.clickMahamudra();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.mindfulEating, "existMindfulEating not correct");
		discoveryInterestGroupsPage.clickMindfulEating();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

		assertVisibleWithTimer(discoveryInterestGroupsPage.mbct, "MBCT not correct");
		discoveryInterestGroupsPage.clickMBCT();

		takeScreenshot("");
		discoveryInterestGroupsPage.clickBackButton();

	}

	// @Test
	// public void testSleepDiscoveryInterestGroups() throws Throwable {
	//
	// libraryExplorePage.clickSleep();
	//
	// takeScreenshot("");
	// discoveryInterestGroupsPage.clickSleepNow();
	//
	// takeScreenshot("");
	//
	// for (int i = 1; i < 5; i++) {
	// scroll("up");
	// takeScreenshot("");
	// assertVisibleWithTimer(discoveryInterestGroupsPage.existListAll(),
	// "listAll
	// Now not dipslay correctly");
	//
	// }
	//
	// }
	//
	// @Test
	// public void testSleepDiscoveryInterestPage() throws Throwable {
	//
	// libraryExplorePage.clickSleep();
	//
	// takeScreenshot("");
	// discoveryInterestGroupsPage.clickSleepNow();
	//
	// takeScreenshot("");
	//
	// // assertVisibleWithTimer(discoveryInterestGroupsPage.existListAll(),
	// // "listAll Now not dipslay correctly");
	//
	// scroll("down");
	//
	// // assertVisibleWithTimer(discoveryInterestGroupsPage.existPopular(), "
	// // Populare dipslay correctly");
	// //
	// assertVisibleWithTimer(discoveryInterestGroupsPage.existGuidedMeditations(),
	// // " GuidedMeditations dipslay correctly");
	// discoveryInterestGroupsPage.clickSeeAll();
	//
	// scroll("down");
	// takeScreenshot("");
	// discoveryInterestGroupsPage.clickBackButton();
	// scroll("down");
	// takeScreenshot("");
	//
	// assertVisibleWithTimer(libraryExplorePage.existMusic(), " Music dipslay
	// correctly");
	// assertVisibleWithTimer(libraryExplorePage.existTalks(), " Talks dipslay
	// correctly");
	// scroll("down");
	// takeScreenshot("");
	//
	// assertVisibleWithTimer(libraryExplorePage.existTeachers(), " Teachers
	// dipslay
	// correctly");
	// assertVisibleWithTimer(libraryExplorePage.existMoreInSleep(), "
	// MoreInSleep
	// dipslay correctly");
	// assertVisibleWithTimer(discoveryInterestGroupsPage.existSleepQuality(), "
	// sleep quality dipslay correctly");
	//
	// }

}
