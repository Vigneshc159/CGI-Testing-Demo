package org.repo;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsRepo {
	public @FindBy (id="DivReports") WebElement reports;
	public @FindBy (linkText="OS Report") WebElement osreports;
	public @FindBy (xpath="//select[@id=\"ContentPlaceHolder1_ddlclientfilter\"]\r\n"+ " ") WebElement selectinstaller;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_btnosreport\"]\r\n"+ "") WebElement runreportButton;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkExcel\"]") WebElement excelButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton1") WebElement warningButton;
	public @FindBy (id="ContentPlaceHolder1_gvOutStanding_lnkEdit_0") WebElement customerviewButton;
	public @FindBy (xpath="//button[@id=\"mpecomments\"]\r\n"+ "") WebElement addnotesButton;
	public @FindBy (id="ContentPlaceHolder1_inkcommentsave") WebElement saveButton;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSaveTemp\"] [@onclick=\"fnProcesspartssave();\"]\r\n"+ "") WebElement saveButton2;
	public @FindBy (id="ContentPlaceHolder1_txtremarks") WebElement customertextbox;
	public @FindBy (id="ContentPlaceHolder1_inkcommentclear") WebElement clearButton;
	public @FindBy (id="ContentPlaceHolder1_lnkviewlog") WebElement viewlogButton;
	public @FindBy (xpath="//button[@id=\"Hyperlink\"]\r\n"+ "") WebElement backButton;
	public @FindBy (id="ContentPlaceHolder1_LinkButton8") WebElement addreceivedpaymentButton;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_btnSubmit\"]\r\n"+ "") WebElement submitButton;
	public @FindBy (xpath="//input[@name=\"ctl00$ContentPlaceHolder1$txtTranDesc\"]") WebElement transactiondescriptionBox;
	public @FindBy (id="ContentPlaceHolder1_txtTranAmt") WebElement amountox;
	public @FindBy (xpath="//select[@name=\"ctl00$ContentPlaceHolder1$ddlCrDr\"]\r\n"+ "") WebElement creditbox;
	public @FindBy (xpath="//select[@name=\"ctl00$ContentPlaceHolder1$ddlBank\"]") WebElement bankname;
	public @FindBy (id="ContentPlaceHolder1_ddlPaytype") WebElement invoicepay;
	public @FindBy (id="ContentPlaceHolder1_LinkButton7") WebElement clearButton1;
	public @FindBy (xpath="//button[@id=\"hdnclose\"]\r\n"+ "") WebElement backButton1;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_btnSubmit\"]\r\n"+ "") WebElement submitButton1;
	public @FindBy (id="ContentPlaceHolder1_LinkButton2") WebElement manualpay;
	public @FindBy (id="ContentPlaceHolder1_lnkbtnSaveTemp") WebElement saveButton1;
	public @FindBy (xpath="	//button[@onclick=\"CloseAlertmpealertPaynow()\"] \r\n"+ "") WebElement warningButton1;
	public @FindBy (id="hdnclosePayNw") WebElement backButton2;
	public @FindBy (id="ContentPlaceHolder1_txtAmount") WebElement monthlypay;
	public @FindBy (id="ContentPlaceHolder1_rblNSFpay") WebElement nsfButton;
	public @FindBy (id="ContentPlaceHolder1_txtAmount") WebElement nsfamount;
	public @FindBy (xpath="//input[@name=\"ctl00$ContentPlaceHolder1$txtReason\"]\r\n"+ "") WebElement reason;
	public @FindBy (id="ContentPlaceHolder1_LinkButton6") WebElement backButton3;
	public @FindBy (linkText="Tape Report") WebElement tapereports;
	public @FindBy (linkText="ACH Transaction") WebElement achtransaction;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkbtnSearchDate\"]\r\n"+ "") WebElement searchButton1;
	public @FindBy (xpath="	//a[@id=\"ContentPlaceHolder1_lnkFileLog\"]\r\n"+ "") WebElement filelog;
	public @FindBy (id="ContentPlaceHolder1_lnkbackDash") WebElement backButton4;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_LinkButton3\"]") WebElement excelexport;
	public @FindBy (id="ContentPlaceHolder1_gvACHTransaction_lnkEdit_2") WebElement customerviewButton1;
	public @FindBy (id="ContentPlaceHolder1_lnkbackoriginal") WebElement backButton5;
	public @FindBy (xpath="//a[@class=\"btn btn-primary btn-sm\"]"+ "") WebElement runreportButton1;
	public @FindBy (id="ContentPlaceHolder1_ddlclient") WebElement selectinstaller1;
	public @FindBy (id="ContentPlaceHolder1_dvActn") WebElement actionButton;
	public @FindBy (linkText="Invoice Log") WebElement invoicelog;
	public @FindBy (id="ContentPlaceHolder1_ddlStatus") WebElement selectstatus;
	public @FindBy (xpath="//a[@id=\"ContentPlaceHolder1_lnkExcel\"]") WebElement exportButton;
	public @FindBy (id="ContentPlaceHolder1_lnkPayUrl") WebElement paymenturl;
	public @FindBy (id="ContentPlaceHolder1_lnkDownload") WebElement downloadinvoiceButton;
	public @FindBy (id="ContentPlaceHolder1_lnkDownloadReceipt") WebElement invoicedownloadreceiptButton;
	public @FindBy (id="ContentPlaceHolder1_lnkDownloadAll") WebElement alldownloadButton;
	public @FindBy (id="ContentPlaceHolder1_gvInvoicelog_lnkEdit_0") WebElement customerviewButton2;
	public @FindBy (xpath="//div[@class=\"btn btn-primary btn-sm\"]\r\n"+ "") WebElement actionButton1;
	public @FindBy (id="ContentPlaceHolder1_lnkattemptlog") WebElement resendinvoice;
	public @FindBy (xpath="//input[@id=\"ContentPlaceHolder1_btnsendnvoice\"]\r\n"+ "") WebElement yesButton;
	public @FindBy (xpath="//button[@class=\"btn btn-light me-3\"] [@onclick=\"CloseConfirmInvoice()\"]") WebElement noButton;
	public @FindBy (id="ContentPlaceHolder1_lnkattemptlog") WebElement voidinvoice;
	public @FindBy (id="ContentPlaceHolder1_lnkPayReceipt") WebElement downloadinvoiceButton2;
	public @FindBy (id="ContentPlaceHolder1_LinkButton4") WebElement backButton6;
	public @FindBy (xpath="/html/body/form/div[3]/div/div[2]/div[2]/div[5]/div/div/div/div[2]/input]") WebElement yesButton1;
	public @FindBy (xpath="/html/body/form/div[3]/div/div[2]/div[2]/div[5]/div/div/div/div[2]/button") WebElement noButton1;
	public @FindBy (id="ContentPlaceHolder1_ddlclientfilter") WebElement selectinstaller2;
	public @FindBy (xpath="	//div[@class=\"btn btn-primary btn-sm h-35px\"]\r\n"+ "") WebElement actionButton2;
	public @FindBy (id="ContentPlaceHolder1_lnkrpt") WebElement downloadreportButton;

	
}
