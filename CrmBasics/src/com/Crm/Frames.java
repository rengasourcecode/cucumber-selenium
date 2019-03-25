package com.Crm;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
    
	    driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> l1= driver.findElements(By.xpath("//html//frame"));
		System.out.println(l1.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
		driver.findElement(By.xpath("//*[@title='Pipeline']")).click();

		

		
		
		
		/*for(int i=0;i<l1.size();i++)
		{
			//System.out.println(l1.get(i).getAttribute("name"));
			//System.out.println(l1.get(1).getText());
				if(l1.get(i).getAttribute("name").equals("mainpanel"))
					driver.switchTo().frame(i);
			
		}*/
		//driver.findElement(By.xpath("//*[@title='Pipeline']")).click();

	
	}
	


}
