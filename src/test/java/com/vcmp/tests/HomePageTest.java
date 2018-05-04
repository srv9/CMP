package com.vcmp.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vcmp.base.TestBase;
import com.vcmp.pages.HomePage;
import com.vcmp.pages.LoginPage;
import com.vcmp.pages.SoldToPage;
import com.vcmp.pages.UserActionLogPage;

public class HomePageTest extends TestBase {
	SoldToPage soldToPage;
	UserActionLogPage userActionLogPage;
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
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

	@Test(priority = 1)
	public void ValidateHomePageTitleTest() {
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "VCMP Portal",
				"Home Page Title is Not Matching");
	}

	@Test(priority = 2)
	public void VerifyExportTest() throws InterruptedException {
		homePage.clickOnExportBtn();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void verifyUserActionLog() throws InterruptedException {
		userActionLogPage = homePage.ClickOnUserActionLog();
		Thread.sleep(1000);
	}
	
	/*@Test(priority = 4)
	public void verifyAddTest() throws InterruptedException{
		soldToPage=homePage.ClickOnAddBtn();
		Thread.sleep(5000); 
	}*/

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
