package com.datetesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(2000);
	/*	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("ch");;
		Thread.sleep(2000);

		List <WebElement> li1= driver.findElements(By.xpath("//div[@class='dropdownDiv']//ul//li"));
		Thread.sleep(2000);
		for(int i=0;i<li1.size();i++)
		{
			if(li1.get(i).getText().equalsIgnoreCase("Chennai (MAA)"))
			{
				li1.get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(1000);
		
		List <WebElement> li2= driver.findElements(By.xpath("//div[@class='dropdownDiv']//ul//li"));
		Thread.sleep(2000);
		for(int i=0;i<li2.size();i++)
		{
			if(li2.get(i).getText().equalsIgnoreCase("Kochi (COK)"))
			{
				li2.get(i).click();
			}
		}
		
		
		Thread.sleep(1000);
		
	/*	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(1000);
		
		for(int k=0;k<12;k++)
		{
			
			String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
			Thread.sleep(2000);
			if(month.equalsIgnoreCase("April"))
			{
				Thread.sleep(1000);
				
				List <WebElement> li3= driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//table//td"));
				Thread.sleep(2000);
				for(int i=0;i<li3.size();i++)
				{
					if(li3.get(i).getText().equalsIgnoreCase("27"))
					{
						li3.get(i).click();
					}
				}
				
				
			}else
			{
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//span[1]")).click();
				Thread.sleep(1000);
			}
		} 
		
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).sendKeys(Keys.ENTER); */
				
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement element=	driver.findElement(By.id("hrefIncAdt"));
		js.executeScript("arguments[0].click();",element );

		
	}

}
