package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utility.PropertyFileReader;

public class InstallerRepo {
	
	public @FindBy(id="DivSetup")WebElement installer;
	public @FindBy(linkText="Installer")WebElement moduleinstaller;
	public @FindBy(id="ContentPlaceHolder1_lnkbtnadd")WebElement addButton;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_btnlnkSave\"]")WebElement saveButton;
	public @FindBy(xpath="//button[@type=\"reset\"][@onclick=\"CloseAlert()\"]")WebElement warningButton;
	public @FindBy (xpath="//input[@id=\"ContentPlaceHolder1_txtCompanyName\"]")WebElement nameBox;
	public @FindBy (id="ContentPlaceHolder1_ddlcountry")WebElement countryName;
	public @FindBy (xpath="//select[@id=\"ContentPlaceHolder1_ddlState\"]")WebElement stateName;
	public @FindBy (id="ContentPlaceHolder1_txtAddress1")WebElement addressbox;
	public @FindBy (id="ContentPlaceHolder1_txtAddress2")WebElement addressbox2;
	public @FindBy (id="ContentPlaceHolder1_txtCity")WebElement cityName;
	public @FindBy (id="ContentPlaceHolder1_txtZip")WebElement zipcodebox;
	public @FindBy (id="ContentPlaceHolder1_txtPhone")WebElement phonenumbox;
	public @FindBy (id="ContentPlaceHolder1_txtEmail")WebElement emailBox;
	public @FindBy (id="ContentPlaceHolder1_lnkclear")WebElement clearButton;
	public @FindBy (id="ContentPlaceHolder1_rblActiveyes")WebElement enabledButton;
	public @FindBy (id="ContentPlaceHolder1_rblActiveno")WebElement disabledButton;
	public @FindBy (id="ContentPlaceHolder1_rblfullview")WebElement fullviewButton;
	public @FindBy (xpath="//button[@id=\"Hyperlink\"] [@onclick=\"CloseCustAlert()\"]")WebElement backButton;
	public @FindBy (id="ContentPlaceHolder1_gvCompanySetup_lnkEdit_1")WebElement usereditButton;
	public @FindBy (xpath="	//span[@class=\"svg-icon svg-icon-5 m-0\"]\r\n"+ "")WebElement actionsButton;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_LinkButton1\"]\r\n"+ "")WebElement editInstaller;
	public @FindBy (xpath="	//button[@id=\"hdnclose\"] [@onclick=\"CloseCustAlert()\"]\r\n"+ "")WebElement backButton2;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_LinkButton7\"]\r\n"+ "")WebElement clearButton2;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_LinkButton5\"] ") WebElement updatedButton;
	public @FindBy (id="ContentPlaceHolder1_button3")WebElement warningButton2;
	public @FindBy (id="ContentPlaceHolder1_rblsimpleview")WebElement simpleviewButton;
	public @FindBy (id="ContentPlaceHolder1_ddlStatSearch")WebElement statusBox;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd")WebElement addinvestment;
	public @FindBy (id="ContentPlaceHolder1_txttransdat")WebElement transactiondate;
	public @FindBy (id="ContentPlaceHolder1_txtamount")WebElement amountbox;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_btnlnkClear\"]")WebElement clearButton3;
	public @FindBy (id="ContentPlaceHolder1_txtBankname")WebElement banknameBox;
	public @FindBy (id="ContentPlaceHolder1_dvfileupload")WebElement uploadFile;
	public @FindBy(id="ContentPlaceHolder1_LinkButton4")WebElement saveButton2;
	public @FindBy(id="ContentPlaceHolder1_txtInstruction")WebElement searchBox;
	public @FindBy(id="ContentPlaceHolder1_ddlStatSearch")WebElement select1;
	public @FindBy (id="ContentPlaceHolder1_gvCompanySetup_lnkEdit_0")WebElement usereditButton2;
	public @FindBy (id="ContentPlaceHolder1_gvInvestment_lnkEdit_0")WebElement investmenteditButton;
	public @FindBy (id="ContentPlaceHolder1_btnlnkSave")WebElement updatedButton2;
	public @FindBy (xpath="	//div[@id=\"ContentPlaceHolder1_divUpload\"]\r\n"+ "")WebElement uploadFile2;
	public @FindBy (id="ContentPlaceHolder1_btnbankaccess")WebElement banksetupAcces;
	public @FindBy (id="ContentPlaceHolder1_gvbankaccess_chkStatus_2")WebElement tickbutton;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnsave")WebElement updatedButton3;
	public @FindBy (id="ContentPlaceHolder1_button3")WebElement warningButton1;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_btnlnkSave\"] [@title=\"click here to save\"]")WebElement saveButton3;
	public @FindBy(linkText="Customer group")WebElement customergroup ;
	public @FindBy (id="ContentPlaceHolder1_txtInstruction")WebElement searchBox1;
	public @FindBy (id="ContentPlaceHolder1_ddlStatSearch")WebElement selectdropdown;
	public @FindBy(xpath="//select[@id=\"ContentPlaceHolder1_ddlclient\"]\r\n"+ "")WebElement selectclientname;
	public @FindBy (id="ContentPlaceHolder1_txtGroupname")WebElement groupname;
	public @FindBy (id="ContentPlaceHolder1_gvCustomers_lnkEdit_1")WebElement installereditButton;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_btnlnkSave\"][@title=\"Click here to update\"]\r\n"+ "")WebElement updatedButton4;
	public @FindBy(xpath="//button[@type=\"reset\"][@onclick=\"CloseSucess()\"]")WebElement warningButton3;
	public @FindBy(linkText="NSF Setup")WebElement nsfsetup ;
	public @FindBy(xpath="//select[@id=\"ContentPlaceHolder1_ddlclient\"]")WebElement selectinstaller ;
	public @FindBy(id="ContentPlaceHolder1_ddlclientfilter")WebElement selectinstaller2 ;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnadd")WebElement addnsf;
	public @FindBy (id="ContentPlaceHolder1_ddlattempts")WebElement attemptsselect;
	public @FindBy (id="ContentPlaceHolder1_ddlInterval")WebElement intervelselect;
	public @FindBy (id="ContentPlaceHolder1_txtAmount")WebElement amountbox2;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_btnlnkClear\"] [@title=\"Click here to Clear\"]\r\n"+ "")WebElement clearButton4;
	public @FindBy (id="ContentPlaceHolder1_gvNsfSetup_lnkEdit_1")WebElement nsfeditButton;
	public @FindBy (xpath="//button[@id=\"Hyperlink\"] [@onclick=\"CloseUser()\"]")WebElement backButton3;
	public @FindBy (id="ContentPlaceHolder1_LinkButton10")WebElement warningbutton4;

	
	//ContentPlaceHolder1_gvNsfSetup_lnkEdit_6
	//ContentPlaceHolder1_ddlclientfilter
	}
