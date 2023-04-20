package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class Investor extends Base {

	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		investoractions.inv01(wb);

	}
	@Test
	public void TC02() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv02(wb,Invname);

	}
	@Test
	public void TC03() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv03(wb,Invname);

	}
	@Test
	public void TC04() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv04(wb,Invname);

	}
	@Test
	public void TC05() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv05(wb,Invname);

	}
	@Test
	public void TC06() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv06(wb,Invname);

	}
	@Test
	public void TC07() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv07(wb,Invname);

	}
	@Test
	public void TC08() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String Invname=PropertyFileReader.propertymap.get("InvestorName");
		loginaction.login(LoginID, Password);
		investoractions.inv08(wb,Invname);

	}
	@Test
	public void TC09() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		loginaction.login(LoginID, Password);
		investoractions.inv09(wb,tranamt);

	}
	@Test
	public void TC10() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		loginaction.login(LoginID, Password);
		investoractions.inv10(wb,tranamt);

	}
	@Test
	public void TC11() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String tranamt=PropertyFileReader.propertymap.get("TransactionAmt");
		String transdate =PropertyFileReader.propertymap.get("Transactiondate");
		loginaction.login(LoginID, Password);
		investoractions.inv11(wb,tranamt,transdate);

	}

	@Test
	public void TC12() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv12(wb);


	}


	@Test
	public void TC13() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv13(wb);


	}
	@Test
	public void TC14() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv14(wb);


	}

	@Test
	public void TC15() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv15(wb);

	}

	@Test
	public void TC16() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv16(wb);
	}
	@Test
	public void TC17() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv17(wb);
	}
	@Test
	public void TC18() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String username=PropertyFileReader.propertymap.get("UserName1");
		String userlastnam=PropertyFileReader.propertymap.get("userlastName");
		loginaction.login(LoginID, Password);
		investoractions.inv18(wb,username,userlastnam);

	}
	@Test
	public void TC19() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String creemail=PropertyFileReader.propertymap.get("UserCredentialsEmail");
		String crePassword=PropertyFileReader.propertymap.get("UserCredentialsPassword");
		loginaction.login(creemail, crePassword);
		investoractions.inv19(wb);
	}
	@Test
	public void TC20() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv20(wb);
	}	


	@Test
	public void TC21() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv21(wb);
	}	
	@Test
	public void TC22() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv22(wb);
	}	

	@Test
	public void TC23() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv23(wb);
	}	


	@Test
	public void TC24() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv24(wb);
	}	


	@Test
	public void TC25() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv25(wb);
	}	



	@Test
	public void TC26() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv26(wb);
	}	

	@Test
	public void TC27() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv27(wb);
	}	

	@Test
	public void TC28() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv28(wb);
	}	

	@Test
	public void TC29() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String filenam=PropertyFileReader.propertymap.get("FileName");
		loginaction.login(LoginID, Password);
		investoractions.inv29(wb,filenam);
	}	
	@Test
	public void TC30() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv30(wb);
	}	

	@Test
	public void TC31() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv31(wb);
	}	

	@Test
	public void TC32() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv32(wb);
	}	

	@Test
	public void TC33() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		String tit=PropertyFileReader.propertymap.get("Title");
		String newfeed=PropertyFileReader.propertymap.get("NewsFeeds");
		loginaction.login(LoginID, Password);
		investoractions.inv33(wb,tit,newfeed);
	}	

	@Test
	public void TC34() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("Invloginid");
		String Password=PropertyFileReader.propertymap.get("Invpassword");
		loginaction.login(LoginID, Password);
		investoractions.inv34(wb);
	}	
}



