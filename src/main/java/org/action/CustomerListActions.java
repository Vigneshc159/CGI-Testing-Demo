package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.repo.CustomerListRepo;

public class CustomerListActions extends CustomerListRepo{
	
	public  void cs01(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		
	}
	public  void cs02(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		actionButton.click();
		saveButton.click();
		warningButton.click();
	}


	public  void cs03(WebDriver wb,String cusid,String cusnam ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		actionButton.click();
		clearbutton.click();
	}

	public  void cs04(WebDriver wb,String cusid,String cusnam,String monthlypay,String totalyear,String escala,String totalconamount,String ph,String em) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		monthlypaymentbox.sendKeys(monthlypay);
		totalyears.sendKeys(totalyear);
		escalation.sendKeys(escala);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		//	actionButton.click();
		saveButton.click();
		warningButton.click();

	}
	public  void cs05(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		actionButton.click();
		backButton.click();

	}

	public  void cs06(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		saveButton1.click();
	}

	public  void cs07(WebDriver wb,String port ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		clearButton1.click();

	}
	public  void cs08(WebDriver wb,String port ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		saveButton1.click();
		//warningButton1.click();
	}
	public  void cs09(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customeraddButton.click();
		backButton1.click();

	}

	public  void cs10(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customereditButton.click();
		updatedButton.click();
		warningButton1.click();
	}
	public  void cs11(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		customereditButton.click();
		backButton1.click();
	}

	public  void cs12(WebDriver wb,String cusid,String cusnam,String monthlypay,String totalyear,String escala,String totalconamount,String ph,String em ) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		monthlypaymentbox.sendKeys(monthlypay);
		totalyears.sendKeys(totalyear);
		escalation.sendKeys(escala);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		//actionButton.click();
		saveButton.click();
		warningButton.click();
	}
	public  void cs13(WebDriver wb,String cusid,String cusnam,String totalconamount,String ph,String em) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		prepaidButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		saveButton.click();
		warningButton.click();

	}
	public  void cs14(WebDriver wb,String cusid,String cusnam,String monthlypay,String totalyear,String escala,String totalconamount,String ph,String em) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		manualpayButton.click();
		customerid.sendKeys(cusid);
		customername.sendKeys(cusnam);
		Select s=new Select(selectclient);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		monthlypaymentbox.sendKeys(monthlypay);
		totalyears.sendKeys(totalyear);
		escalation.sendKeys(escala);
		totalcontractamount.sendKeys(totalconamount);
		phonenum.sendKeys(ph);
		email.sendKeys(em);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		saveButton.click();
		warningButton.click();

	}

	public  void cs15(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		addButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton.click();
	}
	public  void cs16(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		addnotesButton.click();
		saveButton2.click();
		warningButton2.click();

	}

	public  void cs17(WebDriver wb,String note)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		addnotesButton.click();
		notes.sendKeys(note);
		clearButton2.click();


	}
	public  void cs18(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		addnotesButton.click();
		wb.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[4]/div  [1]/div[3]/div/div/div[1]/div/button")).click();
	}
	public  void cs19(WebDriver wb,String note)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		addnotesButton.click();
		notes.sendKeys(note);
		saveButton2.click();
	}
	public  void cs20(WebDriver wb )  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		actionButton.click();
		clearbutton.click();
		actionButton.click();
		updatedButton1.click();
		warningButton2.click();

	}
	public  void cs21(WebDriver wb,String ph) throws InterruptedException  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		phonenum.sendKeys(ph);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		clearbutton.click();
	}

	public  void cs22(WebDriver wb )  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		actionButton.click();
		backButton.click();

	}
	public  void cs23(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customeraddButton.click();
		saveButton1.click();
	}
	public  void cs24(WebDriver wb,String port) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		clearButton1.click();

	}
	public  void cs25(WebDriver wb,String port) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customeraddButton.click();
		portfolioBox.sendKeys(port);
		saveButton1.click();
	}
	public  void cs26(WebDriver wb) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customeraddButton.click();
		backButton1.click();
	}
	public  void cs27(WebDriver wb) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customereditButton.click();
		updatedButton.click();
		warningButton1.click();
	}
	public  void cs28(WebDriver wb) {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Select s1=new Select(selectclient);
		s1.selectByVisibleText("Test Client");
		Select s2=new Select(selectcustomer);
		s2.selectByIndex(1);
		customereditButton.click();
		backButton1.click();
	}


	public  void cs29(WebDriver wb,String ph) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		ltfButton.click();
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		phonenum.sendKeys(ph);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		updatedButton1.click();
		warningButton1.click();


	}
	public  void cs30(WebDriver wb,String ph) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		prepaidButton.click();
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		phonenum.sendKeys(ph);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		updatedButton1.click();
		warningButton1.click();


	}
	public  void cs31(WebDriver wb,String ph) throws InterruptedException {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		manualpayButton.click();
		Select s1=new Select(selectcustomer);
		s1.selectByIndex(1);
		phonenum.sendKeys(ph);
		JavascriptExecutor jse = (JavascriptExecutor)wb;
		jse.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		updatedButton1.click();
		warningButton1.click();
	}

	public  void cs32(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
		actionButton.click();
		editcustomerButton1.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton.click();
	}
	
	public  void cs33(WebDriver wb,String ph)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		editcustomerButton1.click();
		phonenum.clear();
		phonenum.sendKeys(ph);
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		updatedButton1.click();
		warningButton1.click();
		
	}

	public  void cs34(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		editpaymentscheduleButton.click();
		updatedButton2.click();
		warningButton1.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
	
}
	public  void cs35(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		mergecustomerButton.click();
		actionButton.click();
        //mergeButton.click();
		//backButton2.click();
	
}
	public  void cs36(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		mergecustomerButton.click();
		agreeButton.click();
		mergeButton.click();
		warningButton2.click();
}

	public  void cs37(WebDriver wb,String customercrm)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		mergecustomerButton.click();
		Select s1=new Select(selectmeergecustomerButton);
		s1.selectByIndex(6);
		//customeridcrm.clear();
		//customeridcrm.sendKeys(customercrm);
		agreeButton.click();
		mergeButton.click();
		warningButton3.click();
	
}
	public  void cs38(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		viewreceivedpaymentButton.click();
		//printButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
}   
	public  void cs39(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		editmonthlypaymentButton.click();
		save1Button.click();
		warningButton2.click();
		
}
	public  void cs40(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		editmonthlypaymentButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
	
}
	public  void cs41(WebDriver wb,String monthpay,String reas )  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		editmonthlypaymentButton.click();
		monthlypay.sendKeys(monthpay);
		Actions a1 = new Actions(wb);
		a1.clickAndHold(wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtEffFrom\"]"))).build().perform();
		a1.click(wb.findElement(By.id("calendar1_today"))).build().perform();
		reason.sendKeys(reas);
		save1Button.click();
		warningButton3.click();

}
	public  void cs42(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
//		editcustomerButton2.click();
//		actionButton.click();
//		crmmontoringButton.click();
//		updatedButton3.click();
//		warningButton1.click();

}	
	
	public  void cs43(WebDriver wb,String producatioescaltion)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		crmmontoringButton.click();
		Select s1=new Select(crm);
		s1.selectByIndex(2);
		Select s2=new Select(crmname);
		s2.selectByIndex(4);
		producationescalation.clear();
		producationescalation.sendKeys(producatioescaltion);
		updatedButton3.click();
		warningButton3.click();
	
}	
	public  void cs44(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		crmmontoringButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
	
}
	public  void cs45(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		documentsetupButton.click();
		saveButton3.click();
		warningButton2.click();
	
}
	public  void cs46(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		documentsetupButton.click();
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");	
		saveButton3.click();
		warningbutton4.click();

	}
	
	public  void cs47(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		documentsetupButton.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
	
}
	public  void cs48(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton.click();
//		actionButton.click();
//		escalationprogram.click();
//		rebootButton.click();
//		agreedButton.click();
		//submitButton.click();
		//warningbutton3.click();
		//warningButton3.click();
	
}

	public  void cs49(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		escalationprogram.click();
		Actions a1 = new Actions(wb);
		a1.click(wb.findElement(By.xpath("//div[@class=\"btn btn-primary btn-sm h-35px\"]"))).build().perform();
		backButton2.click();
		
}
	public  void cs50(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		list.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		searchButton.click();
		editcustomerButton2.click();
		actionButton.click();
		backButton3.click();
		
	}	
	public  void cs51(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		achform.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(achpending);
		s1.selectByVisibleText("ACH Pending");
		searchButton1.click();
}
	
	public  void cs52(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		achform.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(achpending);
		s1.selectByVisibleText("ACH Pending");
		searchButton1.click();
		acheditcustomerButton.click();
		updatedButton4.click();
		rebootButton.click();
		agreedButton.click();
		agreedButton1.click();
		updatedButton1.click();
		warningbutton5.click();
}
	public  void cs53(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		achform.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(achpending);
		s1.selectByVisibleText("ACH Pending");
		searchButton1.click();
		acheditcustomerButton.click();
		updatedButton4.click();
		backButton.click();
}
	public  void cs54(WebDriver wb)  {
		wb.findElement(By.id("DivCustomer")).click();
		achform.click();
		Select s=new Select(selectinstaller);
		s.selectByVisibleText("Test Client");
		Select s1=new Select(achpending);
		s1.selectByVisibleText("ACH Pending");
		searchButton1.click();
		acheditcustomerButton.click();
		updatedButton4.click();
		WebElement file_upload=wb.findElement(By.id("ContentPlaceHolder1_dvfileupload"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");	
		Select s2=new Select(accounttype);
		s2.selectByVisibleText("Checking ");
		
	
}
}