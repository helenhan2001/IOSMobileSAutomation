package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DiscoveryInterestGroupsPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public DiscoveryInterestGroupsPage(AppiumDriver driver) {
		super(driver);

	}

	// Mindfulness
	@iOSFindBy(accessibility = "Mindfulness refers to meditation practices or exercises that simply notice feelings and thoughts as they come and go, without judgement.")
	public MobileElement mindfulnessText;

	@iOSFindBy(accessibility = "Popular")
	public MobileElement popular;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public MobileElement backButton;

	@iOSFindBy(accessibility = "Analytic Meditation")
	public MobileElement analyticMeditation;
	@iOSFindBy(accessibility = "FOLLOWING")
	public MobileElement following;
	@iOSFindBy(accessibility = "FOLLOW")
	public MobileElement follow;
	// sleep
	@iOSFindBy(accessibility = "Sleep Quality")
	public MobileElement sleepQuality;

	@iOSFindBy(accessibility = "Sleep Now")
	public MobileElement sleepNow;

	@iOSFindBy(accessibility = "List all")
	public MobileElement listAll;

	@iOSFindBy(accessibility = "Guided Meditations")
	public MobileElement guidedMeditations;

	@iOSFindBy(accessibility = "See all")
	public MobileElement seeAll;

	// mindfulness
	@iOSFindBy(accessibility = "Awareness Meditation")
	public MobileElement awarenessMeditation;

	@iOSFindBy(accessibility = "Ch'an Meditation")
	public MobileElement chanMeditation;

	@iOSFindBy(accessibility = "Insight Meditation")
	public MobileElement insightMeditation;

	@iOSFindBy(accessibility = "Mahamudra")
	public MobileElement mahamudra;

	@iOSFindBy(accessibility = "Mindful Eating")
	public MobileElement mindfulEating;
	@iOSFindBy(accessibility = "Mindfulness Meditation")
	public MobileElement mindfulnessMeditation;

	@iOSFindBy(accessibility = "MBCT")
	public MobileElement mbct;

	@iOSFindBy(accessibility = "MBRP")
	public MobileElement mbrp;

	@iOSFindBy(accessibility = "MBSR – Mindfulness")
	public MobileElement mbsrMindfulness;
	@iOSFindBy(accessibility = "Samatha")
	public MobileElement samatha;
	@iOSFindBy(accessibility = "Six Element Meditation")
	public MobileElement sixElementMeditation;
	@iOSFindBy(accessibility = "Somatic Meditation")
	public MobileElement somaticMeditation;
	@iOSFindBy(accessibility = "Thai Forest Meditation")
	public MobileElement thaiForestMeditation;
	@iOSFindBy(accessibility = "Vipassana")
	public MobileElement vipassana;
	@iOSFindBy(accessibility = "Zen - Zazen")
	public MobileElement zenZazen;

	public boolean existPopular() {
		return popular.isEnabled();
	}

	// Sleep
	public boolean existSleepNow() {
		return sleepNow.isEnabled();
	}

	public boolean existSleepQuality() {
		return sleepQuality.isEnabled();
	}

	public void clickSleepNow() {
		sleepNow.click();
	}

	public void clickSleepQuality() {
		sleepQuality.click();
	}

	public void clickListAll() {
		listAll.click();
	}

	public boolean existListAll() {
		return listAll.isDisplayed();
	}

	public boolean existSeeAll() {
		return seeAll.isDisplayed();
	}

	public void clickSeeAll() {
		seeAll.click();
	}

	public boolean existGuidedMeditations() {
		return guidedMeditations.isDisplayed();
	}

	public void clickGuidedMeditations() {
		guidedMeditations.click();
	}

	// Mindfulness
	public boolean existAnalyticMeditation() {
		return analyticMeditation.isEnabled();
	}

	public boolean existMindfulnessText() {
		return mindfulnessText.isEnabled();
	}

	public void clickAnalyticMeditation() {
		analyticMeditation.click();
	}

	public void clickFollowing() {
		following.click();
	}

	public void clickFollow() {
		follow.click();
	}

	public void clickBackButton() {
		backButton.click();
	}

	public boolean existAwarenessMeditation() {
		return awarenessMeditation.isEnabled();
	}

	public void clickAwarenessMeditation() {
		awarenessMeditation.click();
	}

	public boolean existChanMeditation() {
		return chanMeditation.isEnabled();
	}

	public void clickChanMeditation() {
		chanMeditation.click();
	}

	public boolean existInsightMeditation() {
		return insightMeditation.isEnabled();
	}

	public void clickInsightMeditation() {
		insightMeditation.click();
	}

	public boolean existMahamudra() {
		return mahamudra.isEnabled();
	}

	public void clickMahamudra() {
		mahamudra.click();
	}

	public boolean existMindfulEating() {
		return mindfulEating.isEnabled();
	}

	public void clickMindfulEating() {
		mindfulEating.click();
	}

	public boolean existMindfulnessMeditation() {
		return mindfulnessMeditation.isEnabled();
	}

	public void clickMindfulnessMeditation() {
		mindfulnessMeditation.click();
	}

	public boolean existMBCT() {
		return mbct.isEnabled();
	}

	public void clickMBCT() {
		mbct.click();
	}

	public boolean existMBRP() {
		return mbrp.isEnabled();
	}

	public void clickMBRP() {
		mbrp.click();
	}

	public boolean existMbsrMindfulness() {
		return mbsrMindfulness.isEnabled();
	}

	public void clickMbsrMindfulness() {
		mbsrMindfulness.click();
	}

	public boolean existSamatha() {
		return samatha.isEnabled();
	}

	public void clickSamatha() {
		samatha.click();
	}

	public boolean existSixElementMeditation() {
		return sixElementMeditation.isEnabled();
	}

	public void clickSixElementMeditation() {
		sixElementMeditation.click();
	}

	public boolean existSomaticMeditation() {
		return somaticMeditation.isEnabled();
	}

	public void clickSomaticMeditation() {
		somaticMeditation.click();
	}

	public boolean existThaiForestMeditation() {
		return thaiForestMeditation.isEnabled();
	}

	public void clickThaiForestMeditation() {
		thaiForestMeditation.click();
	}

	public boolean existVipassana() {
		return vipassana.isEnabled();
	}

	public void clickVipassana() {
		vipassana.click();
	}

	public boolean existZenZazen() {
		return zenZazen.isEnabled();
	}

	public void clickZenZazen() {
		zenZazen.click();
	}

	// public void clickResetAll() {
	//
	// resetAll.click();
	// }

	//
	// //
	// // public boolean isMusicExist() {
	// // return elementExists(music);
	// // }
	// //
	// // public boolean isOriginsTextExist() {
	// // return elementExists(originsText);
	// // }
	// //
	// // public boolean isSciencesExist() {
	// // return elementExists(sciences);
	// // }
	// //
	// // public boolean isPlayFollowExist() {
	// // return elementExists(playFollow);
	// // }
	//
	// public boolean elementExists(MobileElement element) {
	// try {
	// return element.isEnabled();
	//
	// } catch (Exception e) {
	// return false;
	// }
	// }

}
