package actiTime.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A_BasePage {

 public WebDriver driverWeb;
	static long startTime;
	static long endTime;
	static long totalTime;
	
	 //StopWatch pageLoad = new StopWatch();
	
	public A_BasePage(WebDriver driverWeb)
	{
		this.driverWeb=driverWeb;
	}
	
	public WebDriver launchBrowser() {
		driverWeb=new FirefoxDriver();
		driverWeb.get("http://localhost/login.do");
		driverWeb.manage().window().maximize();	
		//return;
		return driverWeb;
	}
	
	

	
	public static HashMap<String,String> readExcelData(String sheetName, String uniqueValue) throws EncryptedDocumentException, InvalidFormatException, IOException{
		Row row=null;
		//String key,value;
		FileInputStream fis=new FileInputStream(new File("E:\\Mahesh\\ExcelData\\actiTimeData.xlsx"));
		HashMap<String,String> dataMap = new HashMap<String, String>();
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sheetName);
		Iterator<Row> it=sheet.rowIterator();
		Row record=it.next();
		while(it.hasNext()){
			
			row=it.next();
			String value1=row.getCell(0).toString();
			for(int i=1;i<row.getLastCellNum();i++){
				if(value1.equalsIgnoreCase(uniqueValue))
				{
					String cellValue = record.getCell(i).toString();
					String cellHeader=row.getCell(i).toString();
					dataMap.put(cellValue, cellHeader);
				}
			}
		}
		return dataMap;
	}
	
}
