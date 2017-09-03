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
import Pages.SecondLanguagePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestSecondLanguage extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
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

	@Test(priority = 0)
	public void testSecondLanguageDeutsch() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(2000);

		secondLanguagePage.clickEnglish();
		secondLanguagePage.clickDeutsch();
		Thread.sleep(2000);
		takeScreenshot("");
		assertVisibleWithTimer(secondLanguagePage.entdecken, "existEntdecken not display correct");

	}

	@Test(priority = 1)
	public void testSecondLanguageChinese() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(2000);

		secondLanguagePage.clickEnglish();
		secondLanguagePage.clickChinese();
		Thread.sleep(2000);
		takeScreenshot("");
		assertVisibleWithTimer(secondLanguagePage.chineseExplore, "exist ChineseExplore not display correct");

	}

	@Test(priority = 2)
	public void testSecondLanguageDansk() throws Throwable {

		libraryExplorePage.clickTabGuided();
		takeScreenshot("");
		Thread.sleep(2000);

		secondLanguagePage.clickEnglish();
		secondLanguagePage.clickDansk();
		Thread.sleep(2000);
		takeScreenshot("");
		assertVisibleWithTimer(secondLanguagePage.deutsch, "exist DanskExplore not display correct");

	}

}
