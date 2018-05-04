package com.vcmp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcmp.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or OR:
	@FindBy (name="user_name")
	WebElement username;
	
	@FindBy (id="password")
    WebElement password;
	
	@FindBy (id="btnLogin")
	WebElement Loginbtn;
	
	//Initialization
	public LoginPage(){
     PageFactory.initElements(driver, this);		
	}
	
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
		
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();
		return new HomePage();
	}

}
