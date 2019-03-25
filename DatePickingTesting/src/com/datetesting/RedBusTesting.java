package com.datetesting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		//FOR DISABLING NOTIFICATIONS (DESIRED CAPABILITIES)
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);

		
		//driver.get("https://www.abhibus.com/");
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("che");
		List <WebElement> source=driver.findElements(By.xpath("//div//ul[@class='autoFill']"));
		for(int i=0;i<source.size();i++)
		{
			if(source.get(i).getText().equals("Chennai"))
			{
				source.get(i).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.id("dest")).sendKeys("pun");
		List <WebElement> dest=driver.findElements(By.xpath("//div//ul[@class='autoFill']"));
		for(int i=0;i<dest.size();i++)
		{
			if(dest.get(i).getText().equals("Pune"))
			{
				dest.get(i).click();
			}
		}
	    Thread.sleep(10000);
	    
	 	JavascriptExecutor js = (JavascriptExecutor) driver;  
	 	//js.executeScript(Script,Arguments);
	 	WebElement search=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span"));

	 	js.executeScript("arguments[0].click();",search );

	    //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://xds.gsecondscreen.com/xds2/']")));
	    
	   // Thread.sleep(2000);
	    
		
		for( int i=0;i<12;i++)
		{
			//System.out.println(driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText());
			String monthyear=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
			String array[]=monthyear.split(" ");
		
			if(array[0].equals("Apr"))
			{
				
				List <WebElement> date=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
				for (i=0;i<date.size();i++)
				{
					if(date.get(i).getText().equals("6"))
					{
						date.get(i).click();
					}
						
				}

			}else
				
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		}
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();
			
			for(int k=0;k<12;k++)
			{   
				String date2=driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//table//td[@class='monthTitle']")).getText();
			    String arr[]=date2.split(" ");
				
			    	if(arr[0].equals("Feb"))
			       	{
					//driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//table//td[@class='wd day' and contains(text(),'19')]")).click();
					
					//break;
					
					List <WebElement> rdate=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
					for (int i=0;i<rdate.size();i++)
					{
						if(rdate.get(i).getText().equals("19"))
						{
							rdate.get(i).click();
							//break;
						}
					}break;
			       	}
			            else
				
					driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//table//td[@class='next']")).click();
				    }  
			Thread.sleep(10000);
			
		/*	WebElement submit=driver.findElement(By.id("search_btn"));
		 	js.executeScript("arguments[0].click();",submit ); */

			//driver.findElement(By.id("search_btn")).click();
		//
			// WebElement Alloperators =driver.findElement(By.xpath("//a[contains(text(),'All Operators')]"));
			 WebElement global =driver.findElement(By.xpath("//div[contains(text(),'Our Global Presence')]"));

			// js.executeScript("arguments[0].scrollIntoView(true);",Alloperators);
			 js.executeScript("arguments[0].scrollIntoView(true);",global);

			 Thread.sleep(3000);
		 	//js.executeScript("arguments[0].click();",Alloperators );
				WebElement submit=driver.findElement(By.id("search_btn"));
			 	js.executeScript("arguments[0].click();",submit );


			
	}}

	


