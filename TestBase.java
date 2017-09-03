
package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * An abstract base for all of the Android tests within this package
 *
 * Responsible for setting up the Appium test Driver
 */
public abstract class TestBase {
	Dimension size;
	String destDir;
	DateFormat dateFormat;
	IOSElement elmentA = null;
	IOSElement elmentB = null;
	int startX = 0, startY = 0, endX = 0, endY = 0;
	int duration = 0, time = 0;

	/**
	 * Make the driver static. This allows it to be created only once and used
	 * across all of the test classes.
	 * 
	 * 
	 * 
	 */

	public static IOSDriver<IOSElement> driver;

	/**
	 * This allows the navigation to work within the app. The category name is
	 * returned so we can navigate to it from the navigation drawer.
	 *
	 * @return The name of the Android category
	 */
	// public abstract String getName();

	/**
	 * A page containing the navigation drawer
	 */
	// private NavigationPage navigationPage;

	/**
	 * Method to initialize the test's page
	 * 
	 * @throws Throwable
	 */
	@BeforeTest
	public abstract void setUpPage() throws Throwable;

	/**
	 * This method runs before any other method.
	 *
	 * Appium follows a client - server model: We are setting up our appium
	 * client in order to connect to Device Farm's appium server.
	 *
	 * We do not need to and SHOULD NOT set our own DesiredCapabilities Device
	 * Farm creates custom settings at the server level. Setting your own
	 * DesiredCapabilities will result in unexpected results and failures.
	 *
	 * @throws MalformedURLException
	 *             An exception that occurs when the URL is wrong
	 */
	@BeforeSuite

	public void setUpAppium() throws MalformedURLException, InterruptedException {

		boolean isLocal = true;

		if (isLocal) {
			File f = new File("src/test/java");
			File fs = new File(f, "zentimer9.app");
			DesiredCapabilities cap = new DesiredCapabilities();
		 
			 
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			// iPad 9
//			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad 9");
//			cap.setCapability(MobileCapabilityType.UDID, "ee5fb5a933f15d6534069a81f68d2008df6fe8a7");
//			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3.2");
			
			// iPHone 10.3.2
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
			 cap.setCapability(MobileCapabilityType.UDID ,"f38389355f12edefc7cebbeb87c658392f7518f7");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3.2");

			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
			cap.setCapability("autoAcceptAlerts", true);
			cap.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
			cap.setCapability(MobileCapabilityType.NO_RESET, false);

			cap.setCapability(MobileCapabilityType.FULL_RESET, false);

			// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,
			// "120");

			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			cap.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);

			driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else {

			final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

			URL url = new URL(URL_STRING);

			// Use a empty DesiredCapabilities object
			DesiredCapabilities capabilities = new DesiredCapabilities();

			driver = new IOSDriver<IOSElement>(url, capabilities);

			// Use a higher value if your mobile elements take time to show up
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		}

	}

	/**
	 * Always remember to quit
	 */
	@AfterSuite
	public void tearDownAppium() {
		driver.quit();
	}

	/**
	 *
	 * Creates a navigation page and navigates to the Class' category within the
	 * navigation drawer
	 *
	 */
	@BeforeClass
	public void navigateTo() throws InterruptedException {

		// login();

	}

	/**
	 * Restart the app after every test class to go back to the main screen and
	 * to reset the behavior
	 */
	@AfterClass
	public void restartApp() {
		takeScreenshot("After");
		driver.closeApp();
		driver.launchApp();

	}

	public void swipeToUp(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	}

	public void swipeToDown(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);

		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	}

	public void swipeToLeft(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);

		// bigger driver.swipe(width -10, height / 2, width / 4, height / 2,
		// during);

	}

	public void swipeToRight(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
		// bigger driver.swipe(10, height / 2, width* 3/4+10, height / 2,
		// during);
	}

	public void SwipeAToBTwo(MobileElement elmentA, MobileElement elmentB, int duration, int time) {
		startX = elmentA.getLocation().x + elmentA.getSize().width / 2;
		startY = elmentA.getLocation().y + elmentA.getSize().height / 2;
		endX = elmentB.getLocation().x + elmentB.getSize().width / 2;
		endY = elmentB.getLocation().y + elmentB.getSize().height / 2;

		for (int i = 0; i < time; i++) {
			driver.swipe(startX, startY, endX, endY, duration);
		}

	}

	// public void SwipeAToB(MobileElement elmentA, MobileElement elmentB, int
	// duration, int time) {
	// TouchAction action = new TouchAction(driver);
	// action.longPress(elmentA).waitAction().moveTo(elmentB).perform().release();
	//
	// }

	public static void scroll(String direction) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", direction);
		js.executeScript("mobile: scroll", scrollObject);

	}

	public static void scrollToElement(MobileElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);
	}

	public boolean isAlertPresent() {
		boolean foundAlert = false;
		WebDriverWait wait = new WebDriverWait(driver, 3/* timeout in seconds */);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (TimeoutException eTO) {
			foundAlert = false;
		}
		return foundAlert;
	}

	public void acceptAlertIfExists() throws InterruptedException {
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
			Thread.sleep(100);
		}
	}

	public boolean isTCAgreePresent() {
		boolean foundTCAgree = false;
		WebDriverWait wait = new WebDriverWait(driver, 3/* timeout in seconds */);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Agree")));
			foundTCAgree = true;
		} catch (TimeoutException eTO) {
			foundTCAgree = false;
		}
		return foundTCAgree;
	}

	public void acceptTCAgreeIfExists() throws InterruptedException {
		if (isTCAgreePresent()) {
			driver.findElementById("Agree").click();
			Thread.sleep(100);
		}
	}

	public void takeScreenshot(String fileName) {
		// Set folder name to store screenshots.
		String destDir = "screenshots";
		// Capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Set date format to set It as screenshot file name.
		dateFormat = new SimpleDateFormat("dd_hh_mm_ss");
		// Create folder under project with name "screenshots" provided to
		// destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = dateFormat.format(new Date()) + fileName + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void assertVisibleWithTimer(MobileElement element, String message) {
		WebDriverWait wait = new WebDriverWait(driver,
				30/* timeout in seconds */);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException ex) {
			Assert.fail(message);
		}
	}
	// From AWS it is works well local
	// public void scrollToElement() {
	// waitForElementToLoad(element1,5);
	// int x = element.getLocation().getX();
	// int y = element.getLocation().getY();
	//
	// int x1 = element2.getLocation().getX();
	// int y1 = element2.getLocation().getY();
	//
	// TouchAction touchAction = new TouchAction(driver);
	// touchAction.press(x, y).moveTo(x1, -y1).release().perform();
	// }

}
