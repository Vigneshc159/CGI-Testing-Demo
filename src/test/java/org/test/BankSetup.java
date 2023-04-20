package org.test;

import org.action.LoginActions;
import org.testng.annotations.Test;
import org.utility.PropertyFileReader;
import org.utility.Base;



public class BankSetup extends Base{
	@Test
	public void TC01() {
		Propertyfilereader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs01(wb);
	}
	@Test
	public void TC02() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs02(wb,accname,accnum);	
	}
	@Test
	public void TC03() {
		Propertyfilereader.propertyRead();

		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs03(wb,accname,accnum);
	}
	@Test
	public void TC04() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs04(wb,accname,accnum);
	}
	@Test
	public void TC05() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		String accnum1=PropertyFileReader.propertymap.get("Accountgroupname");
		loginaction.login(LoginID, Password);
		bankactions.bs05(wb,accname,accnum,accnum1);
	}

	@Test
	public void TC06() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs06(wb,accname,accnum);	
	}

	@Test
	public void TC07() {    
		
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs07(wb,accname,accnum);
	}

	@Test
	public void TC08() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accname=PropertyFileReader.propertymap.get("Accountname");
		String accnum=PropertyFileReader.propertymap.get("Accountnumber");
		loginaction.login(LoginID, Password);
		bankactions.bs08(wb,accname,accnum);
	}

	@Test
	public void TC09() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs09(wb);
	}

	@Test
	public void TC10() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs10(wb);
	}

	@Test
	public void TC11() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String locaName=PropertyFileReader.propertymap.get("Locationname");
		loginaction.login(LoginID, Password);
		bankactions.bs11(wb,locaName);
	}

	@Test
	public void TC12() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String locaName=PropertyFileReader.propertymap.get("Locationname");
		loginaction.login(LoginID, Password);
		bankactions.bs12(wb,locaName);

	}
	@Test
	public void TC13() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs13(wb);

	}
	@Test
	public void TC14() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs14(wb);

	}
	@Test
	public void TC15() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accnam1=PropertyFileReader.propertymap.get("Accountname");
		String trankey=PropertyFileReader.propertymap.get("Transactionkey");
		String loginid=PropertyFileReader.propertymap.get("Loginid");
		loginaction.login(LoginID, Password);
		bankactions.bs15(wb,accnam1,trankey,loginid);
	}

	@Test
	public void TC16() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accnam1=PropertyFileReader.propertymap.get("Accountname");
		String trankey=PropertyFileReader.propertymap.get("Transactionkey");
		String loginid=PropertyFileReader.propertymap.get("Loginid");
		loginaction.login(LoginID, Password);
		bankactions.bs16(wb,accnam1,trankey,loginid);

	}


	@Test
	public void TC17() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accnam1=PropertyFileReader.propertymap.get("Accountname");
		String trankey=PropertyFileReader.propertymap.get("Transactionkey");
		String loginid=PropertyFileReader.propertymap.get("Loginid");
		loginaction.login(LoginID, Password);
		bankactions.bs17(wb,accnam1,trankey,loginid);	
	}

	@Test
	public void TC18() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs18(wb);

	}

	@Test
	public void TC19() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs19(wb);
	}	
	@Test
	public void TC20() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs20(wb);

	}	
	

	@Test
	public void TC21() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String accnam1=PropertyFileReader.propertymap.get("Accountname2");
		loginaction.login(LoginID, Password);
		bankactions.bs21(wb,accnam1);

	}


	@Test
	public void TC22() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs22(wb);

	}



	@Test
	public void TC23() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String IPaddress=PropertyFileReader.propertymap.get("IPaddress");
		String Responsibleperson=PropertyFileReader.propertymap.get("Responsiblepersonname");
		String Locaname=PropertyFileReader.propertymap.get("Locationname");
		loginaction.login(LoginID, Password);
		bankactions.bs23(wb,IPaddress,Responsibleperson,Locaname);
	    
	}
	
	@Test
	public void TC24() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String IPaddress=PropertyFileReader.propertymap.get("IPaddress");
		String Responsibleperson=PropertyFileReader.propertymap.get("Responsiblepersonname");
		String Locaname=PropertyFileReader.propertymap.get("Locationname");
		loginaction.login(LoginID, Password);
		bankactions.bs23(wb,IPaddress,Responsibleperson,Locaname);
	    
	}
	
	
	@Test
	public void TC25() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs25(wb);
	}


	@Test
	public void TC26() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String IPaddress=PropertyFileReader.propertymap.get("IPaddress");
		String Responsibleperson=PropertyFileReader.propertymap.get("Responsiblepersonname");
		String Locaname=PropertyFileReader.propertymap.get("Locationname");
		loginaction.login(LoginID, Password);
		bankactions.bs26(wb,IPaddress,Responsibleperson,Locaname);

	}

	@Test
	public void TC27() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String username =PropertyFileReader.propertymap.get("Username");
		loginaction.login(LoginID, Password);
		bankactions.bs27(wb,username);

	}
	@Test
	public void TC28() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs28(wb);
	}	

	@Test
	public void TC29() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs29(wb);

	}	
	@Test
	public void TC30() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String username2=PropertyFileReader.propertymap.get("Username2");
		loginaction.login(LoginID, Password);
		bankactions.bs30(wb,username2);

	}
	@Test
	public void TC31() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs31(wb);

	}
	@Test
	public void TC32() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		bankactions.bs31(wb);
	}

	@Test
	public void TC33() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String modulename=PropertyFileReader.propertymap.get("Modulename");
		loginaction.login(LoginID, Password);
		bankactions.bs33(wb,modulename);
				
	}
	

	}
	
	

