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
import Pages.LibraryPlayPage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;
import Pages.SecondLanguagePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestClickTCAgree extends TestBase {
	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;
	MyLibraryPage myLibraryPage;
	HomePage homePage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		homePage = new HomePage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginApp();
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
	public void testSmokeCase() throws Throwable {

		libraryExplorePage.clickTabGuided();
		assertVisibleWithTimer(libraryExplorePage.myBookmarksNumber, "MyBookmarks Number not display correct");
		assertVisibleWithTimer(libraryExplorePage.myTeachersNumber, "My Teacher Number not display correct");
		assertVisibleWithTimer(libraryExplorePage.myIntersetsNumber, "My Interest Number not display correct");

		myLibraryPage.clicMyTeachers();

		// assertVisibleWithTimer(myLibraryPage.alpha, "Alpha is not display
		// correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameOne, "Teacher name one not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameTwo, "Teacher name Two not display correct");

	}

}
