package com.fb.com;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.com.Baseclass;

public class Facebook_login  extends Baseclass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		driver=driver_install("chrome");
		get_site("https://www.facebook.com/");
		
		WebElement sign_up = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		WebElement first_name = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement last_name = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mail_id = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

		WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		WebElement english = driver.findElement(By.xpath("(//a[@class='_sv4'])[7]"));
		
	}

}
