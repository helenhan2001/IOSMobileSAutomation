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
import Pages.MyLibraryPage;

public class TestMyLibraryPage extends TestBase {

	LibraryExplorePage libraryExplorePage;
	MyLibraryPage myLibraryPage;
	LibrarySearchPage librarySearchPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);

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
	public void testMyLibraryTeachers() throws Throwable {

		libraryExplorePage.clickTabGuided();
		assertVisibleWithTimer(libraryExplorePage.myBookmarksNumber, "MyBookmarks Number not display correct");

		assertVisibleWithTimer(libraryExplorePage.myTeachersNumber, "My Teacher Number not display correct");
		assertVisibleWithTimer(libraryExplorePage.myIntersetsNumber, "My Interest Number not display correct");

		takeScreenshot("");

		myLibraryPage.clicMyTeachers();
		takeScreenshot("");

		assertVisibleWithTimer(myLibraryPage.alpha, "Alpha  not display correct");

		assertVisibleWithTimer(myLibraryPage.teacherNameOne, "Teacher name one not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameTwo, "teacher name two not display correct");

	}

	@Test(priority = 1)
	public void testMyLibraryInterest() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		myLibraryPage.clickMyInterests();
		takeScreenshot("");
		assertVisibleWithTimer(myLibraryPage.myInterestsOne, "My Interest name one not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsTwo, "My Interest name Two not display correct");

	}

	@Test(priority = 2)
	public void testMyBookmarks() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		libraryExplorePage.clickMyBookmarks();
		takeScreenshot("");
		assertVisibleWithTimer(myLibraryPage.myBookmarksOne, "existMyBookmarksOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksTwo, "existMyBookmarksTwo display correct");

	}

	// Test Teachers follow and unfollow
	@Test(priority = 3)
	public void testTeacherFollow() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");

		libraryExplorePage.sendkeySearchBtn("HeatherSundberg");

		// librarySearchPage.fillSearchTextField("HeatherSundberg");
		takeScreenshot("");
		myLibraryPage.clickSearchTeacherName();
		takeScreenshot("");
		libraryExplorePage.clickFollow();
		takeScreenshot("");

		libraryExplorePage.clickFollowing();
		takeScreenshot("");

		myLibraryPage.clickTeacherFollowButton();
		takeScreenshot("");
		libraryExplorePage.clickFollowLowCase();
		takeScreenshot("");
		libraryExplorePage.clickFollowing();
		takeScreenshot("");

	}

}
