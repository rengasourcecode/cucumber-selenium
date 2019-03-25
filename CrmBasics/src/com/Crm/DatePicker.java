package com.Crm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//DATE PICKER
		driver.switchTo().frame("mainpanel");

		Select s = new Select(driver.findElement(By.name("slctMonth")));
		List <WebElement> list = s.getOptions();
		
		for(int i=0;i<list.size();i++)
		
		{
			if(list.get(i).getText().equals("February"))
			{
				list.get(i).click();
			}
		}
		

	}

}
