package com.qa.test.Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin {

	@FindBy(xpath = ("//*[@id=\"menu_admin_viewAdminModule\"]/b"))
	WebElement adminPage;

	public void adminPage() {
		adminPage.click();

	}
}
