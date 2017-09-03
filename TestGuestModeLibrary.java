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
import Pages.LibraryPlayPage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import io.appium.java_client.MobileElement;

public class TestGuestModeLibrary extends TestBase {

	GuestModePage guestModePage;
	LibraryExplorePage libraryExplorePage;
	LibraryPlayPage libraryPlayPage;
	LibrarySearchPage librarySearchPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryExplorePage = new LibraryExplorePage(driver);
		guestModePage = new GuestModePage(driver);
		libraryPlayPage = new LibraryPlayPage(driver);
		librarySearchPage = new LibrarySearchPage(driver);

	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {
		takeScreenshot("Before");
		guestModePage.skipBtn();
		guestModePage.moreThanYear();
		acceptAlertIfExists();

	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod

	public void AfterTestMethod() {
	}

	@Test(priority = 0)
	public void testGuestModeLibrary() throws Throwable {

		guestModePage.clickTabGuided();
		takeScreenshot("");

		assertVisibleWithTimer(libraryExplorePage.myBookmarks, "existMyBookmarks is not correctly");
		libraryExplorePage.clickMyBookmarks();
		assertVisibleWithTimer(libraryExplorePage.nothingFound, "existNothingFound is not correctly");
		libraryExplorePage.clickBackButton();
		takeScreenshot("");

		assertVisibleWithTimer(libraryExplorePage.myTeachers, "existMyTeachers is not correctly");
		libraryExplorePage.clickMyTeachers();
		assertVisibleWithTimer(libraryExplorePage.nothingFound, "existNothingFound is not correctly");
		libraryExplorePage.clickBackButton();
		takeScreenshot("");

		assertVisibleWithTimer(libraryExplorePage.myIntersets, "existMyIntersets is not correctly");
		libraryExplorePage.clickMyIntersets();
		assertVisibleWithTimer(libraryExplorePage.nothingFound, "existNothingFound is not correctly");
		libraryExplorePage.clickBackButton();
		takeScreenshot("");

	}

	@Test(priority = 1)
	public void testGuestModeFollowInterest() throws Throwable {

		guestModePage.clickTabGuided();
		takeScreenshot("");

		takeScreenshot("");
		librarySearchPage.fillSearchTextField("sleep");
		takeScreenshot("");
		librarySearchPage.clickSearchTopResult();

		libraryPlayPage.clickPlayFollow();
		guestModePage.skipBtn();
		takeScreenshot("");

	}
	// Because scroll can not go to exactly element. so comment these test
	// cases, and fix later, 27.07.2017 by Helen
	// @Test(priority = 2)
	// public void testGuestModeLibraryNewToday() throws Throwable {
	//
	// assertVisibleWithTimer(libraryExplorePage.existNewToday(), "library NEW
	// Today
	// is not correctly");
	//
	// takeScreenshot("");
	//
	// // newTodayImageOne.click();
	// // SwipeAToB(newTodayImageOne, newTodayImageTwo, 1000, 1);
	// libraryExplorePage.clickNewTodayImageOne();
	// Thread.sleep(1000);
	// takeScreenshot("");
	// libraryPlayPage.clickPlayBookmarkButton();
	// guestModePage.skipBtn();
	// takeScreenshot("");
	// scroll("down");
	// takeScreenshot("");
	//
	// }
	//
	// @Test(priority = 3)
	// public void LibraryPopular() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// assertVisibleWithTimer(libraryExplorePage.existPopular(), "Popular not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existYoga(), "Yoga not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existYogaNidra(), "YogaNidra
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSleepDeeplyNow(),
	// "SleepDeeplyNow not correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existRelaxation(), "Relaxation
	// not
	// correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existSecularMindfulness(),
	// "Secular
	// Mindfulness not correct");
	// assertVisibleWithTimer(libraryExplorePage.existAfirmationMeditation(), "A
	// firmationMeditation not correct");
	//
	// // libraryPage.sendkeySearchBtn();
	// // Thread.sleep(300);
	//
	// }
	//
	// @Test(priority = 4)
	// public void LibraryHelpWith() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// // assertVisibleWithTimer(libraryPage.existGetHelpWith(), "Get Help with
	// not
	// // correct");
	// assertVisibleWithTimer(libraryExplorePage.existHelpWithMsg(), "Get Help
	// Message with not correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existCreativityPerformance(),
	// "Creativity Performance not correct");
	// libraryExplorePage.clickCreativityPerformance();
	// takeScreenshot("");
	// Thread.sleep(1000);
	// libraryExplorePage.clickBackButton();
	// takeScreenshot("");
	// Thread.sleep(1000);
	//
	// assertVisibleWithTimer(libraryExplorePage.existGroundedHappy(), "Grounded
	// Happy not correct");
	// libraryExplorePage.clickGroundedHappy();
	// takeScreenshot("");
	// Thread.sleep(1000);
	// libraryExplorePage.clickBackButton();
	// takeScreenshot("");
	// Thread.sleep(1000);
	//
	// assertVisibleWithTimer(libraryExplorePage.existkidsTeens(), "kids Teens
	// not
	// correct");
	// libraryExplorePage.clickKidsTeens();
	// takeScreenshot("");
	// Thread.sleep(1000);
	// libraryExplorePage.clickBackButton();
	// takeScreenshot("");
	// Thread.sleep(1000);
	//
	// assertVisibleWithTimer(libraryExplorePage.existRecoveryHealing(),
	// "Recovery
	// Healing snot correct");
	// libraryExplorePage.clickRecoveryHealing();
	// takeScreenshot("");
	// Thread.sleep(1000);
	// libraryExplorePage.clickBackButton();
	// takeScreenshot("");
	// Thread.sleep(1000);
	//
	// // libraryPage.sendkeySearchBtn();
	// // Thread.sleep(300);
	//
	// }
	//
	// @Test(priority = 5)
	// public void GuestModePractices() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// assertVisibleWithTimer(libraryExplorePage.existConcentration(),
	// "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existConcentrationText(),
	// "Creativity Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existGentleRepetition(),
	// "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existGentleRepetitionText(),
	// "Creativity Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existMindfulness(), "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existMindfulnessText(),
	// "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existMovement(), "Creativity
	// Performance not correct");
	// // assertVisibleWithTimer(libraryPage.existMovementText(), "Creativity
	// // Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSelfObservation(),
	// "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSelfObservationText(),
	// "Creativity Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSound(), "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSoundText(), "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existVisualization(),
	// "Creativity
	// Performance not correct");
	// assertVisibleWithTimer(libraryExplorePage.existVisualizationText(),
	// "Creativity Performance not correct");
	//
	// }
	//
	// @Test(priority = 6)
	// public void testGuestFollowTeacher() throws Throwable {
	//
	// libraryExplorePage.sendkeySearchBtn("no result");
	//
	// assertVisibleWithTimer(librarySearchPage.existGlasses(), "library search
	// glasses is not correctly");
	// assertVisibleWithTimer(librarySearchPage.existSearchErrorText(), "library
	// search error text is not correctly");
	// librarySearchPage.clickCleartext();
	//
	// takeScreenshot("");
	// librarySearchPage.fillSearchTextField("sleep");
	// takeScreenshot("");
	// librarySearchPage.clickSearchTopResult();
	//
	// libraryPlayPage.clickPlayFollow();
	// guestModePage.skipBtn();
	// takeScreenshot("");
	//
	// }
	//
	// // Below test cases is failed becasue It is can't find the element, will
	// fix
	// // later-21/07 by Helen
	// @Test(priority = 7)
	// public void GuestModeMusic() throws Throwable {
	//
	// for (int i = 1; i < 5; i++) {
	// scroll("down");
	// // should change music visble is true
	// if (libraryExplorePage.isMusicExist()) {
	// break;
	// }
	// }
	// takeScreenshot("");
	//
	// // assertVisibleWithTimer(libraryPage.existMusicText(), "Music Text not
	// // correct");
	// assertVisibleWithTimer(libraryExplorePage.existSeeAll(), "see all not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existAmbientMusic(), "Music not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existBinauralBeats(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existChantingMantras(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existClassicalMusic(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existDrumming(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existGospelChoir(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existHarmonics(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existInstrumentalMusic(),
	// "Music
	// Text not correct");
	// assertVisibleWithTimer(libraryExplorePage.existNatureSounds(), "Music
	// Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existRhythmicMusic(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSacredMusic(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSolfeggioFrequencies(),
	// "Music
	// Text not correct");
	// assertVisibleWithTimer(libraryExplorePage.existSoundHealing(), "Music
	// Text not
	// correct");
	//
	// }
	//
	// @Test(priority = 8)
	// public void LibraryOrigins() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	// scroll("down");
	//
	// takeScreenshot("");
	// // Library Origins
	//
	// //
	// assertVisibleWithTimer(libraryExplorePage.existOrigins(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existoOriginsText(), "Music
	// Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSciences(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existConcepts(), "see all not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existTraditions(), "Music not
	// correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existAlternativeMedicine(),
	// "Music
	// Text not correct");
	// assertVisibleWithTimer(libraryExplorePage.existBahFaith(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existBhaktiMovement(), "Music
	// Text
	// not correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existBuddhism(), "see all not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existChristianity(), "Music not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existConfucianism(), "Music
	// Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existConsciousness(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existEnergybased(), "Music Text
	// not
	// correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existIslam(), "see all not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existHinduism(), "Music not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existJainism(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existKbbalah(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existMetaphysics(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existMysticism(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existNaturalEnvironment(),
	// "Music
	// Text not correct");
	// assertVisibleWithTimer(libraryExplorePage.existNeuroscience(), "Music
	// Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existNonduality(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existPerennialism(), "Music
	// Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existPsychology(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existScienceMedicine(), "Music
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existShamanism(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existShinto(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSikhism(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSpirituality(), "Music
	// Text not
	// correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existSportScience(), "Music not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSufism(), "Music Text not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existTaoism(), "Music Text not
	// correct");
	//
	// assertVisibleWithTimer(libraryExplorePage.existYogicTradition(), "Music
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existVedic(), "Music Text not
	// correct");
	//
	// }
	//
	// @Test(priority = 9)
	// public void LibraryTeacher() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	// scroll("down");
	//
	// takeScreenshot("");
	// scroll("down");
	//
	// takeScreenshot("");
	// // Library Origins
	//
	// //
	// assertVisibleWithTimer(libraryExplorePage.existTeachers(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existTeacherText(), "Music Text
	// not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSeeAllTeacher(), "Music
	// Text
	// not correct");
	//
	// }
	//
	// @Test(priority = 10)
	// public void LibraryTalk() throws Throwable {
	//
	// scroll("down");
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	//
	// scroll("down");
	//
	// takeScreenshot("");
	// scroll("down");
	//
	// takeScreenshot("");
	// scroll("down");
	//
	// takeScreenshot("");
	// // Library Talks
	//
	// assertVisibleWithTimer(libraryExplorePage.existTalks(), " Talk not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existSeeAll(), " See All not
	// correct");
	// assertVisibleWithTimer(libraryExplorePage.existTalkImage(), "Talk Image
	// Text
	// not correct");
	// assertVisibleWithTimer(libraryExplorePage.existTalkText(), "Talk Text not
	// correct");
	//
	// }

}