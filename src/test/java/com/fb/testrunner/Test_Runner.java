package com.fb.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.Baseclass;
import com.fb.help.File_reader_manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\fb\\feature", glue="com.fb.stepdefenition", plugin= {"html:Report/HTML_Report","pretty", "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html" })

public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void browser_launch() throws Throwable{
		String browser = File_reader_manager.getinstance().getinstanacecr().browser();
	
	driver=Baseclass.driver_install(browser);
		

	}
	@AfterClass
	public static void tear_down() {
		driver.close();

	}
	

}
