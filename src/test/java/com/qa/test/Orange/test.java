package com.qa.test.Orange;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Cucumber.Cucumber.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {

	WebDriver driver;
	DashBoard dashBoard;
	AddEmployee addEmployee;
	LoginDetails loginDetails;
	SaveClass saveClass;
	EmployerPage employerPage;
	Admin admin;
	ExtentReports report;
	ExtentTest test;

	@Before 
	public void method ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\LocalInstall\\Web development\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\exam.html", true);

		test = report.startTest("OragneHRM Site");
	}

	
	
	@Given("^the Add Employee Tab$")
	public void the_Add_Employee_Tab() {

		//driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		// driver.findElement(By.name("Admin")).sendKeys("admin");

		

		test.log(LogStatus.ERROR, "read work ");

		test.log(LogStatus.PASS, "Project works fine");

		test.log(LogStatus.PASS, "Project works fine");

		test.log(LogStatus.PASS, "Project works fine");

		test.log(LogStatus.FATAL, "Complety incorrect");

		report.endTest(test);

		report.flush();

		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

		dashBoard = PageFactory.initElements(driver, DashBoard.class);
		addEmployee = PageFactory.initElements(driver, AddEmployee.class);
		loginDetails = PageFactory.initElements(driver, LoginDetails.class);
		saveClass = PageFactory.initElements(driver, SaveClass.class);
		employerPage = PageFactory.initElements(driver, EmployerPage.class);
		admin = PageFactory.initElements(driver, Admin.class);
		dashBoard.pimBottomClick();
		addEmployee.addBottomClick();

		// driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^I fill out the Employee Details correctly$")
	public void i_fill_out_the_Employee_Details_correctly() {

		addEmployee.clickNameClick();
		addEmployee.clickMiddleName();
		addEmployee.clickLastName();
		addEmployee.IdNumber();

	}

	@When("^I choose to create Login Details$")
	public void i_choose_to_create_Login_Details() {

		loginDetails.clickLoginDetials();

	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() {

		loginDetails.userName();
		loginDetails.userPassword();
		loginDetails.userPasswordConfirm();

	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() {

		saveClass.usersaved();

	}

	@Then("^I can see information about the user$")
	public void i_can_see_information_about_the_user() {

		employerPage.pageinfo();
		admin.adminPage();

		Assert.assertEquals("ESS",
				driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]")).getText());
	}

	@After
	public void teardown() {

		

		driver.quit();
	}

}