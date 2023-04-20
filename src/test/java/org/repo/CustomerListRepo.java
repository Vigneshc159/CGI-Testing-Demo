package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CustomerListRepo {
	public @FindBy(id="DivCustomer")WebElement customer ;
	public @FindBy(linkText="List")WebElement list ;
	public @FindBy(id="ContentPlaceHolder1_ddlclientfilter")WebElement selectinstaller ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSearch\"]")WebElement searchButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkaddcust\"]")WebElement addButton ;
	public @FindBy(id="ContentPlaceHolder1_txtcustomerid")WebElement customerid ;
	public @FindBy(id="ContentPlaceHolder1_txtcustname")WebElement customername ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton1\"]")WebElement warningButton ;
	public @FindBy(id="ContentPlaceHolder1_ddlclient")WebElement selectclient ;
	public @FindBy(id="ContentPlaceHolder1_ddlcustgrp")WebElement selectcustomer ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton15")WebElement clearbutton ;
	public @FindBy(id="ContentPlaceHolder1_txtmonthPay")WebElement monthlypaymentbox ;
	public @FindBy(id="ContentPlaceHolder1_txtyears")WebElement totalyears ;
	public @FindBy(id="ContentPlaceHolder1_txtescal")WebElement escalation  ;
	public @FindBy(id="ContentPlaceHolder1_txtprocostauto")WebElement totalcontractamount  ;
	public @FindBy(id="ContentPlaceHolder1_txtphoeNo")WebElement phonenum ;
	public @FindBy(id="ContentPlaceHolder1_txtEmail")WebElement email  ;
	public @FindBy(xpath="//span[@class=\"svg-icon svg-icon-5 m-0\"]")WebElement actionButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkBack\"]\r\n"+ "")WebElement backButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton14\"]\r\n"+ "")WebElement customeraddButton ;
	public @FindBy(id="ContentPlaceHolder1_lnksave")WebElement saveButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkSaveAccGroup\"]\r\n"+ "")WebElement saveButton1 ;
	public @FindBy(id="ContentPlaceHolder1_txtPortfolio")WebElement portfolioBox ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkClearAccGroup\"]\r\n"+ "")WebElement clearButton1 ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton7")WebElement warningButton1 ;
	public @FindBy(id="HyperlinkAcc")WebElement backButton1  ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton16")WebElement customereditButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkSaveAccGroup\"]\r\n"+ "")WebElement updatedButton ;
	public @FindBy(id="ContentPlaceHolder1_rblprepaid")WebElement prepaidButton  ;
	public @FindBy(id="ContentPlaceHolder1_rblman")WebElement manualpayButton  ;
	public @FindBy(id="ContentPlaceHolder1_gvcustomers_lnkEdit_0")WebElement editcustomerButton  ;
	public @FindBy(xpath="//button[@id=\"mpecomments\"]\r\n"+ "")WebElement addnotesButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_inkcommentsave\"]\r\n"+ "")WebElement saveButton2  ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton1")WebElement warningButton2  ;
	public @FindBy(id="ContentPlaceHolder1_txtremarks")WebElement notes  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_inkcommentclear\"]\r\n"+ "")WebElement clearButton2 ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton8\"]\r\n"+ "")WebElement editcustomerButton1 ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnksave\"]\r\n"+ "")WebElement updatedButton1 ;
	public @FindBy(id="ContentPlaceHolder1_rblLTF")WebElement ltfButton  ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton4\"]\r\n"+ "")WebElement editpaymentscheduleButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_btnUpdatePay\"]\r\n"+ "")WebElement updatedButton2 ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton2")WebElement backButton2  ;
	public @FindBy(id="ContentPlaceHolder1_lnkmerge")WebElement mergecustomerButton  ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_chshowpayment\"]\r\n"+ "")WebElement agreeButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSavemodify\"]\r\n"+ "")WebElement mergeButton ;
	public @FindBy(id="ContentPlaceHolder1_gvcustomers_lnkEdit_27")WebElement editcustomerButton2  ;
	public @FindBy(id="ContentPlaceHolder1_ddlcustomer")WebElement selectmeergecustomerButton  ;
	public @FindBy(id="ContentPlaceHolder1_txtcustomerID")WebElement customeridcrm ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton5\"]\r\n"+ "")WebElement viewreceivedpaymentButton ;
	public @FindBy(id="ContentPlaceHolder1_lnkbtnprint")WebElement printButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_LinkButton9\"]\r\n"+ "")WebElement editmonthlypaymentButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSavemodify\"]")WebElement save1Button ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txtMonPay\"]\r\n"+ "")WebElement monthlypay ;
	public @FindBy(id="ContentPlaceHolder1_txtNotesMPM")WebElement reason ;
	public @FindBy(id="ContentPlaceHolder1_lnkCRMMap")WebElement crmmontoringButton;
	public @FindBy(xpath="//select[@id=\"ContentPlaceHolder1_ddlcrmname\"]\r\n"+ "")WebElement crm ;
	public @FindBy(id="ContentPlaceHolder1_ddlcrmsystem")WebElement crmname;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_txtProEsc\"]\r\n"+ "")WebElement producationescalation ;
	public @FindBy(id="ContentPlaceHolder1_LinkButton7")WebElement warningButton3;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkDocSetup\"]\r\n"+ "")WebElement documentsetupButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_btnlnkSave\"]")WebElement saveButton3 ;
	public @FindBy(id="ContentPlaceHolder1_lnkescalation")WebElement escalationprogram;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_chkRobot\"]\r\n"+ "")WebElement rebootButton ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_chkTerms1\"]\r\n"+ "")WebElement agreedButton ;
	public @FindBy(xpath="//input[@id=\"ContentPlaceHolder1_chkTerms2\"]\r\n"+ "")WebElement agreedButton1 ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnksubmit\"]\r\n"+ "")WebElement submitButton ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkviewcustomer\"]")WebElement backButton3 ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSave\"]\r\n"+ "")WebElement updatedButton3 ;
	public @FindBy(xpath="/html/body/form/div[3]/div/div[2]/div[2]/div[3]/div/div/div/div[3]/button\r\n"+ "")WebElement warningbutton3 ;
	public @FindBy(xpath="/html/body/form/div[3]/div/div[2]/div[4]/div/div/div/div[3]/button\r\n"+ "")WebElement warningbutton4 ;
	public @FindBy(xpath="//a[@onclick=\"fnPageRedirect('ACHSetup.aspx')\"]\r\n"+ "")WebElement achform ;
	public @FindBy(id="ContentPlaceHolder1_ddlCustStatus")WebElement achpending ;
	public @FindBy(xpath="//a[@id=\"ContentPlaceHolder1_inkButton1\"]\r\n"+ "")WebElement searchButton1 ;
	public @FindBy(id="ContentPlaceHolder1_gvcustomers_lnkEdit_0")WebElement acheditcustomerButton ;
	public @FindBy(id="ContentPlaceHolder1_Button2")WebElement updatedButton4 ;
	public @FindBy(xpath="/html/body/form/div[3]/div/div[3]/div/div/div/div[3]/button\r\n"+ "")WebElement warningbutton5 ;
	public @FindBy(id="ContentPlaceHolder1_ddlaccounttypeACH")WebElement accounttype ;
	public @FindBy(id="ContentPlaceHolder1_txtNAPBK")WebElement bankname ;


	
	
}

