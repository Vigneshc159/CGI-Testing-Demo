package org.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.action.LoginActions;
import org.action.LoginActions1;
import org.action.ViewUserActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 extends PropertyFileReader{
	protected static WebDriver wb;
	protected LoginActions1 loginaction1;
	protected PropertyFileReader1 Propertyfilereader1;

	
	@BeforeMethod
	public void launch() throws IOException {
		WebDriverManager.chromedriver().setup();
		wb=new ChromeDriver();
		wb.get("http://192.168.1.33/CGI/Views/LoginPage.aspx");
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		loginaction1 = PageFactory.initElements(wb, LoginActions1.class);
		Propertyfilereader1=PageFactory.initElements(wb, PropertyFileReader1.class);

	}

	

//	@AfterMethod
//	public void close() {
//		wb.quit();
//	}
//	



}
