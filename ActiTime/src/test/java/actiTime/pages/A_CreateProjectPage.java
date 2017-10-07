package actiTime.pages;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import actiTime.testCases.A_LoginTest;

public class A_CreateProjectPage extends A_BasePage{

	public A_CreateProjectPage(WebDriver driverWeb) {
		super(driverWeb);
		PageFactory.initElements(driverWeb, this);
	}
	
	@FindBy(xpath="//td[@class='navItem relative']/a/img")
	private WebElement tasks;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement custProjectLink;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProject;
	
	@FindBy(name="customerId")
	private WebElement custID;
	
	@FindBy(name="name")
	private WebElement pName;
	
	@FindBy(name="description")
	private WebElement pDescription;

	@FindBy(id="listOfAllUsers")
	private WebElement listOfUsers;
	
	@FindBy(xpath="//input[@value='>']")
	private WebElement add;
	
	@FindBy(id="inProjectTeam")
	private WebElement inProject;
	//
	
	@FindBy(id="add_tasks_action")
	private WebElement addTasks;
	
	@FindBy(name="createProjectSubmit")
	private WebElement submit;

	private HashMap<String, String> data;
	
	public void createProjectMethod(String uniqueValue) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		data=readExcelData("OLD_Sheet", uniqueValue);
		Thread.sleep(2000);
		tasks.click();
		Thread.sleep(2000);
		custProjectLink.click();
		Thread.sleep(2000);
		createProject.click();
		Thread.sleep(2000);
		
		Select sel=new Select(custID);
		sel.selectByVisibleText("Internal");
		
		//custID.click();
		Thread.sleep(2000);
		pName.sendKeys(data.get("Project Name"));
		Thread.sleep(2000);
		pDescription.sendKeys(data.get("Project Description"));
		Thread.sleep(2000);
		
		Select users=new Select(listOfUsers);
		users.selectByValue("4");
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		inProject.click();
		Thread.sleep(2000);
		addTasks.click();
		Thread.sleep(2000);
		submit.click();
		
		
		/*Thread.sleep(2000);
		tasks.click();
		Thread.sleep(2000);
		custProjectLink.click();
		Thread.sleep(2000);
		createProject.click();
		Thread.sleep(2000);
		
		Select sel=new Select(custID);
		sel.selectByVisibleText("Internal");
		
		//custID.click();
		Thread.sleep(2000);
		pName.sendKeys("First Project");
		Thread.sleep(2000);
		pDescription.sendKeys("About Project");;
		Thread.sleep(2000);
		
		Select users=new Select(listOfUsers);
		users.selectByValue("4");
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		inProject.click();
		Thread.sleep(2000);
		addTasks.click();
		Thread.sleep(2000);
		submit.click();
*/
	}
}
