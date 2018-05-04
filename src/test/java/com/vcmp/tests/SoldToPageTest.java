package com.vcmp.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcmp.base.TestBase;
import com.vcmp.pages.HomePage;
import com.vcmp.pages.LoginPage;
import com.vcmp.pages.SoldToPage;
import com.vcmp.pages.UserActionLogPage;
import com.vcmp.utility.TestUtil;

public class SoldToPageTest extends TestBase {
	SoldToPage soldToPage;
	UserActionLogPage userActionLogPage;
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	String sheetName = "AddressData";

	public SoldToPageTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws InterruptedException {
		Initialization();
		soldToPage = new SoldToPage();
		userActionLogPage = new UserActionLogPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("user_id"),
				prop.getProperty("password"));
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] getAddrTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 1, dataProvider = "getAddrTestData")
	public void AddressDataTest(String CName, String Sterm, String Str1,
			String Str2, String PCode, String Ct, String Cntry, String Reg,
			String Mobile1) throws NumberFormatException, InterruptedException {
		soldToPage = homePage.ClickOnAddBtn();
		Thread.sleep(2000);
		
		soldToPage.AddresData(CName, Sterm, Str1, Str2, PCode, Ct, Cntry, Reg,
				Mobile1);
	
	}

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

}
