package com.busbooking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='ch_login_icon']")).click();
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='ch_login_email']")).click();
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ch_login_email']")).sendKeys("9840751113");
		driver.findElement(By.xpath("//input[@id='ch_login_password']")).sendKeys("trips@1989");
		driver.findElement(By.xpath("//button[@id='ch_login_btn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).clear();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("chen");
		Thread.sleep(2000);
		
		List <WebElement> source= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i=0;i<source.size();i++)
		
		{
			if(source.get(i).getText().equalsIgnoreCase("chennai"))
			{
				source.get(i).click();
			}
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys("goa");
		Thread.sleep(2000);

		List <WebElement> destination = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		
		for(int i=0; i< destination.size();i++)
		{
			if(destination.get(i).getText().equalsIgnoreCase("goa"))
			{
				destination.get(i).click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();
		
		for (int i=0;i<11;i++)
		{
	    String month = driver.findElement(By.xpath("//*[@id='dp1550486037795']/div/div[1]/div/div/span[1]")).getText();
	    Thread.sleep(2000);
	    if(month.equalsIgnoreCase("march"))
	    {
	    	List <WebElement> date= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//td"));
	    	
	    	for(int k=0;k<date.size();k++)
			{
				if(date.get(k).getText().equals("19"))
				{
					date.get(k).click();
					break;
				}
			}
			
	    }
	    else
	    	driver.findElement(By.xpath("//*[@id='dp1550481157468']/div/div[2]/div/a/span")).click();
	    Thread.sleep(2000);
		}
	}

}
