package com.fb.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configuration_reader {
	public static Properties p;
	public configuration_reader() throws Throwable {

File f= new File("C:\\Users\\aswini\\eclipse-workspace\\Facebook_project\\src\\test\\java\\com\\fb\\property\\configuration.properties");
FileInputStream fis=new FileInputStream(f);
p=new Properties();
p.load(fis);

	}
	public String browser() {
		String browser = p.getProperty("browser");
		return browser;

	}
	public String username() {
		String username = p.getProperty("username");
		return username;
		

	}
	public String password() {
		String password = p.getProperty("password");
		return password;

	}
}
