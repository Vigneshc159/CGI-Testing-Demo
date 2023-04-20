package org.test;

import org.action.CustomerActions;
import org.testng.annotations.Test;
import org.utility.Base;
import org.utility.PropertyFileReader;

public class CustomerSetup extends Base {
	@Test
	public void TC01() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs01(wb);
	}

	@Test
	public void TC02() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs02(wb);

	}

	@Test
	public void TC03() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs03(wb);

	}

	@Test
	public void TC04() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs04(wb);
	}


	@Test
	public void TC05() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs05(wb);
	}

	@Test
	public void TC06() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs06(wb);
	}

	@Test
	public void TC07() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs07(wb);
	}
	
	@Test
	public void TC08() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs08(wb);

	}

	@Test
	public void TC09() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs09(wb);

	}

	@Test
	public void TC10() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs10(wb);
	}

	@Test
	public void TC11() {
		PropertyFileReader.propertyRead();
		String LoginID=PropertyFileReader.propertymap.get("loginid");
		String Password=PropertyFileReader.propertymap.get("password");
		loginaction.login(LoginID, Password);
		customeractions.cs11(wb);
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}


