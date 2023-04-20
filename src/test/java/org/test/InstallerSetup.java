package org.test;

import org.action.InstallerActions;
import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class InstallerSetup extends Base {

	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS01(wb);
	}

	@Test
	public void TC02() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS02(wb,name,adress,adress2,city,zipcode,phonenum,email);


	}

	@Test
	public void TC03() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS03(wb,name,adress,adress2,city,zipcode,phonenum,email);
	}
	@Test
	public void TC04() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS04(wb,name,adress,adress2,city,zipcode,phonenum,email);

	}

	@Test
	public void TC05() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS05(wb,name,adress,adress2,city,zipcode,phonenum,email);	
	}
	@Test
	public void TC06() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS06(wb);

	}
	@Test
	public void TC07() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS07(wb);
	}
	@Test
	public void TC08() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS08(wb,name,adress,adress2,city,zipcode,phonenum,email);
	}


	@Test
	public void TC09() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS09(wb,name,adress,adress2,city,zipcode,phonenum,email);

	}

	@Test
	public void TC10() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS10(wb,name,adress,adress2,city,zipcode,phonenum,email);

	}
	@Test
	public void TC11() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS11(wb,name,adress,adress2,city,zipcode,phonenum,email);


	}
	@Test
	public void TC12() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS12(wb,name,adress,adress2,city,zipcode,phonenum,email);

	}
	@Test
	public void TC13() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String name=PropertyFileReader.propertymap.get("Namebox");
		String adress=PropertyFileReader.propertymap.get("Address");
		String adress2=PropertyFileReader.propertymap.get("Address2");
		String city=PropertyFileReader.propertymap.get("Cityname");
		String zipcode=PropertyFileReader.propertymap.get("Zipcode");
		String phonenum=PropertyFileReader.propertymap.get("Phonenum");
		String email=PropertyFileReader.propertymap.get("Email");
		loginaction.login(LoginID, Password);
		installeractions.IS13(wb,name,adress,adress2,city,zipcode,phonenum,email);

	}
	@Test
	public void TC14() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS14(wb);
	}
	@Test
	public void TC15() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String trans=PropertyFileReader.propertymap.get("Transactiondate");
		String amoun=PropertyFileReader.propertymap.get("Amount");
		loginaction.login(LoginID, Password);
		installeractions.IS15(wb,trans,amoun);
	}
	@Test
	public void TC16() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String trans=PropertyFileReader.propertymap.get("Transactiondate");
		String amoun=PropertyFileReader.propertymap.get("Amount");
		String bank=PropertyFileReader.propertymap.get("Bankname");
		loginaction.login(LoginID, Password);
		installeractions.IS16(wb,trans,amoun,bank);

	}
	@Test
	public void TC17() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS17(wb);


	}
	@Test
	public void TC18() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS18(wb);


	}
	@Test
	public void TC19() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String search=PropertyFileReader.propertymap.get("Serachbox");
		loginaction.login(LoginID, Password);
		installeractions.IS19(wb,search);

	}
	@Test
	public void TC20() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS20(wb);
	}
	@Test
	public void TC21() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS21(wb);
	}
	@Test
	public void TC22() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String transdate=PropertyFileReader.propertymap.get("InvestmentTransactiondate");
		String invesamount=PropertyFileReader.propertymap.get("Investmentamount");
		loginaction.login(LoginID, Password);
		installeractions.IS22(wb,transdate,invesamount);

	}
	@Test
	public void TC23() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String transdate=PropertyFileReader.propertymap.get("InvestmentTransactiondate");
		String invesamount=PropertyFileReader.propertymap.get("Investmentamount");
		loginaction.login(LoginID, Password);
		installeractions.IS23(wb,transdate,invesamount);
	}
	@Test
	public void TC24() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS24(wb);
	}
	@Test
	public void TC25() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS25(wb);
	}
	
	@Test
	public void TC26() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String installername =PropertyFileReader.propertymap.get("InstallerName");
		loginaction.login(LoginID, Password);
		installeractions.IS26(wb,installername);

}
	@Test
	public void TC27() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String groname=PropertyFileReader.propertymap.get("GroupName");
		loginaction.login(LoginID, Password);
		installeractions.IS27(wb,groname);

}
	@Test
	public void TC28() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String groname=PropertyFileReader.propertymap.get("GroupName");
		loginaction.login(LoginID, Password);
		installeractions.IS28(wb,groname);
	
}
	@Test
	public void TC29() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS29(wb);
	
}
	@Test
	public void TC30() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS30(wb);
	
	
}
	@Test
	public void TC31() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String groname1=PropertyFileReader.propertymap.get("GroupName1");
		loginaction.login(LoginID, Password);
		installeractions.IS31(wb,groname1);
}
	
	@Test
	public void TC32() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS32(wb);
		
}
	@Test
	public void TC33() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String amoun =PropertyFileReader.propertymap.get("Amount");
		loginaction.login(LoginID, Password);
		installeractions.IS33(wb,amoun);
		
}
	@Test
	public void TC34() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		String amoun =PropertyFileReader.propertymap.get("Amount");
		loginaction.login(LoginID, Password);
		installeractions.IS34(wb,amoun);
		
}

	@Test
	public void TC35() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS35(wb);
		
}
	@Test
	public void TC36() throws InterruptedException {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		installeractions.IS36(wb);
}
}
