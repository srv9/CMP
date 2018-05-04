package com.vcmp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcmp.base.TestBase;

public class ControlDataPage extends TestBase {
	
	
//Page Factory or OR
	@FindBy(id = "idLiControlData")
    WebElement ControlDataBtn;
	
	@FindBy(xpath = "//input[@id='idCDTax1']")
	WebElement Tax1;
	
	@FindBy(xpath = "//input[@id='idCDTax2']")
	WebElement Tax2;
	
	@FindBy(xpath = "//input[@id='idCDTax3']")
	WebElement Tax3;
	
	@FindBy(id = "idLiMarketing")
    WebElement MarketingBtn;


//Actions

  public ControlDataPage(){
	  PageFactory.initElements(driver, this);
  }
  
  public ControlDataPage ClickOnControlDataTab(){
	  ControlDataBtn.click();
	  return new ControlDataPage();
  }
  
  public String verifyControlDataPageTitle() {
		return driver.getTitle();
	}
  
  public void ControlData(String Tx1, String Tx2, String Tx3){
	  Tax1.sendKeys("Tx1");
	  Tax2.sendKeys("Tx2");
	  Tax3.sendKeys("Tx3");
  }
  
}