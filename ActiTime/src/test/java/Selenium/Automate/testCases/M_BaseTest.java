package Selenium.Automate.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Selenium.Automate.pages.M_BasePage;

public class M_BaseTest {
	public WebDriver driver;
	
	M_BasePage mbp;
	
	@BeforeClass
	public void setUp(){
		mbp=new  M_BasePage(driver);
		driver=mbp.launchBrowser();
	}

}
