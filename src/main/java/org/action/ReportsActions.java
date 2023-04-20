package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.repo.ReportsRepo;

public class ReportsActions extends ReportsRepo {
	public void rs01(WebDriver wb ) {
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
	}

	public void rs02(WebDriver wb ) {
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		excelButton.click();
	}



	public void rs03(WebDriver wb ) {
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		addnotesButton.click();
		saveButton2.click();
		warningButton.click();
	}

	public void rs04(WebDriver wb,String cusnotes ) {
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		addnotesButton.click();
		customertextbox.sendKeys(cusnotes);
		clearButton.click();
	}
	public void rs05(WebDriver wb ) {
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		addnotesButton.click();
		wb.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div/div/div[1]/div[3]/div/div/div[1]/div/button")).click();

	}

	public void rs06(WebDriver wb,String cusnotes){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		addnotesButton.click();
		customertextbox.sendKeys(cusnotes);
		saveButton.click();
		//	warningButton.click();

	}
	public void rs07(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		viewlogButton.click();
		backButton.click();

	}
	public void rs08(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		addreceivedpaymentButton.click();
		submitButton.click();

	}

	public void rs09(WebDriver wb,String transdis){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		addreceivedpaymentButton.click();
		Actions a2 = new Actions(wb);
		a2.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtduemonth\"]"))).build().perform();
		a2.click(wb.findElement(By.id("calendar4_container"))).build().perform();
		Actions a3 = new Actions(wb);
		a3.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtTranDate\"]"))).build().perform();
		a3.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_today"))).build().perform();
		transactiondescriptionBox.sendKeys(transdis);
		Select s4=new Select(bankname);
		s4.selectByIndex(2);
		clearButton1.click();

	}
	public void rs10(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		addreceivedpaymentButton.click();
		backButton1.click();
	}
	public void rs11(WebDriver wb,String transdis){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		addreceivedpaymentButton.click();
		Actions a2 = new Actions(wb);
		a2.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtduemonth\"]"))).build().perform();
		a2.click(wb.findElement(By.id("calendar4_container"))).build().perform();
		Actions a3 = new Actions(wb);
		a3.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtTranDate\"]"))).build().perform();
		a3.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender2_today"))).build().perform();
		transactiondescriptionBox.sendKeys(transdis);
		Select s4=new Select(bankname);
		s4.selectByIndex(2);
		submitButton1.click();
		warningButton.click();
	}
	public void rs12(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		saveButton1.click();
		warningButton1.click();
	}
	public void rs13(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		backButton2.click();
	}
	public void rs14(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		Actions a2 = new Actions(wb);
		a2.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtEffFrom\"]"))).build().perform();
		a2.click(wb.findElement(By.id("calendar3_today"))).build().perform();
	}


	public void rs15(WebDriver wb,String monthpay){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		monthlypay.sendKeys(monthpay);

	}
	public void rs16(WebDriver wb ){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		Actions a2 = new Actions(wb);
		a2.clickAndHold(wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtSchduleDate\"]"))).build().perform();
		a2.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_today"))).build().perform();
	}
	public void rs17(WebDriver wb,String amount ){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		nsfButton.click();
		nsfamount.sendKeys(amount);

	}
	public void rs18(WebDriver wb,String monthpay,String reaso ){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		manualpay.click();
		Actions a2 = new Actions(wb);
		a2.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtEffFrom\"]"))).build().perform();
		a2.click(wb.findElement(By.id("calendar3_today"))).build().perform();
		monthlypay.sendKeys(monthpay);
		reason.sendKeys(reaso);
		Actions a3 = new Actions(wb);
		a3.clickAndHold(wb.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtSchduleDate\"]"))).build().perform();
		a3.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_today"))).build().perform();
		saveButton1.click();
		warningButton1.click();
	}
	public void rs19(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		osreports.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		runreportButton.click();
		customerviewButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton3.click();
	}		
	public void rs20(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		tapereports.click();
		Select s=new Select(selectinstaller1);
		s.selectByVisibleText("Test Client");
		downloadreportButton.click();
		runreportButton1.click();

	}

	public void rs21(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		achtransaction.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton1.click();

	}
	public void rs22(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		achtransaction.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton1.click();
		actionButton.click();
		filelog.click();
		Actions a2 = new Actions(wb);
		a2.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton4.click();

	}
	public void rs23(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		achtransaction.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton1.click();
		actionButton.click();
		
		excelexport.click();

	}
	public void rs24(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		achtransaction.click();
		actionButton.click();
		backButton4.click();

	}
	public void rs25(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		achtransaction.click();
		customerviewButton1.click();
		backButton5.click();
	}
	
	public void rs26(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		
}
	public void rs27(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller2);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		exportButton.click();
		
}
	public void rs28(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		paymenturl.click();
	
	}

	public void rs29(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		paymenturl.click();
		actionButton1.click();
		downloadinvoiceButton.click();
		
	}
	
	public void rs30(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		paymenturl.click();
		actionButton1.click();
		invoicedownloadreceiptButton.click();
}
	public void rs31(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller2);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		paymenturl.click();
		actionButton1.click();
		alldownloadButton.click();
	
}
	public void rs32(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		resendinvoice.click();
		yesButton.click();
	
}
	public void rs33(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		resendinvoice.click();
		noButton.click();
		
}

	public void rs34(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		yesButton.getClass();
		voidinvoice.click();
		yesButton1.click();
	
	}
	
	public void rs35(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		voidinvoice.click();
		noButton1.click();
	
	}


	public void rs36(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		downloadinvoiceButton2.click();
	
}
	public void rs37(WebDriver wb){
		wb.findElement(By.id("DivReports")).click();
		invoicelog.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectstatus);
		s1.selectByVisibleText("All");
		searchButton1.click();
		customerviewButton2.click();
		actionButton2.click();
		backButton6.click();
	
}
}