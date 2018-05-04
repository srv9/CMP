package com.vcmp.tests;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vcmp.base.TestBase;
import com.vcmp.pages.HomePage;
import com.vcmp.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void Setup() throws InterruptedException{
		Initialization();
		 loginPage =new LoginPage();
		 Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login", "Title is not matching");
	}
	
	@Test(priority=2)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("user_id"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
		
		
	}

