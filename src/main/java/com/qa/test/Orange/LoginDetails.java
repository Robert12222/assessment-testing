package com.qa.test.Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDetails {
	@FindBy(xpath = ("//*[@id=\"chkLogin\"]"))
	WebElement clickLoginDetials;

	@FindBy(xpath = ("//*[@id=\"user_name\"]"))
	WebElement userName;

	@FindBy(xpath = ("//*[@id=\"user_password\"]"))
	WebElement userPassword;
	
	@FindBy(xpath = ("//*[@id=\"re_password\"]"))
	WebElement userPasswordConfirm;

	public void clickLoginDetials() {
		clickLoginDetials.click();

	}

	public void userName() {
		userName.click();
		userName.sendKeys("Robert");
	}

	public void userPassword() {
		userPassword.click();
		userPassword.sendKeys("person");
	}
	
	public void userPasswordConfirm() {
		userPasswordConfirm.click();
		userPasswordConfirm.sendKeys("person");
	 
}
}
