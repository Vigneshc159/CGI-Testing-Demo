package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.repo.CustomerRepo;
import org.testng.annotations.Test;
import org.utility.PropertyFileReader;



public class CustomerActions extends CustomerRepo{
	
	public  void cs01(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		submitButton.click();
		warningButton1.click();
	
	}


	public  void cs02(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");
	}
	
	public  void cs03(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		Actions a1 = new Actions(wb);
		a1.clickAndHold(wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtMonth\"]\r\n"+ ""))).build().perform();
		a1.click(wb.findElement(By.id("calendar1_today"))).build().perform();
		
	}
	
	public  void cs04(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		samplefileButton.click();
		//warningButton1.click();
	}

	public  void cs05(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		achformsetupButton.click();

	}
	
	public  void cs06(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		achuplaod.click();
		Select s=new Select(selectinstaller1);
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");
		submitButton.click();

	}
	

	public  void cs07(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		excelupload.click();
		//submitButton.click();
		//warningButton1.click();
	}
	
	public  void cs08(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		excelupload.click();
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");
	}
	
	public  void cs09(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		excelupload.click();
		Actions a1 = new Actions(wb);
		a1.clickAndHold(wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_txtMonth\"]\r\n"+ ""))).build().perform();
		a1.click(wb.findElement(By.id("calendar1_today"))).build().perform();
		
	}
	
	public  void cs10(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		excelupload.click();
		samplefileButton.click();
		//warningButton1.click();
	}

	public  void cs11(WebDriver wb ) {
		wb.findElement(By.id("DivCustomer")).click();
		excelupload.click();
		Select s=new Select(selectinstaller1);
		s.selectByVisibleText("Test Client");
		WebElement file_upload=wb.findElement(By.xpath("//input[@id=\"ContentPlaceHolder1_FUAttQuo\"]"));
		file_upload.sendKeys("C:\\UPLOAD\\train.pdf");
		submitButton.click();

	}
	
}



