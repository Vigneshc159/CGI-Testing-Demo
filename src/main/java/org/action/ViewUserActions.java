package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.repo.ViewUser_Repo;

public class ViewUserActions  extends ViewUser_Repo{

	public void au01(WebDriver wb) throws InterruptedException {
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		//wb.findElement(By.linkText("View users")).click();
		Search.sendKeys("Vignesh Murugan");
		Select s1=new Select(statusDD);
		s1.selectByVisibleText("ENABLED");
		Select s2=new Select(status2DD);
		s2.selectByVisibleText("All");
		searchButton.click();
		DDedit.click();

	}
	public void au02(WebDriver wb) throws InterruptedException {
		//admin.click();
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		//wb.findElement(By.linkText("View users")).click();
		addButton.click();
		addsaveButton.click();
		addsavewarButton.click();
	}
	public void au03(WebDriver wb,String first,String second) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		addButton.click();
		firstname.sendKeys(first);
		lastname.sendKeys(second);
		clearButton.click();
	}
	public void au04(WebDriver wb,String first,String second) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		addButton.click();
		firstname.sendKeys(first);
		lastname.sendKeys(second);
		addUsersBackButton.click();
		addButton.click();
	}
	public void au05(WebDriver wb,String first,String second,String Email,String Userrole,String phone) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		addButton.click();
		firstname.sendKeys(first);
		lastname.sendKeys(second);
		email.sendKeys(Email);
		userrole.sendKeys(Userrole);
		phonenum.sendKeys(phone);
		addsaveButton.click();
		addsavewarButton.click();
	}
	public void au06(WebDriver wb,String first,String second,String Email,String Userrole,String phone) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		addButton.click();
		firstname.sendKeys(first);
		lastname.sendKeys(second);
		email.sendKeys(Email);
		userrole.sendKeys(Userrole);
		installeruser.click();
		Select s1=new Select(installeruserDD);
		s1.selectByVisibleText("CGI");
		phonenum.sendKeys(phone);
		addsaveButton.click();
		addsavewarButton.click();
	}
	public void au011(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		DDedit.click();
		emailedit.click();
		emailbackButton.click();
		emailedit.click();
		
		
	}
	public void au012(WebDriver wb,String Newpassword,String conNewpassword) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		searchButton.click();
		DDedit.click();
		passwordedit.click();
		newpassword.sendKeys(Newpassword);
		connewpassword.sendKeys(conNewpassword);
		resetButton.click();
//		addsavewarButton.click();

		
		
		
	}
	public void au013(WebDriver wb) throws InterruptedException {

		wb.findElement(By.id("ContentPlaceHolder1_lnktotalACH")).click();
		
		
		
	}
	public void au014(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		searchButton.click();
		DDedit.click();
		passwordedit.click();
		Thread.sleep(10000);
		passwordbackButton.click();
		
		
		
		
		
	}
	public void au015(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		searchButton.click();
		DDedit.click();
		status.click();
		Disableyes.click();
		statusupdate.click();
		statusupdatemsg.click();
			
	}
	public void au016(WebDriver wb) throws InterruptedException {

		//wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		//viewuser.click();
		
			
	}
	public void au019(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		Select s1=new Select(statusDD);
		s1.selectByVisibleText("DISABLED");
		searchButton.click();
		DDedit.click();
		status.click();
		Disableyes.click();
		statusupdate.click();
		statusupdatemsg.click();
			
	}
	public void au020(WebDriver wb) throws InterruptedException {

		wb.findElement(By.id("ContentPlaceHolder1_lnktotalACH")).click();
		
		
			
	}
	public void au021(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		status.click();
		statusBackButton.click();
		status.click();
			
	}
	public void au022(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		twofa.click();
		twofaYEs.click();
		emailclick.click();
		twofaupdate.click();
		statusupdatemsg.click();
			
	}
	public void au023(WebDriver wb) throws InterruptedException {

		twobackButton.click();
		
		
			
	}
	public void au024(WebDriver wb) throws InterruptedException {

		
		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		twofa.click();
		twofaNO.click();
		twofaupdate.click();
		statusupdatemsg.click();
		
		
			
	}
	public void au025(WebDriver wb) throws InterruptedException {

		wb.findElement(By.id("ContentPlaceHolder1_lnktotalACH")).click();
			
	}
	public void au026(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		twofa.click();
		twofaBackButton.click();
		twofa.click();
			
	}
	public void au027(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		access.click();
		reportcheckBox.click();
		actionButton.click();
		submitButton.click();
		submitokButton.click();
	}
	public void au028(WebDriver wb) throws InterruptedException {

		report.click();
			
	}
	public void au029(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		access.click();
		reportcheckBox.click();
		actionButton.click();
		submitButton.click();
		submitokButton.click();
		ts.click();
		tsenable.click();
		Select s1=new Select(reportingDD);
		s1.selectByVisibleText("Vignesh Murugan");
		actionButton.click();
		Thread.sleep(10000);
		tssubmitButton.click();
		//Thread.sleep(10000);
		tssubmitok.click();
		
	}
	public void au031(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		image.click();
		WebElement upload=wb.findElement(By.id("ContentPlaceHolder1_fuFile"));
		upload.sendKeys("D:\\download.jpg");
		imageupload.click();
		
	}
	public void au032(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		image.click();
		WebElement upload=wb.findElement(By.id("ContentPlaceHolder1_fuFile"));
		upload.sendKeys("D:\\train.pdf");
		imageupload.click();
		
	}
	public void au033(WebDriver wb) throws InterruptedException {

		wb.findElement(By.xpath("//*[@id=\"DivUser\"]/span/span[2]")).click();
		viewuser.click();
		Search.sendKeys("Barani");
		DDedit.click();
		securityactions.click();
		backButton.click();
		DDedit.click();
		
	}



}
