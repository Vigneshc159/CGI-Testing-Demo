package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.repo.InstallerRepo;
import org.testng.annotations.Test;
import org.utility.PropertyFileReader;

public class InstallerActions extends InstallerRepo {
	public void IS01(WebDriver wb ) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		saveButton.click();
		warningButton.click();

	}
	public void IS02(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		clearButton.click();

	}
	public void IS03(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		enabledButton.click();
		saveButton.click();

	}
	public void IS04(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		//disabledButton.click();
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		disabledButton.click();
		saveButton.click();
		warningButton.click();
	}
	public void IS05(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		nameBox.sendKeys(name);
		//disabledButton.click();
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		fullviewButton.click();
		saveButton.click();
		warningButton.click();

	}
	public void IS06(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		addButton.click();
		backButton.click();
		addButton.click();

	}
	public void IS07(WebDriver wb) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		backButton2.click();

	}
	public void IS08(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		clearButton2.click();
	}

	public void IS09(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.clear();
		addressbox.sendKeys(adress);
		addressbox2.clear();
		addressbox2.sendKeys(adress2);
		cityName.clear();
		cityName.sendKeys(city);
		zipcodebox.clear();
		zipcodebox.sendKeys(zipcode);
		phonenumbox.clear();
		phonenumbox.sendKeys(phonenum);
		emailBox.clear();
		emailBox.sendKeys(email);
		updatedButton.click();;
		warningbutton4.click();

	}
	public void IS10(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		enabledButton.click();
		Select s2=new Select(countryName);
		s2.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s3=new Select(stateName);
		s3.selectByVisibleText("Alberta");
		addressbox.clear();
		addressbox.sendKeys(adress);
		addressbox2.clear();
		addressbox2.sendKeys(adress2);
		cityName.clear();
		cityName.sendKeys(city);
		zipcodebox.clear();
		zipcodebox.sendKeys(zipcode);
		phonenumbox.clear();
		phonenumbox.sendKeys(phonenum);
		emailBox.clear();
		emailBox.sendKeys(email);
		//enabledButton.click();
		updatedButton.click();
		warningbutton4.click();
	}


	public void IS11(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		disabledButton.click();
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.sendKeys(adress);
		addressbox2.sendKeys(adress2);
		cityName.sendKeys(city);
		zipcodebox.sendKeys(zipcode);
		phonenumbox.sendKeys(phonenum);
		emailBox.sendKeys(email);
		disabledButton.click();
		

	}
	public void IS12(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.clear();
		addressbox.sendKeys(adress);
		addressbox2.clear();
		addressbox2.sendKeys(adress2);
		cityName.clear();
		cityName.sendKeys(city);
		zipcodebox.clear();
		zipcodebox.sendKeys(zipcode);
		phonenumbox.clear();
		phonenumbox.sendKeys(phonenum);
		emailBox.clear();
		emailBox.sendKeys(email);
		fullviewButton.click();
		updatedButton.click();
		warningbutton4.click();
	}
	public void IS13(WebDriver wb,String name,String adress,String adress2,String city,String zipcode,String phonenum,String email) throws InterruptedException {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		editInstaller.click();
		nameBox.clear();
		nameBox.sendKeys(name);
		Select s=new Select(countryName);
		s.selectByVisibleText("CANADA");
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		Select s1=new Select(stateName);
		s1.selectByVisibleText("Alberta");
		addressbox.clear();
		addressbox.sendKeys(adress);
		addressbox2.clear();
		addressbox2.sendKeys(adress2);
		cityName.clear();
		cityName.sendKeys(city);
		zipcodebox.clear();
		zipcodebox.sendKeys(zipcode);
		phonenumbox.clear();
		phonenumbox.sendKeys(phonenum);
		emailBox.clear();
		emailBox.sendKeys(email);
		simpleviewButton.click();
	
	}

	public void IS14(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		addinvestment.click();
		backButton.click();
		
	}
	public void IS15(WebDriver wb,String trans ,String amoun) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		addinvestment.click();
		transactiondate.sendKeys(trans);
		amountbox.sendKeys(amoun);
		clearButton3.click();

	}
	public void IS16(WebDriver wb,String trans ,String amoun,String bank) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		addinvestment.click();
		transactiondate.sendKeys(trans);
		amountbox.sendKeys(amoun);
		banknameBox.sendKeys(bank);
		saveButton3.click();

	}

	public void IS17(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		addinvestment.click();
		//uploadFile.click();
		WebElement file_upload=wb.findElement(By.id("ContentPlaceHolder1_FUAttQuo"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");
	}
	public void IS18(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton.click();
		actionsButton.click();
		saveButton2.click();

	}
	public void IS19(WebDriver wb,String search) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		searchBox.sendKeys(search);

	}
	public void IS20(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		Select s=new Select(select1);
		s.selectByVisibleText("DISABLED");
	}
	public void IS21(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton2.click();
		investmenteditButton.click();
		backButton.click();

	}
	public void IS22(WebDriver wb,String transdate ,String invesamount) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton2.click();
		investmenteditButton.click();
		transactiondate.sendKeys(transdate);
		amountbox.sendKeys(invesamount);
		clearButton3.click();

	}
	public void IS23(WebDriver wb,String transdate ,String invesamount) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton2.click();
		investmenteditButton.click();
		transactiondate.sendKeys(transdate);
		amountbox.clear();
		amountbox.sendKeys(invesamount);
		updatedButton2.click();

	}
	public void IS24(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton2.click();
		investmenteditButton.click();
		WebElement file_upload=wb.findElement(By.id("ContentPlaceHolder1_FUAttQuo"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");

	}
	
	public void IS25(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		moduleinstaller.click();
		usereditButton2.click();
		banksetupAcces.click();
		tickbutton.click();
		updatedButton3.click();
		warningButton1.click();

	}
	public void IS26(WebDriver wb,String installername) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		searchBox1.sendKeys("suriya s");
		Select s=new Select(selectdropdown);
		s.selectByVisibleText("ENABLED");
		Select s1=new Select(selectdropdown);
		s1.selectByVisibleText("DISABLED");
		Select s2=new Select(selectdropdown);
		s2.selectByVisibleText("ENABLED");
				
}
	public void IS27(WebDriver wb,String groname) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		addButton.click();
		Select s=new Select(selectclientname);
		s.selectByVisibleText("Test Client");
		groupname.sendKeys("lasolar");
		clearButton3.click();
		
}

	public void IS28(WebDriver wb,String groname) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		addButton.click();
		Select s=new Select(selectclientname);
		s.selectByVisibleText("Test Client");
		groupname.sendKeys("Test Group1");
		saveButton.click();


}
	public void IS29(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		addButton.click();
		backButton.click();
		addButton.click();
		
	
}
	public void IS30(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		installereditButton.click();
		Select s=new Select(selectclientname);
		s.selectByVisibleText("Test Client");
		groupname.clear();
		groupname.sendKeys("Test Group");
		clearButton3.click();
		
}
	public void IS31(WebDriver wb,String groname1) {
		wb.findElement(By.id("DivSetup")).click();
		customergroup.click();
		installereditButton.click();
		Select s=new Select(selectclientname);
		s.selectByVisibleText("Test Client");
		groupname.clear();
		groupname.sendKeys("Test Group");
		updatedButton4.click();
		warningButton3.click();
		
}
	public void IS32(WebDriver wb) {
		wb.findElement(By.id("DivSetup")).click();
		nsfsetup.click();
		searchBox1.sendKeys("suriya s");
		Select s=new Select(selectinstaller2);
		s.selectByVisibleText("Test Client");
}
	public void IS33(WebDriver wb,String amoun ) {
		wb.findElement(By.id("DivSetup")).click();
		nsfsetup.click();
		addnsf.click();
		Select s=new Select(selectinstaller);
		s.selectByIndex(3);
		Select s1=new Select(attemptsselect);
		s1.selectByIndex(4);
		Select s2=new Select(intervelselect);
		s2.selectByIndex(7);
		amountbox2.sendKeys("amoun");
		clearButton4.click();
	
}
	
	public void IS34(WebDriver wb,String amoun ) {
		wb.findElement(By.id("DivSetup")).click();
		nsfsetup.click();
		addnsf.click();
		Select s=new Select(selectinstaller);
		s.selectByIndex(3);
		Select s1=new Select(attemptsselect);
		s1.selectByIndex(4);
		Select s2=new Select(intervelselect);
		s2.selectByIndex(7);
		amountbox2.sendKeys("300");
		saveButton.click();
		warningButton.click();
}
	public void IS35(WebDriver wb ) {
		wb.findElement(By.id("DivSetup")).click();
		nsfsetup.click();
		nsfeditButton.click();
		Select s1=new Select(attemptsselect);
		s1.selectByIndex(3);
		updatedButton4.click();
		warningButton3.click();

}
	public void IS36(WebDriver wb ) {
		wb.findElement(By.id("DivSetup")).click();
		nsfsetup.click();
		nsfeditButton.click();
		backButton3.click();
}
}
