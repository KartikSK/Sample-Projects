package moolya.hungama.pages;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import moolya.hungama.utils.JavaUtils;

public class MusicPage extends M_BasePage {

	public MusicPage(AppiumDriver<MobileElement> mdriver) {
		super(mdriver);
		PageFactory.initElements(new AppiumFieldDecorator(mdriver), this);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(name="DOWNLOAD")
	private MobileElement downloadAll_Btn;
	
	@AndroidFindBy(name="Navigate up")
	private MobileElement goBack;
	
	@AndroidFindBy(name="Videos")
	private MobileElement videos_Tab;
	
	public void Music_Screen() throws InterruptedException{
		Thread.sleep(2000);
		downloadAll_Btn.click();
		Thread.sleep(2000);
		goBack.click();
		Thread.sleep(2000);
		videos_Tab.click();
		Thread.sleep(2000);
		videos_Tab.click();
	}
	
	
	public void selectAlbum(String uniqueValue) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
//		HashMap<String,String> data = JavaUtils.readExcelData("", uniqueValue);data.get("Album Name")
		scrollToTextByScrollableInstance(uniqueValue);
		mdriver.findElementByName(uniqueValue).click();
	}
	
	public void checkForAdPresent() throws InterruptedException{
		Thread.sleep(10000);
		MobileElement e = mdriver.findElementByXPath("//android.webkit.WebView");
		Assert.assertTrue(e.isDisplayed(), "Ad is not Present!");
		Reporter.log("Ad is present.", true);
	}
	
	public void downloadAll(){
		waitUntilElementclickable(downloadAll_Btn);
		downloadAll_Btn.click();
		Reporter.log("Clicked on Download All Button", true);
	}
	
	

}
