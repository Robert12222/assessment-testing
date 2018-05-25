package com.qa.test.Orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {

	@FindBy(xpath = ("//*[@id=\"menu_pim_viewPimModule\"]/b"))
	WebElement pimBottom;

	public void pimBottomClick() {
		pimBottom.click();

	}
}
