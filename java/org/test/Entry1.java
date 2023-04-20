package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.Base1;
import org.utility.PropertyFileReader;

public class Entry1 extends Base1{ 

	//	@Test(priority=1, description="Check with valid Login for normal User")
	//	public void TC1() throws IOException {
	//		Propertyfilereader.propertyRead();
	//		String LoginID=PropertyFileReader.propertymap.get("loginid");
	//		String Password=PropertyFileReader.propertymap.get("password");
	//		loginaction.login(LoginID, Password);
	//		wb.findElement(By.id("ContentPlaceHolder1_lnktotalACH")).click();
	//	}
	@Test
	public void launch() {
		Propertyfilereader1.propertyRead();
		String a=Propertyfilereader1.propertymap.get("loginid");
		String b=Propertyfilereader1.propertymap.get("password");
		loginaction1.login(a, b);
	}

}


