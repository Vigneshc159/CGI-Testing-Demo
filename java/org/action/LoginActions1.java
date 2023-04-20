package org.action;

import org.repo.LoginRepo;

public class LoginActions1 extends LoginRepo {
	public void login(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		signin.click();
		
		
	}

}
