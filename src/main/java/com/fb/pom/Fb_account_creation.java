package com.fb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_account_creation {
	public static WebDriver driver;
	public Fb_account_creation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getMail_id() {
		return mail_id;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getSex() {
		return sex;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement first_name;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement last_name;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mail_id;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement day;
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement sex;
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement submit;
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement button;
	public WebElement getButton() {
		return button;
	}
}
