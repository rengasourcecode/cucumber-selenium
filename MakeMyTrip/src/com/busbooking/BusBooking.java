package com.busbooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusBooking {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'bus')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("che");
		Thread.sleep(2000);

		
		List<WebElement> source = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		
		for(int i=0; i<source.size();i++)
		{
			//System.out.println(source.get(i).getText());
			if(source.get(i).getText().equalsIgnoreCase("chennai"))
			{
				source.get(i).click();
			}
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys("bang");
		Thread.sleep(2000);

        List<WebElement> destination = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		
		for(int i=0; i<destination.size();i++)
		{
			if(destination.get(i).getText().equalsIgnoreCase("Bangalore"))
			{
				destination.get(i).click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		Thread.sleep(2000);
		
		for(int i=0;i<3;i++)
		{
	        String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']//div//span[1]")).getText();
            Thread.sleep(2000);
			if(month.equalsIgnoreCase("february"))
					{
				List <WebElement> date=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//td"));
				for(int k=0;k<date.size();k++)
				{
					if(date.get(k).getText().equals("19"))
					{
						date.get(k).click();
					}
				}
				}
			
			else
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			   Thread.sleep(2000);
		}
		
	}

}
