package org.test;

import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class CustomerListSetup extends Base{
	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs01(wb);
	}
	@Test
	public void TC02() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs02(wb);
	}

	@Test
	public void TC03() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		loginaction.login(LoginID, Password);
		customerlistactions.cs03(wb,cusid,cusnam);
	}

	@Test
	public void TC04() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		String monthlypay=PropertyFileReader.propertymap.get("MothlyPyment");
		String totalyear=PropertyFileReader.propertymap.get("TotalYears");
		String escala=PropertyFileReader.propertymap.get("Escalation");
		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		String em=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		customerlistactions.cs04(wb,cusid,cusnam,monthlypay,totalyear,escala,totalconamount,ph,em);

	}

	@Test
	public void TC05() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs05(wb);
	}
	@Test
	public void TC06() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs06(wb);
	}
	@Test
	public void TC07() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String port=PropertyFileReader.propertymap.get("portfolio");
		loginaction.login(LoginID, Password);
		customerlistactions.cs07(wb,port);
	}

	@Test
	public void TC08() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String port=PropertyFileReader.propertymap.get("portfolio");
		loginaction.login(LoginID, Password);
		customerlistactions.cs08(wb,port);
	}

	@Test
	public void TC09() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs09(wb);
	}

	@Test
	public void TC10() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs10(wb);
	}
	@Test
	public void TC11() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs11(wb);
	}

	@Test
	public void TC12() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		String monthlypay=PropertyFileReader.propertymap.get("MothlyPyment");
		String totalyear=PropertyFileReader.propertymap.get("TotalYears");
		String escala=PropertyFileReader.propertymap.get("Escalation");
		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		String em=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		customerlistactions.cs12(wb,cusid,cusnam,monthlypay,totalyear,escala,totalconamount,ph,em);

	}

	@Test
	public void TC13() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		String em=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		customerlistactions.cs13(wb,cusid,cusnam,totalconamount,ph,em);
	}

	@Test
	public void TC14() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String cusid=PropertyFileReader.propertymap.get("CustomerId");
		String cusnam=PropertyFileReader.propertymap.get("CustomerName");
		String monthlypay=PropertyFileReader.propertymap.get("MothlyPyment");
		String totalyear=PropertyFileReader.propertymap.get("TotalYears");
		String escala=PropertyFileReader.propertymap.get("Escalation");
		String totalconamount=PropertyFileReader.propertymap.get("TotalContractAmount");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		String em=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		customerlistactions.cs14(wb,cusid,cusnam,monthlypay,totalyear,escala,totalconamount,ph,em);

	}
	@Test
	public void TC15()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs15(wb);
	}
	@Test
	public void TC16()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs16(wb);
	}
	@Test
	public void TC17()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String note=PropertyFileReader.propertymap.get("Notes");
		loginaction.login(LoginID, Password);
		customerlistactions.cs17(wb,note);
	}

	@Test
	public void TC18()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs18(wb);
	}

	@Test
	public void TC19()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String note=PropertyFileReader.propertymap.get("Notes");
		loginaction.login(LoginID, Password);
		customerlistactions.cs19(wb,note);
	}

	@Test
	public void TC20()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs20(wb);
	}
	@Test
	public void TC21() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs21(wb,ph);

	}

	@Test
	public void TC22()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs22(wb);
	}
	@Test
	public void TC23() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs23(wb);
	}
	@Test
	public void TC24() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String port=PropertyFileReader.propertymap.get("portfolio");
		loginaction.login(LoginID, Password);
		customerlistactions.cs24(wb,port);
	}
	@Test
	public void TC25() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String port=PropertyFileReader.propertymap.get("portfolio");
		loginaction.login(LoginID, Password);
		customerlistactions.cs25(wb,port);
	}
	@Test
	public void TC26() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs26(wb);
	}
	@Test
	public void TC27() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs27(wb);
	}
	@Test
	public void TC28() {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs28(wb);
	}

	@Test
	public void TC29() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs29(wb,ph);
	}

	@Test
	public void TC30() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs30(wb,ph);
	}
	@Test
	public void TC31() throws InterruptedException {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs31(wb,ph);
	}

	@Test
	public void TC32()   {
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		//String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs32(wb);

	}
	@Test
	public void TC33()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String ph=PropertyFileReader.propertymap.get("Phonenum");
		loginaction.login(LoginID, Password);
		customerlistactions.cs33(wb,ph);
	}
	@Test
	public void TC34()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs34(wb);
}
	@Test
	public void TC35()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs35(wb);
}

	@Test
	public void TC36()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs36(wb);
}
	@Test
	public void TC37()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String customercrm=PropertyFileReader.propertymap.get("CustomerIDCrm");
		loginaction.login(LoginID, Password);
		customerlistactions.cs37(wb,customercrm);
}
	
	@Test
	public void TC38()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs38(wb);
}
	@Test
	public void TC39()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs39(wb);
	
}
	@Test
	public void TC40()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs40(wb);
	
}
	@Test
	public void TC41()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String monthpay=PropertyFileReader.propertymap.get("MothlyPyment");
		String reas =PropertyFileReader.propertymap.get("Reason");
		loginaction.login(LoginID, Password);
        customerlistactions.cs41(wb,monthpay,reas);

}
	@Test
	public void TC42()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs42(wb);
	
}
	@Test
	public void TC43()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String producatioescaltion=PropertyFileReader.propertymap.get("ProducationEscalation");
		loginaction.login(LoginID, Password);
		customerlistactions.cs43(wb,producatioescaltion);
}
	@Test
	public void TC44()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs44(wb);
	
}

	@Test
	public void TC45()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs45(wb);
	
}
	@Test
	public void TC46()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs46(wb);
	
}
	@Test
	public void TC47()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs47(wb);
	
}

	@Test
	public void TC48()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs48(wb);
	
}
	@Test
	public void TC49()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs49(wb);
	
}
	@Test
	public void TC50()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs50(wb);
}
	
	@Test
	public void TC51()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs51(wb);
}

	@Test
	public void TC52()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs52(wb);
}

	@Test
	public void TC53()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customerlistactions.cs53(wb);
}
	@Test
	public void TC54()   {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		//String =PropertyFileReader.propertymap.get("iob");
		loginaction.login(LoginID, Password);
		customerlistactions.cs53(wb);
}
}