package com.baseclass.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver driver_install(String Browser)  {
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aswini\\eclipse-workspace\\adactin\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
		
	
	}
	public static void get_site(String s) {
		//WebDriver driver=new ChromeDriver();
		try {
			driver.get(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void sendinput(WebElement element,String s) {
		try {
			element.sendKeys(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void select_options(WebElement element, String m) {
		try {
			Select s= new Select(element);
			s.selectByValue(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void screenshot() throws IOException {
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File sv = ts.getScreenshotAs(OutputType.FILE);
			File dst=new File("C:\\Users\\aswini\\eclipse-workspace\\adactin\\Screenshots\\adactin.png");
			FileUtils.copyFile(sv, dst);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void scroll_up_and_down(WebElement element) {
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView();",element);
		

	}

}
