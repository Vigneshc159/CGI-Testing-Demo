package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class ViewUser extends Base {
	@Test(description="Drop Down check : View User ", priority=1)
	public void TC01() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au01(wb);
		
		
	}
	@Test(description="Required Field Check: Add Users", priority=2)
	public void TC02() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au02(wb);
		
		
	}
	@Test(description="Clear Button  Check: Add Users", priority=3)
	public void TC03() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Firstname=PropertyFileReader.propertymap.get("FirstName");
		String Lastname=PropertyFileReader.propertymap.get("LastName");
		loginaction.login(LoginID, Password);
		Viewuseractions.au03(wb,Firstname,Lastname);
		
		
	}
	@Test(description="Back Button  Check: Add Users", priority=4)
	public void TC04() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Firstname=PropertyFileReader.propertymap.get("FirstName");
		String Lastname=PropertyFileReader.propertymap.get("LastName");
		loginaction.login(LoginID, Password);
		Viewuseractions.au04(wb,Firstname,Lastname);
		
		
	}
	@Test(description="Valid inputs  Check for CGI User: Add Users", priority=5)
	public void TC05() throws InterruptedException {
		
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Firstname=PropertyFileReader.propertymap.get("FirstName");
		String Lastname=PropertyFileReader.propertymap.get("LastName");
		String Email=PropertyFileReader.propertymap.get("CustomerEmail");
		String UserRole=PropertyFileReader.propertymap.get("Userrole");
		String Phone=PropertyFileReader.propertymap.get("CusPhNo");
		loginaction.login(LoginID, Password);
		Viewuseractions.au05(wb,Firstname,Lastname,Email,UserRole,Phone);
		
		
	}
	@Test(description="Valid inputs  Check for Installer User: Add Users", priority=6)
	public void TC06() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Firstname=PropertyFileReader.propertymap.get("FirstName");
		String Lastname=PropertyFileReader.propertymap.get("LastName");
		String Email=PropertyFileReader.propertymap.get("CustomerEmail");
		String UserRole=PropertyFileReader.propertymap.get("Userrole");
		String Phone=PropertyFileReader.propertymap.get("CusPhNo");
		loginaction.login(LoginID, Password);
		Viewuseractions.au06(wb,Firstname,Lastname,Email,UserRole,Phone);
		
		
	}
	@Test(description="Email Back Button  Check: Security", priority=11)
	public void TC011() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au011(wb);
		
		
	}
	@Test(description="New Password change  Check: Security", priority=12)
	public void TC012() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Newpassword=PropertyFileReader.propertymap.get("Newpassword");
		String conNewpassword=PropertyFileReader.propertymap.get("ConNewpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au012(wb,Newpassword,conNewpassword);
		
		
	}
	@Test(description="New Password Login  Check: Security", priority=13)
	public void TC013() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("ConNewpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au013(wb);
		
		
	}
	@Test(description="Password Back Button  Check: Security", priority=14)
	public void TC014() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au014(wb);
		
		
	}
	@Test(description="Status Disable Yes  Check: Security", priority=15)
	public void TC015() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au015(wb);
		
		
	}
	@Test(description="Disable  Login  Check: Security", priority=16)
	public void TC016() throws InterruptedException {
		
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("Newpassword");
		loginaction.login(LoginID, Password);
		//Viewuseractions.au018(wb);
		
		
	}
	@Test(description="Status Enable Yes  Check: Security", priority=19)
	public void TC019() throws InterruptedException {
	Propertyfilereader.propertyRead();
		
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au019(wb);
		
		
	}
	@Test(description="Status Enable Login  Check: Security", priority=20)
	public void TC020() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("Newpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au020(wb);
		
		
	}
	@Test(description="Status Back Button  Check: Security", priority=21)
	public void TC021() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au021(wb);
		
		
	}
	@Test(description="2FA Enable Yes  Check: Security", priority=22)
	public void TC022() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au022(wb);
		
		
	}
	@Test(description="2FA Enable Login  Check: Security", priority=23)
	public void TC023() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("Newpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au023(wb);
		
		
	}
	@Test(description="2FA Disable Yes  Check: Security", priority=24)
	public void TC024() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au024(wb);
		
		
	}
	@Test(description="2FA Disable Login  Check: Security", priority=25)
	public void TC025() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("Newpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au025(wb);
		
		
	}
	@Test(description="2FA Back Button  Check: Security", priority=26)
	public void TC026() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au026(wb);
		
		
	}
	@Test(description=" modules mapped  Check: Access Rights", priority=27)
	public void TC027() throws InterruptedException {
		
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au027(wb);
		
		
	}
	@Test(description="mapped  modules to Visible  Check: Access Rights", priority=28)
	public void TC028() throws InterruptedException {
		
		String LoginID=PropertyFileReader.propertymap.get("Newemail");
		String Password=PropertyFileReader.propertymap.get("Newpassword");
		loginaction.login(LoginID, Password);
		Viewuseractions.au028(wb);
		
		
	}
	@Test(description="Enable timesheet  Check: Timesheet Access", priority=29)
	public void TC029() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au029(wb);
		
		
	}
	@Test(description="Invalid Profile Image Upload  Check:  View User", priority=31)
	public void TC031() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au031(wb);
		
		
	}
	@Test(description="Invalid Profile Image Upload  Check:  View User", priority=32)
	public void TC032() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au032(wb);
		
		
	}
	@Test(description="Back Button  Check:  View User", priority=33)
	public void TC033() throws InterruptedException {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		Viewuseractions.au033(wb);
		
		
	}
}
