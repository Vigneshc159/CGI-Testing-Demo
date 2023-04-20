package org.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BankRepo {
	public @FindBy (xpath="//*[@id=\\\"DivUser\\\"]/span/span[2]") WebElement admin;
	public @FindBy (linkText="Bank Setup") WebElement banksetup;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd") WebElement addButton;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave") WebElement saveButton;
	public @FindBy (xpath="//button[@class=\"btn btn-primary\"][@onclick=\"CloseAlert()\"]") WebElement warningButton0;
	public @FindBy (id="ContentPlaceHolder1_LinkButton2") WebElement warningButton;
	public @FindBy (id="ContentPlaceHolder1_txtBankName") WebElement accountName; 
	public @FindBy(id="ContentPlaceHolder1_txtLastdigit")WebElement accountNumber;
	public @FindBy(id="ContentPlaceHolder1_btnlnkClear")WebElement clear;
	public @FindBy(id="ContentPlaceHolder1_ddlAccgroup")WebElement accountGroup;
	public @FindBy (id="ContentPlaceHolder1_rblActiveno")WebElement disAble;
	public @FindBy (id="ContentPlaceHolder1_lnkAddAG")WebElement addgroupButton1;
	public @FindBy(id="ContentPlaceHolder1_txtAccGroupName")WebElement accountGroup1;
	public @FindBy(id="ContentPlaceHolder1_lnkSaveAccGroup")WebElement saveButton1;
	public @FindBy(xpath="//button[@type=\"reset\"] [@onclick=\"CloseAlert()\"]")WebElement warningButton1;
	public @FindBy(id="ContentPlaceHolder1_lnkEditRole")WebElement editButton;
	public @FindBy(id="ContentPlaceHolder1_rblAuthoriseNo")WebElement noathuorizeButton; 
	public @FindBy(id="ContentPlaceHolder1_rblAuthriseYes")WebElement yesathuorizeButton;
	public @FindBy(id="ContentPlaceHolder1_ddlname")WebElement athuorizeaccountName;
	public @FindBy (id="ContentPlaceHolder1_gvBankSetup_lnkEdit_0")WebElement editButton1;
	public @FindBy (xpath="//button[@id=\"Hyperlink\"]")WebElement backButton;
	public @FindBy (id="ContentPlaceHolder1_ddlStatSearch")WebElement selectButton;
	public @FindBy (id="ContentPlaceHolder1_gvBankSetup_lnkEdit_1")WebElement editButton2;
	public @FindBy (id="ContentPlaceHolder1_txtAddress1")WebElement locationName;
	public @FindBy (xpath="//a[@title=\"Click here to update\"]") WebElement updateButton;
    public @FindBy(linkText="Authorized .Net" )WebElement AuthorizedNet;
    public @FindBy(id="ContentPlaceHolder1_txtname" )WebElement accountName1;
    public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txttransactionKey\"]" )WebElement transactionKey;
    public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txtclientCode\"]" )WebElement loginId;
    public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txtclientCode\"]" )WebElement runningButton;
    public @FindBy(id="ContentPlaceHolder1_rblstatusNo")WebElement stopButton;
    public @FindBy(xpath="//div[@class=\"btn btn-primary btn-sm h-35px\"]")WebElement actionButton;
    public @FindBy(id="ContentPlaceHolder1_LinkButton1")WebElement backButton1;
    public @FindBy(id="ContentPlaceHolder1_gvAuthorize_lnkEdit_4")WebElement editButton3;
    public @FindBy(id="ContentPlaceHolder1_LinkButton2")WebElement backButton2;
    public @FindBy(id="ContentPlaceHolder1_lnkcleardetail")WebElement clearButton2;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkupdatedetail\"]") WebElement updateButton1;
	public @FindBy (id="ContentPlaceHolder1_txtnameedit") WebElement accountName2;
	public @FindBy (linkText="IP Whitelist" )WebElement iPWhitelist;
	public @FindBy (xpath="//input[@id=\"ContentPlaceHolder1_txtInstruction\"]" )WebElement searchButton;
	public @FindBy (xpath="//input [@id=\"ContentPlaceHolder1_txtIpaddress\"]")WebElement ipAddressName;
	public @FindBy (xpath="//input[@id=\"ContentPlaceHolder1_txtResponsibleperson\"]\r\n"+ "")WebElement responsiblepersonName;
	public @FindBy (xpath="//input [@id=\"ContentPlaceHolder1_txtIpaddress\"]")WebElement iplocationName1;
	public @FindBy (id="ContentPlaceHolder1_rblActiveyes")WebElement enAbledButton;
	public @FindBy (linkText="User log")WebElement userlog;
	public @FindBy (id="ContentPlaceHolder1_txtEmail")WebElement searchBox;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSearch\"]" )WebElement searchButton1;
	public @FindBy (id="ContentPlaceHolder1_gvLogAudit_lnkEdit_0")WebElement viewButton;
	public @FindBy (id="ContentPlaceHolder1_btnVback")WebElement backButton3;
	public @FindBy (linkText="Event Log")WebElement eventLog;
	public @FindBy (id="ContentPlaceHolder1_txtSearch")WebElement searchBox2;
	public @FindBy (id="ContentPlaceHolder1_gvAlertLog_lnkEdit_0")WebElement viewButton1;
	public @FindBy (linkText="Exception Log")WebElement expectionLog;
	public @FindBy (id="ContentPlaceHolder1_txtEmail")WebElement searchBox3;

	
	}
