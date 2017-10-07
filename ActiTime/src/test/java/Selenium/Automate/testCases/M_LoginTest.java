package Selenium.Automate.testCases;

import org.testng.annotations.Test;

import Selenium.Automate.pages.M_100MPage;

public class M_LoginTest extends M_BaseTest{

	@Test
	public void loginTest() throws InterruptedException {
		M_100MPage mp=new M_100MPage(driver);
		mp.M_100MMethod();
	}
}
