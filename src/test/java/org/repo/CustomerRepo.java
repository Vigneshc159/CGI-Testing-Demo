package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustomerRepo {
	public @FindBy(id="DivCustomer")WebElement customer ;
	public @FindBy(linkText="ACH Upload")WebElement achuplaod ;
	public @FindBy(linkText="Excel Upload")WebElement excelupload ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_btnlnkSave\"]\r\n"+ "")WebElement submitButton ;
//	public @FindBy(xpath="//input[@name=\"ctl00$ContentPlaceHolder1$FUAttQuo\"]")WebElement submitButton2 ;
	public @FindBy(xpath="//button[@type=\"reset\"] [@onclick=\"CloseAlert()\"]\r\n"+ "")WebElement warningButton1 ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txtMonth\"]\r\n"+ "")WebElement monthButton ;
	public @FindBy(id="ContentPlaceHolder1_lnkSampleFile")WebElement samplefileButton ;
	public @FindBy(id="ContentPlaceHolder1_lnkachformsetup")WebElement achformsetupButton ;
	public @FindBy(xpath="//select[@id=\"ContentPlaceHolder1_ddlclient\"]\r\n"+ "")WebElement selectinstaller1 ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]\r\n"+ "")WebElement fileUpload ;


	
	}
