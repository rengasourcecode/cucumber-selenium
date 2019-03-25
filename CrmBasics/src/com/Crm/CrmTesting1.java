package com.Crm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrmTesting1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("automationbytes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//SWITCHING TO FRAME
		
		driver.switchTo().frame("mainpanel");
		//Thread.sleep(10000);;
		driver.findElement(By.xpath("//*[@title='Pipeline']")).click();
		
		//ACTION CLASS
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@title='Deals']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@title='Full Search Form']")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.switchTo().frame("mainpanel");
		act.moveToElement(driver.findElement(By.xpath("//*[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=prospect&sub=search']")).click();


		
		//WebElement <List> elements = 
		/*driver.findElement(By.xpath("//*[@id='source']")).click();
		driver.findElement(By.xpath("//*[@id='source']")).sendKeys("Che");
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("//*[@id='ui-id-13']")).click();
		
		List <WebElement> elements = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println(elements.size());
		for(int i=0;i<=elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			if(elements.get(i).getText().equals("Chennai"))
			{
				elements.get(i).click();
			}
		}*/
			
		
		

	}

}
