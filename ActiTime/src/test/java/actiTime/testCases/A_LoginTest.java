package actiTime.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import actiTime.pages.A_BasePage;
import actiTime.pages.A_CreateProjectPage;
import actiTime.pages.A_LoginPage;



public class A_LoginTest extends A_BaseTest{

	
	@Test(dataProvider="readData")
	public void loginTest(String uniqueValue) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		
		bp=new A_BasePage(driverWeb);
		driverWeb=bp.launchBrowser();
		
		A_LoginPage lp=new A_LoginPage(driverWeb);
		A_CreateProjectPage cpp=lp.loginMethod(uniqueValue);
		cpp.createProjectMethod(uniqueValue);
	}

	@DataProvider
	public Object[][] readData() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//System.out.println("Pass");
		Object[][] obj;
		try{
		FileInputStream fis=new FileInputStream(new File("E:\\Mahesh\\ExcelData\\actiTimeData.xlsx"));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("OLD_Sheet");
		System.out.println("sheet");
		int noOfRows=sheet.getLastRowNum();
		Iterator<Row> it=sheet.rowIterator();
		Row record=it.next();
		obj = new Object[noOfRows][1];
		int i=0;
		while(it.hasNext()){
			obj[i][0]=it.next().getCell(0).toString();
			i++;
		}
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return obj;
	}
	
}
