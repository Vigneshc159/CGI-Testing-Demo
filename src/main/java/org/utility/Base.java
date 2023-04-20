package org.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.action.BankActions;
import org.action.CustomerActions;
import org.action.CustomerListActions;
import org.action.InstallerActions;
import org.action.InvestorActions;
import org.action.LoginActions;
import org.action.ReportsActions;
import org.action.ViewUserActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends PropertyFileReader{
	protected static WebDriver wb;
	protected LoginActions loginaction;//2	
	protected PropertyFileReader Propertyfilereader;//3
	protected ViewUserActions Viewuseractions;
	protected BankActions bankactions;
	protected InstallerActions installeractions;
	protected InvestorActions investoractions;
	protected CustomerActions customeractions;
	protected CustomerListActions customerlistactions;
	protected ReportsActions reportactions;

	@BeforeMethod
	public void launch() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		wb=new ChromeDriver();
		
		wb.get("http://192.168.1.33/CGI/Views/LoginPage.aspx");
		//wb.get("http://54.176.3.36/MX145/Views/CreateProposal.aspx?TransId=2542");
		wb.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		loginaction = PageFactory.initElements(wb, LoginActions.class);
		Propertyfilereader=PageFactory.initElements(wb, PropertyFileReader.class);
		Viewuseractions=PageFactory.initElements(wb, ViewUserActions.class);
		bankactions=PageFactory.initElements(wb, BankActions.class);
		installeractions=PageFactory.initElements(wb,InstallerActions.class);
		investoractions=PageFactory.initElements(wb,InvestorActions.class);
		customeractions=PageFactory.initElements(wb,CustomerActions.class);
		customerlistactions=PageFactory.initElements(wb,CustomerListActions.class);
		reportactions=PageFactory.initElements(wb,ReportsActions.class);
	}

	
		@AfterMethod
		public void close() {
		wb.quit();
		}
	
}
