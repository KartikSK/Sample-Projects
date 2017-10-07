package actiTime.pages;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_LoginPage extends A_BasePage{

	public A_LoginPage(WebDriver driverWeb) {
		super(driverWeb);
		PageFactory.initElements(driverWeb, this);
	}

	//public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement submit;

	private HashMap<String, String> data;
	
	public A_CreateProjectPage loginMethod(String uniqueValue) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		data=readExcelData("OLD_Sheet", uniqueValue);
		Thread.sleep(2000);
		userName.sendKeys(data.get("UserName"));
		Thread.sleep(2000);
		password.sendKeys(data.get("Password"));
		Thread.sleep(2000);
		submit.click();
		
		/*Thread.sleep(2000);
		userName.sendKeys("admin");
		Thread.sleep(2000);
		password.sendKeys("manager");
		Thread.sleep(2000);
		submit.click();*/
		return new A_CreateProjectPage(driverWeb);
	}
}
