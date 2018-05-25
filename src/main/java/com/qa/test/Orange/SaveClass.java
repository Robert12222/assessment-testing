package com.qa.test.Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveClass {

	@FindBy(xpath = ("//*[@id=\"btnSave\"]"))
	WebElement saveBottom;

public void usersaved() {
	saveBottom.click();
}
}
	
 