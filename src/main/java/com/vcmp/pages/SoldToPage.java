package com.vcmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vcmp.base.TestBase;

public class SoldToPage extends TestBase {

	// Page Factory or OR
	@FindBy(id = "idCompanyName")
	WebElement CompanyName;

	@FindBy(id = "idSearchterm")
	WebElement SearchTerm;

	@FindBy(id = "idStreet2")
	WebElement Street1;

	@FindBy(id = "idStreet3")
	WebElement Street2;

	@FindBy(id = "idStreet4")
	WebElement Street3;

	@FindBy(id = "idStreet5")
	WebElement Street4;

	@FindBy(id = "idStreetHousenumber")
	WebElement Street;

	@FindBy(id = "idStreetHousenumber2")
	WebElement HouseNo;

	@FindBy(id = "idDistrict")
	WebElement District;

	@FindBy(id = "idDifferentCity")
	WebElement DIffCity;

	@FindBy(id = "idpostalCode")
	WebElement PostalCode;

	@FindBy(id = "idCity")
	WebElement City;

	@FindBy(xpath = "//input[@id='idInputCountryList']")
	WebElement Country;

	@FindBy(xpath = "//input[@id= 'idInputRegionList']")
	WebElement Region;
	
	@FindBy(id = "idMobilePhone1")
	WebElement MobileNo1;

	@FindBy(id = "idBtnSaveCustAddrs")
	WebElement SaveBtn;
	
	@FindBy(id = "idLiControlData")
    WebElement ControlDataBtn;
	
	@FindBy(xpath = "//input[@id='idCDTax3']")
	WebElement Tax3;
	
	@FindBy(id = "idLiMarketing")
    WebElement MarketingBtn;


	// Initialization
	public SoldToPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public void AddresData(String CName, String Sterm, String Str1,
			String Str2, String PCode, String Ct, String Cntry, String Reg, String Mobile1)
			throws InterruptedException {
		CompanyName.sendKeys(CName);
		SearchTerm.sendKeys(Sterm);
		Street1.sendKeys(Str1);
		Street2.sendKeys(Str2);
		PostalCode.sendKeys(PCode);
		City.sendKeys(Ct);
		Country.sendKeys(Cntry);
		Thread.sleep(2000);
		int Reg1 = Integer.parseInt(Reg);
		Region.sendKeys(Reg);
		MobileNo1.sendKeys(Mobile1);
		
		
		/*
		 * Select select = new
		 * Select(driver.findElement(By.xpath("//input[@id='idInputCountryList']"
		 * ))); select.selectByVisibleText(Country);
		 * 
		 * Select selectR = new
		 * Select(driver.findElement(By.xpath("//input[@id='idInputRegionList')"
		 * ))); selectR.selectByVisibleText(Region);
		 */

		//SaveBtn.click();
		Thread.sleep(5000);
	}
	
	public ControlDataPage ClickOnControlDataTab(){
		ControlDataBtn.click();
		return new ControlDataPage();
	}
}
