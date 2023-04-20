package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRepo1 {
	public @FindBy(id="txtUserName") WebElement username;
	public @FindBy(id="txtPassWord") WebElement password;
	public @FindBy(id="btnLogin") WebElement signin;

}
