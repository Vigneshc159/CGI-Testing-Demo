package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.repo.BankRepo;

public class BankActions extends BankRepo {
	public void bs01(WebDriver wb ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		//admin.click();
		banksetup.click();
		addButton.click();
		saveButton.click();
		warningButton1.click();
		
	}
	
	public void bs02(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		//admin.click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		clear.click();
	  
	}
	public void bs03(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		//admin.click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		Select s=new Select(accountGroup);
		s.selectByVisibleText("CGI Testing");
		disAble.click();
		saveButton.click();
		warningButton1.click();
	
		
	}
	public void bs04(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		addgroupButton1.click();
		accountGroup1.sendKeys("CGI Testing");		
		saveButton1.click();
		warningButton.click();
		saveButton.click();
	}
	public void bs05(WebDriver wb,String accname,String accnumber, String accnum1) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		addgroupButton1.click();
		accountGroup1.sendKeys("LAS Powerfund");
	    saveButton1.click();
	    warningButton.click();
	    
	}
	
	public void bs06(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		Select s=new Select(accountGroup);
		s.selectByVisibleText("CGI Testing");
		editButton.click();
	}
	
	public void bs07(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		Select s=new Select(accountGroup);
		s.selectByVisibleText("CGI Testing");
		noathuorizeButton.click();
		saveButton.click();
	}
	
	public void bs08(WebDriver wb,String accname,String accnumber) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		banksetup.click();
		addButton.click();
		accountName.sendKeys(accname);
		accountNumber.sendKeys(accnumber);
		Select s=new Select(accountGroup);
		s.selectByVisibleText("CGI Testing");
		yesathuorizeButton.click();
		athuorizeaccountName.click();
		Select se=new Select(athuorizeaccountName);
		s.selectByValue("3");
		saveButton.click();
		
	}
	
	public void bs09(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		banksetup.click();
		editButton1.click();
		backButton.click();
		
	}
	
	public void bs10(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		banksetup.click();
		Select se=new Select(selectButton);
		se.selectByVisibleText("DISABLED");
		editButton1.click();
	}
	
	public void bs11(WebDriver wb, String locaName) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		banksetup.click();
		Select se=new Select(selectButton);
		se.selectByVisibleText("ENABLED");
		editButton2.click();
		locationName.sendKeys("locaName");
		updateButton.click();
	}
	
	public void bs12(WebDriver wb, String locaName) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		banksetup.click();
		Select se=new Select(selectButton);
		se.selectByVisibleText("ENABLED");
		editButton2.click();
		locationName.sendKeys("locaName");
		clear.click();
}
	public void bs13(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();		
		banksetup.click();
		editButton2.click();
		backButton.click();
	}
	public void bs14(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		addButton.click();
		saveButton.click();
		
	}
	
	public void bs15(WebDriver wb,String accnam1,String trankey,String loginid) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		addButton.click();
		accountName1.sendKeys(accnam1);
		transactionKey.sendKeys(trankey);
		loginId.sendKeys(loginid);
		runningButton.click();
		saveButton.click();
	
	}
	public void bs16(WebDriver wb,String accnam1,String trankey,String loginid) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		addButton.click();
		accountName1.sendKeys(accnam1);
		transactionKey.sendKeys(trankey);
		loginId.sendKeys(loginid);
		stopButton.click();
		saveButton.click();		

}
	public void bs17(WebDriver wb,String accnam1,String trankey,String loginid) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		addButton.click();
		accountName1.sendKeys(accnam1);
		transactionKey.sendKeys(trankey);
		loginId.sendKeys(loginid);
		clear.click();
	
	}
	
	public void bs18(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		addButton.click();
		actionButton.click();
		backButton1.click();
	
	}
	public void bs19(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		editButton3.click();
		backButton2.click();
	
}	
	
	public void bs20(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		editButton3.click();
		clearButton2.click();
		backButton2.click();

}		
	
	public void bs21(WebDriver wb,String accnam1) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();	
		AuthorizedNet.click();
		editButton3.click();
		//clearButton2.click();
		accountName2.sendKeys(accnam1);
		updateButton1.click();
	
}		
	public void bs22(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		iPWhitelist.click();
		Select se=new Select(selectButton);
		se.selectByVisibleText("DISABLED");
		searchButton.click();
	
	}
	
	public void bs23(WebDriver wb,String IPaddress,String Responsibleperson,String Locaname ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		iPWhitelist.click();
		addButton.click();
		ipAddressName.sendKeys(IPaddress);
		responsiblepersonName.sendKeys(Responsibleperson);
		iplocationName1.sendKeys(Locaname);
		enAbledButton.click();
		saveButton.click();
		
	}
	public void bs24(WebDriver wb,String IPaddress,String Responsibleperson,String Locaname ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		iPWhitelist.click();
		addButton.click();
		ipAddressName.sendKeys(IPaddress);
		responsiblepersonName.sendKeys(Responsibleperson);
		iplocationName1.sendKeys(Locaname);
		disAble.click();
		warningButton1.click();
		saveButton.click();
}
	public void bs25(WebDriver wb ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		iPWhitelist.click();
		addButton.click();
		backButton.click();
		addButton.click();
	}
	
	

	public void bs26(WebDriver wb,String IPaddress,String Responsibleperson,String Locaname ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		iPWhitelist.click();
		addButton.click();
		ipAddressName.sendKeys(IPaddress);
		responsiblepersonName.sendKeys(Responsibleperson);
		iplocationName1.sendKeys(Locaname);
		clear.click();

}
	public void bs27(WebDriver wb ,String username ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		userlog.click();
		searchBox.sendKeys(username);
		searchButton1.click();
	
}
	public void bs28(WebDriver wb ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		userlog.click();
		viewButton.click();
}	
	public void bs29(WebDriver wb) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		userlog.click();
		viewButton.click();
		backButton3.click();
		viewButton.click();
}
	public void bs30(WebDriver wb,String username2) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		eventLog.click();
		searchBox2.sendKeys(username2);
		searchButton1.click();
	}	
	public void bs31(WebDriver wb ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		eventLog.click();
		viewButton1.click();
	}
	public void bs32(WebDriver wb ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		eventLog.click();
		viewButton1.click();
		backButton.click();
		viewButton1.click();
	}
	
	public void bs33(WebDriver wb,String modulename ) {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		expectionLog.click();
		searchBox3.sendKeys(modulename);
		searchButton1.click();
		
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		

		
	


	

	

