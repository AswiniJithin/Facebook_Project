package com.fb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginpage {
	public static WebDriver driver;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement sign_up;

	public Fb_loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSign_up() {
		return sign_up;
	}
	
	@FindBy(xpath="(//a[@class='_sv4'])[7]")
	private WebElement english;

	public WebElement getEnglish() {
		return english;
	}



}
