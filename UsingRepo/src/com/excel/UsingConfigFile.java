package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingConfigFile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("configproperties/config.properties");
		Properties prop = new Properties();
		
		//loding
		
		prop.load(file);
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("url2"));

		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
	}

}
