package com.qa.test.Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee {

	@FindBy(xpath = ("//*[@id=\"btnAdd\"]"))
	WebElement addBottom;

	@FindBy(xpath = ("//*[@id=\"firstName\"]"))
	WebElement clickName;

	@FindBy(xpath = ("//*[@id=\"middleName\"]"))
	WebElement clickMiddleName;

	@FindBy(xpath = ("//*[@id=\"lastName\"]"))
	WebElement clickLastName;

	@FindBy(xpath = ("//*[@id=\"employeeId\"]"))
	WebElement IdNumber;

	// *[@id="chkLogin"]

	public void addBottomClick() {
		addBottom.click();

	}

	public void clickNameClick() {
		clickName.click();
		clickName.sendKeys("Robert");
	}

	public void clickMiddleName() {
		clickMiddleName.click();
		clickMiddleName.sendKeys("Tom");
	}

	public void clickLastName() {
		clickLastName.click();
		clickLastName.sendKeys("James");
	}

	public void IdNumber() {
		IdNumber.click();
		IdNumber.clear();
		IdNumber.sendKeys("0066");
	}

	
}