package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class ReportsSetup extends Base {
	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs01(wb);
	}
	@Test
	public void TC02() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs02(wb);
	}

	@Test
	public void TC03() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs03(wb);
	}

	@Test
	public void TC04() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusnotes=PropertyFileReader.propertymap.get("CustomerNotes");
		loginaction.login(LoginID, Password);
		reportactions.rs06(wb,cusnotes);
	}
	@Test
	public void TC05(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs05(wb);

	}

	@Test
	public void TC06() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusnotes=PropertyFileReader.propertymap.get("CustomerNotes");
		loginaction.login(LoginID, Password);
		reportactions.rs06(wb,cusnotes);
	}
	@Test
	public void TC07(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs07(wb);

	}
	@Test
	public void TC08(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs08(wb);
	}
	@Test
	public void TC09(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String transdis=PropertyFileReader.propertymap.get("TransactionDiscription");
		loginaction.login(LoginID, Password);
		reportactions.rs09(wb,transdis);
	}

	@Test
	public void TC10(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs10(wb);
	}

	@Test
	public void TC11(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String transdis=PropertyFileReader.propertymap.get("TransactionDiscription");
		loginaction.login(LoginID, Password);
		reportactions.rs11(wb,transdis);
	}
	@Test
	public void TC12(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs12(wb);
	}
	@Test
	public void TC13(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs13(wb);
	}

	@Test
	public void TC14(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs14(wb);
	}

	@Test
	public void TC15(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String monthpay=PropertyFileReader.propertymap.get("MothlyPyment");
		loginaction.login(LoginID, Password);
		reportactions.rs15(wb,monthpay);
	}
	@Test
	public void TC16(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs16(wb);
	}
	@Test
	public void TC17(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String amount=PropertyFileReader.propertymap.get("Amount");
		loginaction.login(LoginID, Password);
		reportactions.rs17(wb,amount);
	}

	@Test
	public void TC18(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String reaso=PropertyFileReader.propertymap.get("Reason");
		String amount=PropertyFileReader.propertymap.get("Amount");
		loginaction.login(LoginID, Password);
		reportactions.rs18(wb,reaso,amount);
	}
	@Test
	public void TC19(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs19(wb);
	}
	@Test
	public void TC20(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs20(wb);

	}
	@Test
	public void TC21(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs21(wb);
	}
	@Test
	public void TC22(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs22(wb);
	}	
	@Test
	public void TC23(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs23(wb);
	}	

	@Test
	public void TC24(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs24(wb);
	}	

	@Test
	public void TC25(){
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs25(wb);
	}

	@Test
	public void TC26() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs26(wb);
	}

	@Test
	public void TC27() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs27(wb);
	}

	@Test
	public void TC28() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs28(wb);
	}
	@Test
	public void TC29() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs29(wb);
	}
	@Test
	public void TC30() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs30(wb);
	}

	@Test
	public void TC31() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs31(wb);
	}
	@Test
	public void TC32() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs32(wb);
	}
	@Test
	public void TC33() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs33(wb);
	}
	@Test
	public void TC34() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs34(wb);
	}

	@Test
	public void TC35() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs35(wb);
	}
	@Test
	public void TC36() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs36(wb);
	}

	@Test
	public void TC37() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		reportactions.rs37(wb);
	}

}


