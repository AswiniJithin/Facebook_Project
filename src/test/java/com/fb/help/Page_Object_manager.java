package com.fb.help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.fb.pom.Fb_account_creation;
import com.fb.pom.Fb_loginpage;

public class Page_Object_manager {
	public WebDriver driver;
	private Fb_loginpage signup;
	
	
	public Page_Object_manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public Fb_loginpage Fb_login() {
		signup=new Fb_loginpage(driver);
		return signup;

	}
	private Fb_account_creation creation;
	public Fb_account_creation account_creation() {
		creation=new Fb_account_creation(driver);
		return creation;

	}
	

}
