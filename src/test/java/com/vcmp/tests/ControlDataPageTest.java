package com.vcmp.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcmp.base.TestBase;
import com.vcmp.pages.ControlDataPage;
import com.vcmp.pages.HomePage;
import com.vcmp.pages.LoginPage;
import com.vcmp.pages.SoldToPage;
import com.vcmp.utility.TestUtil;

public class ControlDataPageTest extends TestBase {
	SoldToPage soldToPage;
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ControlDataPage controlDataPage;
	String sheetName = "ControlData";

/*	public ControlDataPageTest() {
		super();
	}
*/
	/*@BeforeMethod
	public void Setup() throws InterruptedException {
		Initialization();
		controlDataPage = new ControlDataPage();
		soldToPage = new SoldToPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("user_id"),
				prop.getProperty("password"));
		// controlDataPage = soldToPage.ClickOnControlDataTab();
		Thread.sleep(3000);
	}*/

	/*@Test(priority = 1)
	public void verifyControlDataPageTitleTest() {
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "VCMP Portal",
				"Home Page Title is Not Matching");
	}
*/
	@DataProvider
	public Object[][] getControlTestData() {
		Object data1[][] = TestUtil.getTestData(sheetName);
		return data1;
	}

	@Test(priority = 1, dataProvider = "getControlTestData")
	public void ControlDataTest(String Tx1, String Tx2, String Tx3)
			throws NumberFormatException, InterruptedException  {
		soldToPage.ClickOnControlDataTab();
		Thread.sleep(3000);
		controlDataPage.ControlData(Tx1, Tx2, Tx3);
		Thread.sleep(2000);

	}
/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
*/
}
