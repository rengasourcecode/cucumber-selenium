package com.datetesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusTesting {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		for(int i=0;i<2;i++)
		{
		String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div//span[1]")).getText();
		String year=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div//span[2]")).getText();
		
		String month2=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div//span[1]")).getText();
		String year2=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']//div//span[2]")).getText();
		
		if(month.equals("January"))
		{
			List <WebElement> date=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//td"));
			for(int k=0;k<date.size();k++)
			{
				if(date.get(k).getText().equals("28"))
				{
					date.get(k).click();
				}
			}
		}
		else
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}
		}


	}

}
