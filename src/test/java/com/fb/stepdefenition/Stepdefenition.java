package com.fb.stepdefenition;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.Baseclass;
import com.fb.help.Page_Object_manager;
import com.fb.testrunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefenition extends Baseclass{
	public static WebDriver driver=Test_Runner.driver;
	public static Page_Object_manager pom=new Page_Object_manager(driver);

	@Given("^browser Launch$")
	public void browser_Launch() throws Throwable {
		get_site("https://en-gb.facebook.com");
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		
	}
	

	@Given("^sign Up Page$")
	public void sign_Up_Page() throws Throwable {
		click(pom.account_creation().getButton());
		Thread.sleep(5000);
	}

	@When("^user Enter First Name$")
	public void user_Enter_First_Name() throws Throwable {
		sendinput(pom.account_creation().getFirst_name(), "aswini");
		Thread.sleep(5000);
	}

	@When("^user Enter Last Name$")
	public void user_Enter_Last_Name() throws Throwable {
		sendinput(pom.account_creation().getLast_name(), "m v");
		Thread.sleep(5000);
	}

	@When("^user Enter Email$")
	public void user_Enter_Email() throws Throwable {
		sendinput(pom.account_creation().getMail_id(), "aswinimv9@gmail.com");
		Thread.sleep(5000);
	}

	@When("^user Enter Password$")
	public void user_Enter_Password() throws Throwable {
		sendinput(pom.account_creation().getPassword(), "123456");
		Thread.sleep(5000);
	}

	@When("^user Enter Date Of Birth$")
	public void user_Enter_Date_Of_Birth() throws Throwable {
		select_options(pom.account_creation().getDay(), "18");
		Thread.sleep(5000);
	}

	@When("^user Enter Date Of Month$")
	public void user_Enter_Date_Of_Month() throws Throwable {
		select_options(pom.account_creation().getMonth(), "12");
		Thread.sleep(5000);
	}

	@When("^user Enter Date Of Year$")
	public void user_Enter_Date_Of_Year() throws Throwable {
		select_options(pom.account_creation().getYear(), "1992");
		Thread.sleep(5000);
	}

	@When("^user Enter Sex$")
	public void user_Enter_Sex() throws Throwable {
		click(pom.account_creation().getSex());
		Thread.sleep(5000);
	}

	@Then("^click On Submit$")
	public void click_On_Submit() throws Throwable {
		click(pom.account_creation().getSubmit());
	}
	
	

}
