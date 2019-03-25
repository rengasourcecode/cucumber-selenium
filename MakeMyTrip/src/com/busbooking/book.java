package com.busbooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class book {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@id='header_tab_bus']")).click();
		
	/*	driver.findElement(By.id("source")).sendKeys("che");	
		Thread.sleep(2000);
		
		List <WebElement> list1= driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		
		for( int i=0;i<list1.size();i++)
		{
			if(list1.get(i).getText().equalsIgnoreCase("chennai"))
			{
				list1.get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("destination")).sendKeys("mum");	
		Thread.sleep(2000);
		
		List <WebElement> list2= driver.findElements(By.xpath("//*[@id='ui-id-2']//li"));
		
		for( int i=0;i<list2.size();i++)
		{
			if(list2.get(i).getText().equalsIgnoreCase("mumbai"))
			{
				list2.get(i).click();
			}
		} */
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		
		WebElement date=driver.findElement(By.id("onward_cal"));
		js.executeScript("arguments[0].click()", date);
		Thread.sleep(2000);
		for (int i=0;i<12;i++)
		{
			String month=driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText();
			String[] str=month.split(" ");
			
			List <WebElement> month1= driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//td"));
			Thread.sleep(2000);
			if(str[0].equalsIgnoreCase("Apr"))
			{
				if(month1.get(i).getText().equals("10"))
				{
					month1.get(i).click();
				}
				
			}
			else
			{
				driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']")).click();
			}
		}
		

	}

}
