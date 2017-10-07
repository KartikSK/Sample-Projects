package Selenium.Automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class M_100MPage extends M_BasePage{

	JavascriptExecutor js = (JavascriptExecutor)driver;
	public M_100MPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
		//Flipkart App
		@FindBy(xpath="//img[@alt='Flipkart-Retail-app-min']")
		private WebElement flipcart;	
		//Functional
		@FindBy(xpath="//img[@alt='Carriers']")
		private WebElement f_Carriers;	
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement f_Network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement f_Location;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement f_Interrupts;
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement f_BrowserC;
		@FindBy(xpath="//img[@alt='Device Fragmentation']")
		private WebElement f_DeviceF;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement f_Installation;
		//Performance
		@FindBy(xpath="//h4[(text()='Performance')]")
		private WebElement performance;
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement f_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement f_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement f_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement f_GarbageCleanup;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement f_BAtteryDrain;	
		//Automation
		@FindBy(xpath="//img[@alt='Automation - Selenium']")
		private WebElement f_Selenium;		
		@FindBy(xpath="//img[@alt='Automation - Moolya Framework']")
		private WebElement f_MoolyaFramework;	
		@FindBy(xpath="//img[@alt='Automation - Appium']")
		private WebElement f_Appium;
			
		//User Experience
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement f_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement f_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement f_AppStoreReview;
		
		//Ola App
		@FindBy(xpath="//img[@alt='Ola']")
		private WebElement ola;
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement O_Guidelines;		
		@FindBy(xpath="//img[@alt='Carriers']")
		private WebElement O_Carriers;	
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement O_Network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement O_Location;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement O_Interrupt;		
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement O_Gesture;
		
		
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement O_NetworkA;		
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement O_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement O_GPUOverdraw;		
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement O_GarbageCleanup;		
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement O_BAtteryDrain;
		
		//User Experience
		@FindBy(xpath="//img[@alt='In App Feedback']")
		private WebElement O_appFeedBack;		
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement O_clicksTesting;		
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement O_appStoreReview;
		
		//Zee App
		@FindBy(xpath="//img[@alt='Zee-1']")
		private WebElement zee;	
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement Z_guidelines;	
		@FindBy(xpath="//img[@alt='Wearables']")
		private WebElement Z_wearables;	
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement Z_bCompatibility;	
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement Z_data;	
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement Z_gesture;	
		
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement Z_userEmotions;	
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement Z_CAnalysis;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement Z_appStoreReview;	
		
		//Practo App
		@FindBy(xpath="//img[@alt='practo']")
		private WebElement practo;	
		
		//Functional
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement P_bCompatibility;
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement P_data;	
		@FindBy(xpath="//img[@alt='Device Fragmentation']")
		private WebElement P_deviceFrag;	
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement P_gesture;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement P_installation;	
			
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement P_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement P_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement P_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement P_GarbageCleanup;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement P_BAtteryDrain;	
		@FindBy(xpath="//img[@alt='Performance - API Load Test']")
		private WebElement P_apiLoadTest;	
		
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement P_userEmotion;	
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement P_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement P_clickTesting;
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement P_appStoreReview;
		
		@FindBy(xpath="//img[@alt='Paytm']")
		private WebElement paytm;	
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement Pa_guidelines;	
		@FindBy(xpath="//img[@alt='Carriers']")
		private WebElement Pa_carriers;	
		@FindBy(xpath="//img[@alt='Wearables']")
		private WebElement Pa_wearables;
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement Pa_data;
		@FindBy(xpath="//img[@alt='Device Fragmentation']")
		private WebElement Pa_deviceFrag;	
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement Pa_gesture;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement Pa_installation;	
		
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement Pa_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement Pa_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement Pa_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement Pa_GarbageCleanup;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement Pa_BAtteryDrain;	
		
		//User Experience
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement Pa_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement Pa_clickTesting;
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement Pa_appStoreReview;
		
		//Flipkart eBook Reader
		@FindBy(xpath="//img[@alt='Flipkart eBook Reader']")
		private WebElement flipkartEBook;		
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement feb_guidelines;
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement feb_Network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement feb_Location;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement feb_Interrupts;
		@FindBy(xpath="//img[@alt='Interoperability']")
		private WebElement feb_Interoperability;
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement feb_BrowserC;
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement feb_gesture;
		
		//Performance
		//@FindBy(xpath="//h4[(text()='Performance')]")
		//private WebElement performance;
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement feb_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement feb_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement feb_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement feb_GarbageCleanup;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement feb_BAtteryDrain;	
		
		//Automation
		@FindBy(xpath="//img[@alt='Automation - Selenium']")
		private WebElement feb_Selenium;	
		@FindBy(xpath="//img[@alt='Automation - Selendroid']")
		private WebElement feb_selendroid;	
		@FindBy(xpath="//img[@alt='Automation - Moolya Framework']")
		private WebElement feb_MoolyaFramework;	
		@FindBy(xpath="//img[@alt='Automation - Appium']")
		private WebElement feb_Appium;
			
		//User Experience
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement feb_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement feb_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement feb_AppStoreReview;
		
		
		//Common Floor
		@FindBy(xpath="//img[@alt='Common floor']")
		private WebElement commonFloor;	
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement cf_Carriers;
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement cf_Network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement cf_Location;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement cf_Interrupts;
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement cf_BrowserC;
		
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement cf_userEmotion;	
		@FindBy(xpath="//img[@alt='Paper prototyping']")
		private WebElement cf_paperPrototype;	
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement cf_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement cf_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement cf_AppStoreReview;
		
		//NBC Universal App
		@FindBy(xpath="//img[@alt='NBC Universal']")
		private WebElement nbc;		
		
		//functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement nbc_guidelines;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement nbc_Interrupts;
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement nbc_BrowserC;
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement nbc_data;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement nbc_installation;
		
		//Automation
		@FindBy(xpath="//img[@alt='Automation - Selenium']")
		private WebElement nbc_Selenium;
		@FindBy(xpath="//img[@alt='Automation - Moolya Framework']")
		private WebElement nbc_MoolyaFramework;	
			
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement nbc_userEmotion;
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement nbc_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement nbc_ClickTestings;	
		
		
		
		@FindBy(xpath="//img[@alt='Ditto']")
		private WebElement dittoTV;		
		
		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement d_guidelines;
		@FindBy(xpath="//img[@alt='Carriers']")
		private WebElement d_Carriers;
		@FindBy(xpath="//img[@alt='Wearables']")
		private WebElement d_wearable;
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement d_Network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement d_Location;
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement d_gesture;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement d_installation;
			
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement d_userEmotion;	
		@FindBy(xpath="//img[@alt='Paper prototyping']")
		private WebElement d_paperPrototype;
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement d_CAnalysis;	
		
		
		@FindBy(xpath="//img[@alt='NDTV News']")
		private WebElement NDTV;

		//Functional
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement nd_guidelines;	
		@FindBy(xpath="//img[@alt='Network']")
		private WebElement nd_network;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement nd_location;
		@FindBy(xpath="//img[@alt='Interrupt']")
		private WebElement nd_interrupt;
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement nd_BrowserC;
		
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement nd_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement nd_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement nd_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Garbage Clean up']")
		private WebElement nd_GarbageCleanup;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement nd_BAtteryDrain;	
		@FindBy(xpath="//img[@alt='Performance - API Load Test']")
		private WebElement nd_apiLoadTest;
			
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement nd_userEmotion;	
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement nd_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement nd_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement nd_AppStoreReview;		
		
		
		@FindBy(xpath="//img[@alt='RII Rabo bank']")
		private WebElement roboBank;
		
			
		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement r_gidelines;	
		@FindBy(xpath="//img[@alt='Location']")
		private WebElement r_Location;
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement r_data;
		@FindBy(xpath="//img[@alt='Device Fragmentation']")
		private WebElement r_DeviceF;
		@FindBy(xpath="//img[@alt='Gesture']")
		private WebElement r_gesture;
		
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement r_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - API Load Test']")
		private WebElement r_apiLoadTest;	
		
		//Automation
		@FindBy(xpath="//img[@alt='Automation - Continuous Integration']")
		private WebElement r_cIntegration;		
		@FindBy(xpath="//img[@alt='Automation - Moolya Framework']")
		private WebElement r_MoolyaFramework;	
		@FindBy(xpath="//img[@alt='Automation - API Autopmation']")
		private WebElement r_apiAutomation;
			
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement r_userEmotion;	
		@FindBy(xpath="//img[@alt='Paper prototyping']")
		private WebElement r_paperPrototype;	
		@FindBy(xpath="//img[@alt='In App Feedback']")
		private WebElement r_inAppFeedback;
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement r_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement r_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement r_AppStoreReview;
		
		
		@FindBy(xpath="//img[@alt='NDTV Profit']")
		private WebElement NDTVProfit;

		@FindBy(xpath="//img[@alt='Guidelines']")
		private WebElement ndP_Network;	
		@FindBy(xpath="//img[@alt='Browser Compatibility']")
		private WebElement ndP_BrowserC;
		@FindBy(xpath="//img[@alt='Data']")
		private WebElement ndP_data;
		@FindBy(xpath="//img[@alt='Device Fragmentation']")
		private WebElement ndP_DeviceF;
		@FindBy(xpath="//img[@alt='Installation']")
		private WebElement ndP_Installation;
		//Performance
		@FindBy(xpath="//img[@alt='Performance - Network Analysis']")
		private WebElement ndP_NetworkA;	
		@FindBy(xpath="//img[@alt='Performance - Memory Leak']")
		private WebElement ndP_MemoryLeak;	
		@FindBy(xpath="//img[@alt='Performance - GPU Overdraw']")
		private WebElement ndP_GPUOverdraw;
		@FindBy(xpath="//img[@alt='Performance - Battery Drain']")
		private WebElement ndP_BAtteryDrain;	
		@FindBy(xpath="//img[@alt='Performance - API Load Test']")
		private WebElement ndP_apiLoadTest;
		//Automation
		@FindBy(xpath="//img[@alt='Automation - Selenium']")
		private WebElement ndP_Selenium;		
		@FindBy(xpath="//img[@alt='Automation - Selendroid']")
		private WebElement ndP_selendroid;	
		@FindBy(xpath="//img[@alt='Automation - Robotium']")
		private WebElement ndP_robotium;
		@FindBy(xpath="//img[@alt='Automation - Reporting Dashboard']")
		private WebElement ndP_reportingDBoard;		
		@FindBy(xpath="//img[@alt='Automation - Appachhi']")
		private WebElement ndP_appachhi;	
		@FindBy(xpath="//img[@alt='Automation - API Autopmation']")
		private WebElement ndP_apiAutopmation;
			
		//User Experience
		@FindBy(xpath="//img[@alt='User Emotions']")
		private WebElement ndP_userEmotion;	
		@FindBy(xpath="//img[@alt='Paper prototyping']")
		private WebElement ndP_paperPrototype;	
		@FindBy(xpath="//img[@alt='In App Feedback']")
		private WebElement ndP_inAppFeedback;
		@FindBy(xpath="//img[@alt='Competitive Analysis']")
		private WebElement ndP_CAnalysis;	
		@FindBy(xpath="//img[@alt='Click Testing']")
		private WebElement ndP_ClickTestings;	
		@FindBy(xpath="//img[@alt='App Store Review']")
		private WebElement ndP_AppStoreReview;
		
		@FindBy(xpath="//img[@alt='Flipkart-Retail-app-min']")
		private WebElement apps;
		
		public void M_100MMethod() throws InterruptedException{
			Thread.sleep(2000);
			flipcart.click();
			flipCartFeatures();
			//olaFeatures();
			//System.out.println("return");
			//Actions actions = new Actions(driver);
			//WebElement mainMenu = driver.findElement(By.linkText("menulink"));
			//actions.moveToElement(flipcart);
		
			/*Thread.sleep(2000);
			ola.click();
			Thread.sleep(2000);
			zee.click();
			Thread.sleep(2000);
			practo.click();
			Thread.sleep(2000);
			paytm.click();
			Thread.sleep(2000);
			flipkartEBook.click();
			Thread.sleep(2000);
			commonFloor.click();
			Thread.sleep(2000);
			nbc.click();
			Thread.sleep(2000);
			dittoTV.click();
			Thread.sleep(2000);
			NDTV.click();
			Thread.sleep(2000);
			roboBank.click();
			Thread.sleep(2000);
			NDTVProfit.click();*/
		}
		public void flipCartFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(f_Carriers).perform();
			Assert.assertTrue(f_Carriers.isDisplayed());
			Thread.sleep(2000);
			builder.moveToElement(f_Network).perform();
			Assert.assertTrue(f_Network.isDisplayed());
			Thread.sleep(2000);
			builder.moveToElement(f_Location).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_Interrupts).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_BrowserC).perform();
			Thread.sleep(2000);
			Thread.sleep(2000);
			builder.moveToElement(f_DeviceF).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_Installation).perform();
			
			//Performance
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,250)");
			
			builder.moveToElement(f_NetworkA).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_MemoryLeak).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_GPUOverdraw).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_GarbageCleanup).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_BAtteryDrain).perform();
			
			//Automation
			Thread.sleep(2000);
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			
			builder.moveToElement(f_Selenium).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_MoolyaFramework).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_Appium).perform();
			
			//User Experience
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200)");
			
			builder.moveToElement(f_CAnalysis).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_ClickTestings).perform();
			Thread.sleep(2000);
			builder.moveToElement(f_AppStoreReview).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//olaFeatures();
		}
		/*public void olaFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			Thread.sleep(2000);
			ola.click();
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(O_Guidelines).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_Carriers).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_Network).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_Location).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_Interrupt).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_Gesture).perform();
			
			//Performance
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,250)");
			builder.moveToElement(O_NetworkA).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_MemoryLeak).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_GPUOverdraw).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_GarbageCleanup).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_BAtteryDrain).perform();
			
			//User Experience
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(O_appFeedBack).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_clicksTesting).perform();
			Thread.sleep(2000);
			builder.moveToElement(O_appStoreReview).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			zeeTVFeatures();
		}

		public void zeeTVFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			Thread.sleep(2000);
			zee.click();
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(Z_guidelines).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_wearables).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_bCompatibility).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_data).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_gesture).perform();
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(Z_userEmotions).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_CAnalysis).perform();
			Thread.sleep(2000);
			builder.moveToElement(Z_appStoreReview).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			practoFeatures();
		}
		public void practoFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			Thread.sleep(2000);
			practo.click();
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(P_bCompatibility).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_data).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_deviceFrag).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_gesture).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_installation).perform();
			
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(P_NetworkA).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_MemoryLeak).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_GPUOverdraw).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_GarbageCleanup).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_BAtteryDrain).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_apiLoadTest).perform();
			
		
			js.executeScript("window.scrollBy(0,200)");
			builder.moveToElement(P_userEmotion).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_CAnalysis).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_clickTesting).perform();
			Thread.sleep(2000);
			builder.moveToElement(P_appStoreReview).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			paytmFeatures();
		}
		public void paytmFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			Thread.sleep(2000);
			paytm.click();
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(Pa_guidelines).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_carriers).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_wearables).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_data).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_deviceFrag).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_installation).perform();
			
			//Performance
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,250)");
			builder.moveToElement(Pa_NetworkA).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_MemoryLeak).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_GPUOverdraw).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_GarbageCleanup).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_BAtteryDrain).perform();
			
			//User Experience
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(Pa_CAnalysis).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_clickTesting).perform();
			Thread.sleep(2000);
			builder.moveToElement(Pa_appStoreReview).perform();
			driver.navigate().back();
			Thread.sleep(2000);
			flipkartEBookFeatures();
		}
		
		public void flipkartEBookFeatures() throws InterruptedException{
			Actions builder = new Actions(driver);
			Thread.sleep(2000);
			flipkartEBook.click();
			//Functional
			Thread.sleep(2000);
			builder.moveToElement(feb_guidelines).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_Network).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_Interrupts).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_Interoperability).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_BrowserC).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_gesture).perform();
			
			//Performance
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,250)");
			builder.moveToElement(feb_NetworkA).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_MemoryLeak).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_GPUOverdraw).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_GarbageCleanup).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_BAtteryDrain).perform();
			
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(feb_Selenium).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_selendroid).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_MoolyaFramework).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_Appium).perform();
			
			//User Experience
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			builder.moveToElement(feb_CAnalysis).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_ClickTestings).perform();
			Thread.sleep(2000);
			builder.moveToElement(feb_AppStoreReview).perform();
			driver.navigate().back();
			Thread.sleep(2000);
			//flipkartEBookFeatures();
		}

		*/
		
}
