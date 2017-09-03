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

public class LibraryExplorePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public LibraryExplorePage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "tab_guided")
	public MobileElement tabGuided;

	@iOSFindBy(accessibility = "Search for meditations, interests or teachers")
	public MobileElement searchBtn;

	@iOSFindBy(accessibility = "Explore")
	public MobileElement explore;

	@iOSFindBy(accessibility = "English")
	public MobileElement english;

	@iOSFindBy(accessibility = "Deutsch")
	public MobileElement deutsch;
	@iOSFindBy(accessibility = "Entdecken")
	public MobileElement entdecken;

	@iOSFindBy(accessibility = "Agree")
	public MobileElement agree;

	@iOSFindBy(accessibility = "My Library")
	public MobileElement myLibrary;

	@iOSFindBy(accessibility = "My Bookmarks")
	public MobileElement myBookmarks;

	@iOSFindBy(accessibility = "11")
	public MobileElement myBookmarksNumber;

	@iOSFindBy(accessibility = "My Teachers")
	public MobileElement myTeachers;

	@iOSFindBy(accessibility = "14")
	public MobileElement myTeachersNumber;

	@iOSFindBy(accessibility = "My Interests")
	public MobileElement myIntersets;
	@iOSFindBy(accessibility = "2")
	public MobileElement myIntersetsNumber;

	@iOSFindBy(accessibility = "Nothing found...")
	public MobileElement nothingFound;

	// New today

	@iOSFindBy(accessibility = "New today")
	public MobileElement newToday;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement newTodayImageOne;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public MobileElement newTodayImageTwo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	public MobileElement newTodayImageThree;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]")
	public MobileElement newTodayImageFour;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]")
	public MobileElement newTodayImageFive;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")

	public MobileElement newTodayBackButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")

	public MobileElement forBeginnersOne;

	@iOSFindBy(accessibility = "FOLLOW")
	public MobileElement follow;
	@iOSFindBy(accessibility = "Follow")
	public MobileElement followLowCase;
	@iOSFindBy(accessibility = "FOLLOWING")
	public MobileElement following;

	@iOSFindBy(accessibility = "More by")
	public MobileElement moreBy;
	@iOSFindBy(accessibility = "RELAX")
	public MobileElement relax;

	@iOSFindBy(accessibility = "List all")
	public MobileElement listAll;

	//

	@iOSFindBy(accessibility = "Popular Interests")
	public MobileElement popular;

	@iOSFindBy(accessibility = "Meditation can be useful for sleeping better, reducing stress, and calming a busy mind.")
	public MobileElement helpMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public MobileElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement helpImageOne;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]")
	public MobileElement helpImageFive;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public MobileElement helpImageTwo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	public MobileElement helpImageThree;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]")
	public MobileElement helpImageFour;

	@iOSFindBy(accessibility = "YOGA NIDRA")
	public MobileElement yogaNidra;
	@iOSFindBy(accessibility = "SLEEP DEEPLY NOW")
	public MobileElement sleepDeeplyNow;
	@iOSFindBy(accessibility = "YOGA")
	public MobileElement yoga;
	@iOSFindBy(accessibility = "Relationships")
	public MobileElement relaxation;
	@iOSFindBy(accessibility = "SECULAR MINDFULNESS")
	public MobileElement secularMindfulness;
	@iOSFindBy(accessibility = "AFFIRMATION MEDITATION")
	public MobileElement afirmationMeditation;

	@iOSFindBy(accessibility = "Get help with ...")
	public MobileElement getHelpWith;

	@iOSFindBy(accessibility = "Creativity & Performance")
	public MobileElement creativityPerformance;
	@iOSFindBy(accessibility = "Grounded & Happy")
	public MobileElement groundedHappy;
	@iOSFindBy(accessibility = "Kids & Teens")
	public MobileElement kidsTeens;
	@iOSFindBy(accessibility = "Recovery & Healing")
	public MobileElement recoveryHealing;
	@iOSFindBy(accessibility = "Sleep")
	public MobileElement sleep;
	@iOSFindBy(accessibility = "More in Sleep")
	public MobileElement moreInSleep;
	@iOSFindBy(accessibility = "Relationships")
	public MobileElement relationships;
	@iOSFindBy(accessibility = "Spiritual")
	public MobileElement spiritual;
	@iOSFindBy(accessibility = "Stress & Anxiety")
	public MobileElement stressAnxiety;

	// Practices
	@iOSFindBy(accessibility = "Practices")
	public MobileElement practices;
	@iOSFindBy(accessibility = "There are hundreds of different meditation practices. Listen to some different techniques to find the ones that best suit you.")
	public MobileElement practicesText;
	@iOSFindBy(accessibility = "Concentration")
	public MobileElement concentration;
	@iOSFindBy(accessibility = "Focusing on something physical and material, such as your breath or body, to distract the mind from thought.")
	public MobileElement concentrationText;
	@iOSFindBy(accessibility = "Gentle Repetition")
	public MobileElement GentleRepetition;
	@iOSFindBy(accessibility = "Repeating a sound or sequence of words to clear the mind and go beyond thought.")
	public MobileElement GentleRepetitionText;
	@iOSFindBy(accessibility = "Mindfulness")
	public MobileElement mindfulness;
	@iOSFindBy(accessibility = "Simply noticing feelings and thoughts as they come and go.")
	public MobileElement MindfulnessText;
	@iOSFindBy(accessibility = "Movement")
	public MobileElement Movement;
	@iOSFindBy(accessibility = "Energize the body and mind through calm purposeful breathing or movement.")
	public MobileElement MovementText;
	@iOSFindBy(accessibility = "Self-Observation")
	public MobileElement SelfObservation;
	@iOSFindBy(accessibility = "Through reflective questions peel back the layers hiding your essential nature.")
	public MobileElement SelfObservationText;
	@iOSFindBy(accessibility = "Sound")
	public MobileElement Sound;
	@iOSFindBy(accessibility = "Using sound currents and frequencies to calm brainwaves and alter our mindset.")
	public MobileElement SoundText;
	@iOSFindBy(accessibility = "Visualization")
	public MobileElement Visualization;
	@iOSFindBy(accessibility = "Imaging a specific experience or cultivating feelings such as gratitude and forgiveness.")
	public MobileElement VisualizationText;

	@iOSFindBy(xpath = "//*[@value='Email']")
	public MobileElement email;

	@iOSFindBy(xpath = "//*[@value='Password']")
	public MobileElement password;

	@iOSFindBy(accessibility = "LOGIN")
	public MobileElement homeLogin;

	// Library Music
	@iOSFindBy(accessibility = "See all")
	public MobileElement seeAll;
	@iOSFindBy(accessibility = "Music")
	public MobileElement music;
	@iOSFindBy(accessibility = "Sound is a soothing way to relax the mind and body. Close your eyes and drift away.")
	public MobileElement musicText;

	@iOSFindBy(accessibility = "Ambient Music")
	public MobileElement ambientMusic;

	@iOSFindBy(accessibility = "Binaural Beats")
	public MobileElement binauralBeats;

	@iOSFindBy(accessibility = "Chanting & Mantras")
	public MobileElement chantingMantras;

	@iOSFindBy(accessibility = "Classical Music")
	public MobileElement classicalMusic;

	@iOSFindBy(accessibility = "Drumming")
	public MobileElement drumming;

	@iOSFindBy(accessibility = "Gospel & Choir")
	public MobileElement gospelChoir;

	@iOSFindBy(accessibility = "Harmonics")
	public MobileElement harmonics;

	@iOSFindBy(accessibility = "Instrumental Music")
	public MobileElement instrumentalMusic;

	@iOSFindBy(accessibility = "Nature Sounds")
	public MobileElement natureSounds;

	@iOSFindBy(accessibility = "Rhythmic Music")
	public MobileElement rhythmicMusic;

	@iOSFindBy(accessibility = "Sacred Music")
	public MobileElement sacredMusic;

	@iOSFindBy(accessibility = "Solfeggio Frequencies")
	public MobileElement solfeggioFrequencies;

	@iOSFindBy(accessibility = "Sound Healing")
	public MobileElement soundHealing;

	// Library Origins
	// @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	// @HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	// // @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Origins'")
	// // @iOSXCUITFindBy(className = "XCUIElementTypeStaticText")
	// @iOSXCUITFindBy(iOSNsPredicate = "name ='Origins'")
	@iOSFindBy(accessibility = "Origins")
	public MobileElement origins;

	@iOSFindBy(accessibility = "From the religious and spiritual to the secular and scientific, we are united by our diversity.")
	public MobileElement originsText;

	@iOSFindBy(accessibility = "Sciences")
	public MobileElement sciences;

	@iOSFindBy(accessibility = "Concepts")
	public MobileElement concepts;
	@iOSFindBy(accessibility = "Traditions")
	public MobileElement traditions;
	@iOSFindBy(accessibility = "Alternative Medicine")
	public MobileElement alternativeMedicine;
	@iOSFindBy(accessibility = "Bahá'í Faith")
	public MobileElement bahFaith;
	@iOSFindBy(accessibility = "Bhakti Movement")
	public MobileElement bhaktiMovement;
	@iOSFindBy(accessibility = "Buddhism")
	public MobileElement buddhism;
	@iOSFindBy(accessibility = "Christianity")
	public MobileElement christianity;
	@iOSFindBy(accessibility = "Confucianism")
	public MobileElement confucianism;
	@iOSFindBy(accessibility = "Consciousness")
	public MobileElement consciousness;
	@iOSFindBy(accessibility = "Energy-based")
	public MobileElement energybased;
	@iOSFindBy(accessibility = "Islam")
	public MobileElement islam;
	@iOSFindBy(accessibility = "Hinduism")
	public MobileElement hinduism;
	@iOSFindBy(accessibility = "Jainism")
	public MobileElement jainism;
	@iOSFindBy(accessibility = "Kabbalah")
	public MobileElement kabbalah;
	@iOSFindBy(accessibility = "Metaphysics")
	public MobileElement metaphysics;
	@iOSFindBy(accessibility = "Mysticism")
	public MobileElement mysticism;
	@iOSFindBy(accessibility = "Natural Environment")
	public MobileElement naturalEnvironment;
	@iOSFindBy(accessibility = "Neuroscience")
	public MobileElement neuroscience;
	@iOSFindBy(accessibility = "Non-duality")
	public MobileElement nonduality;
	@iOSFindBy(accessibility = "Perennialism")
	public MobileElement perennialism;
	@iOSFindBy(accessibility = "Psychology")
	public MobileElement psychology;
	@iOSFindBy(accessibility = "Science & Medicine")
	public MobileElement scienceMedicine;
	// @iOSFindBy(accessibility = "Secular Mindfulness") exist in Popular
	// public MobileElement secularMindfulness;
	@iOSFindBy(accessibility = "Shamanism")
	public MobileElement shamanism;
	@iOSFindBy(accessibility = "Shinto")
	public MobileElement shinto;
	@iOSFindBy(accessibility = "Sikhism")
	public MobileElement sikhism;
	@iOSFindBy(accessibility = "Spirituality")
	public MobileElement spirituality;

	@iOSFindBy(accessibility = "Sport Science")
	public MobileElement sportScience;

	@iOSFindBy(accessibility = "Sufism")
	public MobileElement sufism;
	@iOSFindBy(accessibility = "Taoism")
	public MobileElement taoism;
	@iOSFindBy(accessibility = "vedic")
	public MobileElement vedic;
	@iOSFindBy(accessibility = "Yogic Tradition")
	public MobileElement yogicTradition;

	// Library Teachers

	@iOSFindBy(accessibility = "Teachers")
	public MobileElement teachers;
	@iOSFindBy(accessibility = "See all")
	public MobileElement seeAllTeacher;

	@iOSFindBy(accessibility = "Teachers and musicians are the heart and soul of our community. Each one is unique.")
	public MobileElement teacherText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[18]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement teacherImage;

	// Library Talks
	@iOSFindBy(accessibility = "Talks")
	public MobileElement talk;

	@iOSFindBy(accessibility = "Listen to hundreds of talks, interviews, and ideas covering a range of topics and concepts.")
	public MobileElement talkText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[19]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement talkImage;

	public void sendkeySearchBtn(String string) {

		searchBtn.sendKeys(string);
	}

	public void clickTabGuided() {

		tabGuided.click();
	}

	public void clickMyLibrary() {

		myLibrary.click();
	}

	public void clickBackButton() {

		backButton.click();
	}

	public boolean existMyLibrary() {
		if (myLibrary.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickForBeginnersOne() {

		forBeginnersOne.click();
	}

	public void clickFollow() {

		follow.click();
	}

	public void clickFollowLowCase() {

		followLowCase.click();
	}

	public void clickFollowing() {

		following.click();
	}

	public boolean existNewToday() {
		return newToday.isEnabled();

	}

	public void clickNewTodayImageOne() {

		newTodayImageOne.click();
	}

	public void clickNewTodayImageTwo() {

		newTodayImageTwo.click();
	}

	public void clickNewTodayImageThree() {

		newTodayImageThree.click();
	}

	public void clickNewTodayImageFour() {

		newTodayImageFour.click();
	}

	public void clickNewTodayImageFive() {

		newTodayImageFive.click();
	}

	public void clickHelpImageOne() {

		helpImageOne.click();
	}

	public void clickHelpImageTwo() {

		helpImageTwo.click();
	}

	public void clickHelpImageThree() {

		helpImageThree.click();
	}

	public void clickHelpImageFour() {

		helpImageFour.click();
	}

	public void clickHelpImageFive() {
		helpImageFive.click();
	}

	public void email() {
		email.sendKeys("han.helen8@gmail.com");
	}

	public void password() {
		password.sendKeys("Passw0rd");
	}

	public void login() {
		homeLogin.click();
	}

	public boolean verifyExplore() {
		return explore.isEnabled();
	}

	public boolean existListAll() {
		return listAll.isEnabled();
	}

	public boolean verifyEnglish() {
		if (english.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean existPopular() {
		return popular.isDisplayed();
	}

	public boolean existYogaNidra() {
		return yogaNidra.isEnabled();
	}

	public boolean existSleepDeeplyNow() {
		return sleepDeeplyNow.isEnabled();
	}

	public boolean existMoreInSleep() {
		return moreInSleep.isEnabled();
	}

	public boolean existYoga() {
		return yoga.isEnabled();
	}

	public boolean existRelaxation() {
		return relaxation.isEnabled();
	}

	public boolean existHelpWithMsg() {
		return helpMsg.isEnabled();
	}

	public boolean existSecularMindfulness() {
		return secularMindfulness.isEnabled();
	}

	public boolean existAfirmationMeditation() {
		return afirmationMeditation.isEnabled();
	}

	public boolean existGetHelpWith() {
		return getHelpWith.isEnabled();
	}

	public boolean existCreativityPerformance() {
		return creativityPerformance.isEnabled();
	}

	public void clickCreativityPerformance() {
		creativityPerformance.click();
	}

	public boolean existGroundedHappy() {
		return groundedHappy.isEnabled();
	}

	public void clickGroundedHappy() {
		groundedHappy.click();
	}

	public boolean existkidsTeens() {
		return kidsTeens.isEnabled();
	}

	public void clickKidsTeens() {
		kidsTeens.click();
	}

	public boolean existRecoveryHealing() {
		return recoveryHealing.isEnabled();
	}

	public void clickRecoveryHealing() {
		recoveryHealing.click();
	}

	public boolean existSleep() {
		return sleep.isEnabled();
	}

	public void clickSleep() {
		sleep.click();
	}

	public boolean existSpiritual() {
		return spiritual.isEnabled();
	}

	public void clickSpiritual() {
		spiritual.click();
	}

	public boolean existStressAnxiety() {
		return stressAnxiety.isEnabled();
	}

	public void clickStressAnxiety() {
		stressAnxiety.click();
	}

	// Practices

	public boolean existPractices() {
		return practices.isEnabled();
	}

	public boolean existPracticesText() {
		return practicesText.isEnabled();
	}

	public boolean existConcentration() {
		return concentration.isEnabled();
	}

	public void clickConcentration() {
		concentration.click();
	}

	public boolean existConcentrationText() {
		return concentrationText.isEnabled();
	}

	public boolean existGentleRepetition() {
		return GentleRepetition.isEnabled();
	}

	public void clickGentleRepetition() {
		GentleRepetition.click();
	}

	public boolean existGentleRepetitionText() {
		return GentleRepetitionText.isEnabled();
	}

	public boolean existMindfulness() {
		return mindfulness.isEnabled();
	}

	public void clickMindfulness() {
		mindfulness.click();
	}

	public boolean existMindfulnessText() {
		return MindfulnessText.isEnabled();
	}

	public boolean existMovement() {
		return Movement.isEnabled();
	}

	public void clickMovement() {
		Movement.click();
	}

	public boolean existMovementText() {
		return MovementText.isEnabled();
	}

	public boolean existSelfObservation() {
		return SelfObservation.isEnabled();
	}

	public void clickSelfObservation() {
		SelfObservation.click();
	}

	public boolean existSelfObservationText() {
		return SelfObservationText.isEnabled();
	}

	public boolean existSound() {
		return Sound.isEnabled();
	}

	public void clickSound() {
		Sound.click();
	}

	public void clickRelax() {

		relax.click();
	}

	public boolean existSoundText() {
		return SoundText.isEnabled();
	}

	public boolean existVisualization() {
		return Visualization.isEnabled();
	}

	public void clickVisualization() {
		Visualization.click();
	}

	public boolean existVisualizationText() {
		return VisualizationText.isEnabled();
	}

	// Library Music

	public boolean existMusic() {
		return music.isDisplayed();
	}

	public boolean existMusicText() {
		return musicText.isDisplayed();
	}

	public boolean existSeeAll() {
		return seeAll.isDisplayed();
	}

	public boolean existAmbientMusic() {
		return ambientMusic.isEnabled();
	}

	public boolean existBinauralBeats() {
		return binauralBeats.isEnabled();
	}

	public boolean existChantingMantras() {
		return chantingMantras.isEnabled();
	}

	public boolean existClassicalMusic() {
		return classicalMusic.isEnabled();
	}

	public boolean existDrumming() {
		return drumming.isEnabled();
	}

	public boolean existGospelChoir() {
		return gospelChoir.isEnabled();
	}

	public boolean existHarmonics() {
		return harmonics.isEnabled();
	}

	public boolean existInstrumentalMusic() {
		return instrumentalMusic.isEnabled();
	}

	public boolean existNatureSounds() {
		return natureSounds.isEnabled();
	}

	public boolean existRhythmicMusic() {
		return rhythmicMusic.isEnabled();
	}

	public boolean existSacredMusic() {
		return sacredMusic.isEnabled();
	}

	public boolean existSolfeggioFrequencies() {
		return solfeggioFrequencies.isEnabled();
	}

	public boolean existSoundHealing() {
		return soundHealing.isEnabled();
	}

	//

	// Library Origins
	public boolean existOrigins() {
		return origins.isEnabled();
	}

	public boolean existoOriginsText() {
		return originsText.isEnabled();
	}

	public boolean existSciences() {
		return sciences.isEnabled();
	}

	public boolean existConcepts() {
		return concepts.isEnabled();
	}

	public boolean existTraditions() {
		return traditions.isEnabled();
	}

	public boolean existAlternativeMedicine() {
		return alternativeMedicine.isEnabled();
	}

	public boolean existBahFaith() {
		return bahFaith.isEnabled();
	}

	public boolean existBhaktiMovement() {
		return bhaktiMovement.isEnabled();
	}

	public boolean existBuddhism() {
		return buddhism.isEnabled();
	}

	public boolean existChristianity() {
		return christianity.isEnabled();
	}

	public boolean existConfucianism() {
		return confucianism.isEnabled();
	}

	public boolean existConsciousness() {
		return consciousness.isEnabled();
	}

	public boolean existEnergybased() {
		return energybased.isEnabled();
	}

	public boolean existIslam() {
		return islam.isEnabled();
	}

	public boolean existHinduism() {
		return hinduism.isEnabled();
	}

	public boolean existJainism() {
		return jainism.isEnabled();
	}

	public boolean existKbbalah() {
		return kabbalah.isEnabled();
	}

	public boolean existMetaphysics() {
		return metaphysics.isEnabled();
	}

	public boolean existMysticism() {
		return mysticism.isEnabled();
	}

	public boolean existNaturalEnvironment() {
		return naturalEnvironment.isEnabled();
	}

	public boolean existNeuroscience() {
		return neuroscience.isEnabled();
	}

	public boolean existNonduality() {
		return nonduality.isEnabled();
	}

	public boolean existPerennialism() {
		return perennialism.isEnabled();
	}

	public boolean existPsychology() {
		return psychology.isEnabled();
	}

	public boolean existScienceMedicine() {
		return scienceMedicine.isEnabled();
	}

	public boolean existShamanism() {
		return shamanism.isEnabled();
	}

	public boolean existShinto() {
		return shinto.isEnabled();
	}

	public boolean existSikhism() {
		return sikhism.isEnabled();
	}

	public boolean existSpirituality() {
		return spirituality.isEnabled();
	}

	public boolean existSportScience() {
		return sportScience.isEnabled();
	}

	public boolean existSufism() {
		return sufism.isEnabled();
	}

	public boolean existTaoism() {
		return taoism.isEnabled();
	}

	public boolean existVedic() {
		return vedic.isEnabled();
	}

	public boolean existYogicTradition() {
		return yogicTradition.isEnabled();
	}

	// Teacher method
	public boolean existTeachers() {
		return teachers.isEnabled();
	}

	public boolean existSeeAllTeacher() {
		return seeAllTeacher.isEnabled();
	}

	public boolean existTeacherText() {
		return teacherText.isEnabled();
	}

	// Library talks

	public boolean existTalks() {
		return talk.isEnabled();
	}

	public boolean existTalkText() {
		return talkText.isEnabled();
	}

	public boolean existTalkImage() {
		return talkImage.isEnabled();
	}

	//
	public boolean isMusicExist() {
		return elementExists(music);
	}

	public boolean isOriginsTextExist() {
		return elementExists(originsText);
	}

	public boolean isSciencesExist() {
		return elementExists(sciences);
	}

	public boolean isAmbienMusicExist() {
		return elementExists(ambientMusic);
	}

	public boolean existMyBookmarksNumber() {
		return elementExists(myBookmarksNumber);
	}

	public boolean existMyBookmarks() {
		return elementExists(myBookmarks);
	}

	public void clickMyBookmarks() {
		myBookmarks.click();
	}

	public void clickMyTeachers() {
		myTeachers.click();
	}

	public void clickAgree() {
		agree.click();
	}

	public boolean existMyTeachers() {
		return myTeachers.isEnabled();
	}

	public boolean existMyTeachersNumber() {
		return myTeachersNumber.isEnabled();
	}

	public boolean existMyIntersets() {
		return myIntersets.isEnabled();
	}

	public boolean existMyIntersetsNumber() {
		return myIntersetsNumber.isEnabled();
	}

	public void clickMyIntersets() {
		myIntersets.click();
	}

	public boolean existNothingFound() {
		return nothingFound.isEnabled();
	}

	public boolean existMoreBy() {
		return moreBy.isEnabled();
	}

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

}
