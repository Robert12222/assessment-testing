package com.qa.test.Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployerPage {

	@FindBy(xpath = ("//*[@id=\"profile-pic\"]/h1"))
	WebElement pageinfo;
	
	@FindBy(xpath = ("//*[@id=\"resultTable\"]/tbody/tr[2]/td[4]"))
	WebElement showName;
	

	public void pageinfo() {
		pageinfo.click();

	}
}