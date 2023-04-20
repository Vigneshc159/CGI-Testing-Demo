package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.InvestorRepo;


public class InvestorActions extends InvestorRepo{
	public void inv01(WebDriver wb) {
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
	}
	public void inv02(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		addinv.click();
		//invname.sendKeys(Invname);
		saveButton.click();
		okwarning.click();
		
	}
	public void inv03(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		addinv.click();
		invname.sendKeys(Invname);
		clearButton.click();
		
	}
	public void inv04(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		addinv.click();
		backButton.click();
		addinv.click();
		
	}
	public void inv05(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		addinv.click();
		invname.sendKeys(Invname);
		saveButton.click();
		okwarning.click();
		
		
	}
	public void inv06(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		updateButton.click();
		updatesuccessButton.click();
		
	}
	public void inv07(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		clearButton.click();
		
	}
	public void inv08(WebDriver wb,String Invname) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		editInv.click();
		backButton.click();
		
	}
	public void inv09(WebDriver wb,String tranamt) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		addTrans.click();
		Actions act=new Actions(wb);
		Thread.sleep(10000);
		act.clickAndHold(wb.findElement(By.id("ContentPlaceHolder1_txttransdat"))).build().perform();
		act.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_days"))).build().perform();
		transamt.sendKeys(tranamt);
		WebElement file_upload=wb.findElement(By.id("ContentPlaceHolder1_dvfileupload"));
		file_upload.sendKeys("D:\\UPLOAD\\train.pdf");
		saveButton.click();
		
	}
	public void inv10(WebDriver wb,String tranamt) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		addTrans.click();
		Actions act=new Actions(wb);
		Thread.sleep(10000);
		act.clickAndHold(wb.findElement(By.id("ContentPlaceHolder1_txttransdat"))).build().perform();
		act.click(wb.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_days"))).build().perform();
		transamt.sendKeys(tranamt);
		tranclearButton.click();
		
	}
	public void inv11(WebDriver wb,String tranamt,String transdate) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		addTrans.click();
		transamt.sendKeys(tranamt);
		trandateButton.sendKeys(transdate);
		tranbackButton.click();
		//addTrans.click();
		
	}
	
	public void inv12(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
	
}
	
	public void inv13(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		eportexccelButton.click();
	
}
	
	public void inv14(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		investorbackButton.click();
}
	public void inv15(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
		actionButton.click();
		addcustomersButton.click();
		Select s= new Select(selectinstallerButton);
		s.selectByVisibleText("PowerFund 31");
		selectallButton.click();
		actionButton.click();
		saveButton2.click();
		warningButton.click();
		customereditButton.click();
		selectallButton.click();
		selectallButton.click();
		actionButton.click();
		customerupdatedButton.click();
		warningButton.click();

}
	public void inv16(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		Ronnieedit.click();
		actionButton.click();
		customersButton.click();
		actionButton.click();
		backButton1.click();
	}
	
	public void inv17(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		wb.findElement(By.linkText("Setup")).click();
		Investor.click();
		excelButton.click();
		
}
	public void inv18(WebDriver wb,String UserName1,String userlastnam) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuserButton.click();
		addinv.click();
		usernameButton.sendKeys("suriya");
		userlastnameButton.sendKeys("s");
		Select s= new Select(selectusertypeButton);
		s.selectByIndex(4);
		Select s1= new Select(selectinvestorButton);
		s1.selectByIndex(1);
		
}
	public void inv19(WebDriver wb)   {
		
		
		
		
	}
	
	public void inv20(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		transactioneditButton.click();
		updateButton.click();
		warningButton1.click();
}	
	public void inv21(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		transactioneditButton.click();
		backButton.click();
}
	public void inv22(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		investordownloadButton.click();
}
	public void inv23(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		customers.click();
		customerseditButton.click();
		clickCustomer.click();
		clickCustomer.click();
		actionButton.click();
		updateButton1.click();

}

	public void inv24(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		customers.click();
		actionButton.click();
		customersaddButton.click();
		Select s=new Select(selectinstaller);
		s.selectByIndex(3);
		clickCustomer2.click();
		actionButton.click();
		saveButton3.click();
		warningButton2.click();
	
	}
	
	public void inv25(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		actionButton.click();
		document.click();
		actionButton.click();
		adddocumentButton.click();
		saveButton.click();
		warningButton4.click();
	
	}
		

	public void inv26(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		document.click();
		documentviewButton.click();
		updatedButton2.click();
		warningButton3.click();
	
}

	public void inv27(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		document.click();
		documentviewButton.click();
		backButton.click();
	
	}
	public void inv28(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();
		document.click();
		documentdownloadButton.click();
	
}
	public void inv29(WebDriver wb,String filenam) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		actionButton.click();
		document.click();
		actionButton.click();
		adddocumentButton.click();
		filenamebox.sendKeys("filenam");
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("D:\\UPLOAD\\train.pdf");
		saveButton4.click();
		
	}
	public void inv30(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		newfeeds.click();
		documentviewButton2.click();
		updatedButton4.click();
		warningButton5.click();
	
	}
	public void inv31(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		newfeeds.click();
		actionButton.click();
		addnewfeedsButton.click();
		saveButton5.click();
		warningButton6.click();
	}
	public void inv32(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		newfeeds.click();
		needsviewButton.click();
		backButton3.click();
	
}
	public void inv33(WebDriver wb,String tit,String newfeed){
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		newfeeds.click();
		actionButton.click();
		addnewfeedsButton.click();
		title.sendKeys(tit);
		newsfeedtextbox.sendKeys(newfeed);
		saveButton5.click();
		warningButton6.click();
}
	public void inv34(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		wb.findElement(By.linkText("Investor")).click();
		editinvestorButton.click();	
		investorreprsentative.click();
		clickCustomer3.click();
		clickCustomer3.click();
		actionButton.click();
		submitButton.click();
		warningButton2.click();
		
}
	
	
}