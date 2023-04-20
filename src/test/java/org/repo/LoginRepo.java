package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRepo {
	public @FindBy(id="txtUserName") WebElement username;
	public @FindBy(id="txtPassWord") WebElement password;
	public @FindBy(id="btnLogin") WebElement signin;

}
