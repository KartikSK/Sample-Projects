package Selenium.Automate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;

public class M_BasePage {
	public WebDriver driver;
	
	public M_BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebDriver launchBrowser(){
		driver=new FirefoxDriver();
		driver.get("http://moolya.com");
		return driver;
	}
}
