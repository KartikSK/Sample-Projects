package moolya.hungama.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends M_BasePage {

	public HomePage(AppiumDriver<MobileElement> mdriver) {
		super(mdriver);
		PageFactory.initElements(new AppiumFieldDecorator(mdriver), this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(name="Interstitial close button")
	private MobileElement closeAd_Btn;
	
	@AndroidFindBy(name="Music")
	private MobileElement music_Tab;
	
	@AndroidFindBy(name="Videos")
	private MobileElement videos_Tab;
	
	@AndroidFindBy(name="Open navigation drawer")
	private MobileElement navDrawer;
	
	@AndroidFindBy(name="My Downloads")
	private MobileElement myDownloads_Btn;
	
	@AndroidFindBy(name="OK")
	private MobileElement noDownloadsOK_Btn;
	
	@AndroidFindBy(name="Search")
	private MobileElement search_Btn;
	
	@AndroidFindBy(name="Search Music")
	private MobileElement search_TB;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[@index='1']")
	private MobileElement settings_Btn;
	
	public MusicPage selectMusicTab(){
		waitUntilElementclickable(music_Tab);
		music_Tab.click();
		Reporter.log("Navigate to Music Tab", true);
		return new MusicPage(mdriver);
	}
	
	public VideosPage selectVideosTab(){
		waitUntilElementclickable(videos_Tab);
		videos_Tab.click();
		Reporter.log("Navigated to Videos Tab", true);
		return new VideosPage(mdriver);
	}
	
	public MusicPage searchMusic(String musicName) throws InterruptedException{
		
		waitUntilElementclickable(search_Btn);
		search_Btn.click();
		search_TB.sendKeys(musicName);
		((AndroidDriver<MobileElement>)mdriver).pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(3000);
		/*WebElement ele=mdriver.findElementByName(musicName);
		ele.click();
		List<MobileElement> searchlist = mdriver.findElementsByName(musicName);
		Thread.sleep(5000);
		
		((RemoteWebElement) searchlist).click();*/
		clickElementByText(musicName);
		Thread.sleep(2000);
		//nextStep();
		/*nextStep() ;
		checkForAdPresent();
		downloadAll();*/
		return new MusicPage(mdriver);
		
		/*waitUntilElementclickable(search_Btn);
		search_Btn.click();
		search_TB.sendKeys();
//		((AndroidDriver<MobileElement>)mdriver).pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(3000);
		List<MobileElement> searchlist = mdriver.findElementsByName(musicName);
		searchlist.get(1).click();
		clickElementByText(musicName);
		return new MusicPage(mdriver);*/
	}
	
	public VideosPage searchVideo(String videoName){
		waitUntilElementclickable(search_Btn);
		search_Btn.click();
		search_TB.sendKeys(videoName);
		List<MobileElement> searchlist = mdriver.findElementsByName(videoName);
		searchlist.get(searchlist.size()-1).click();
		mdriver.findElementByName(videoName).click();
		return new VideosPage(mdriver);
	}
	
	public HomePage openNavDrawer(){
		waitUntilElementclickable(navDrawer);
		navDrawer.click();
		Reporter.log("Clicked on Navigation Drawer", true);
		return this;
	}
	
	public HomePage clickOK(){
		
		try {
			Thread.sleep(5000);
			noDownloadsOK_Btn.click();
		} catch (Exception e) {}
		return this;
	}
	
	public DownloadsPage selectMyDownloads(){
		waitUntilElementclickable(myDownloads_Btn);
		myDownloads_Btn.click();
		Reporter.log("Clicked on My Downloads", true);
		return new DownloadsPage(mdriver);
	}
	
	public SettingsPage clickOnSettings(){
		waitUntilElementclickable(settings_Btn);
		settings_Btn.click();
		Reporter.log("Clicked on Settings", true);
		return new SettingsPage(mdriver);
	}

}
