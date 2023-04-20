package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class Entry extends Base{ 

	@Test(priority=1, description="Check with valid Login for normal User")
	public void TC1() throws IOException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		wb.findElement(By.id("ContentPlaceHolder1_lnktotalACH")).click();
	}
	@Test(priority=2, description="Check with empty Email Id  & Valid Password")

	public void TC2() {

		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login("" , Password);
		wb.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	}
	@Test(priority=3, description="Check with Valid Email Id  & empty Password" )
	public void TC3() throws IOException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		loginaction.login(LoginID, " ");
		//		wb.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	}
	@Test(priority=4, description="Check with InValid Email Id  & ValidPassword")
	public void TC4() {
		String Invaalidid=PropertyFileReader.propertymap.get("invalidid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(Invaalidid, Password);

	}
	@Test(priority=5, description="Check with Valid Email Id  & InValid Password")
	public void TC5() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Invalidpassword=PropertyFileReader.propertymap.get("invalidpassword");
		loginaction.login(LoginID, Invalidpassword);

	}	
	@Test(priority=6 ,invocationCount=1, description="Check with Valid Email Id  & InValid Password Repeated 6times")
	public void TC6() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Invalidpassword=PropertyFileReader.propertymap.get("invalidpassword");
		loginaction.login(LoginID, Invalidpassword);

	}
	@Test(priority=7 , description="Check Invalid or Disable User Login ")
	public void TC7() {
		String LoginID=PropertyFileReader.propertymap.get("Disableemail");
		String Invalidpassword=PropertyFileReader.propertymap.get("Disablepassword");
		loginaction.login(LoginID, Invalidpassword);

	}
	@Test(priority=8 , description="Check 2FA Enable Acount User")
	public void TC8() {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("2FAenable");
		String Invalidpassword=PropertyFileReader.propertymap.get("2FAdisable");
		loginaction.login(LoginID, Invalidpassword);
		wb.findElement(By.id("Back")).click();

	}
	@Test(priority=9 , description="Check 2FA  Disable Acount User")
	public void TC9() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Invalidpassword=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Invalidpassword);

	}
	@Test(priority=10,description="Check the Forgot Password Function ")
	public void TC10() {
		wb.findElement(By.id("txtUserName")).sendKeys("vignesh@sankarasoftware.com");;
		wb.findElement(By.id("btforgotpwd")).click();
		wb.findElement(By.xpath("//button[@class=\"btn btn-light me-3\"][@type=\"reset\"][@onclick=\"CloseConfirm()\"]")).click();
		wb.findElement(By.id("btforgotpwd")).click();
		wb.findElement(By.id("btnyes")).click();

	}
}


