package com.vcmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vcmp.base.TestBase;

public class HomePage extends TestBase {
	LoginPage loginPage;

	// Page Factory or OR

	@FindBy(id = "idOrganization")
	WebElement Organizarionid;

	@FindBy(id = "idBtnCustNew")
	WebElement NewListBtn;

	@FindBy(id = "idBtnCustApproved")
	WebElement ApprovedListBtn;

	@FindBy(id = "idBtnCustReview")
	WebElement ReviewBtn;

	@FindBy(id = "idReqHmAdd")
	WebElement AddBtn;

	@FindBy(id = "idReqHmView")
	WebElement ViewBtn;

	@FindBy(id = "idReqHmEdit")
	WebElement EditBtn;

	@FindBy(id = "idReqHmExport")
	WebElement ExportBtn;

	@FindBy(id = "idReqHmUserActnLg")
	WebElement UserActionLogBtn;

	@FindBy(id = "idReqSAPStatus")
	WebElement SAPStatusBtn;

	@FindBy(id = "idReqImpStatus")
	WebElement ImportStatusBtn;

	@FindBy(id = "idInputAM")
	WebElement AreaManagerUser;

	@FindBy(id = "idInputCSE")
	WebElement CSEUser;

	@FindBy(id = "idInputMDM")
	WebElement MDMUser;

	// Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	/*
	 * public SelectOrg(){ Select org =new
	 * Select(driver.findElement(By.id("idOrganization")));
	 * org.selectByIndex(3);
	 * 
	 * 
	 * }
	 */
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnExportBtn() {
		ExportBtn.click();
	}

	public UserActionLogPage ClickOnUserActionLog() {
		UserActionLogBtn.click();
		return new UserActionLogPage();
	}

	public SAPStatusPage ClickOnSAPStatus() {
		SAPStatusBtn.click();
		return new SAPStatusPage();
	}

	public ImportStatusPage ClickOnImportStatus() {
		ImportStatusBtn.click();
		return new ImportStatusPage();
	}

	public SoldToPage ClickOnAddBtn() {
		AddBtn.click();
		return new SoldToPage();
	}
}
