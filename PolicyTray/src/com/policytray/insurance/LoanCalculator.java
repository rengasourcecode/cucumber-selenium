package com.policytray.insurance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class LoanCalculator extends PolicyTray{

	void loancalculation() throws InterruptedException, IOException
	{
		
		driver.findElement(By.xpath("//li//a[@href='LoanCalculator.aspx']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td//input[@id='ContentPlaceHolder1_txtName']")).sendKeys("RENGANATHAN");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td//input[@id='txtMobile']")).sendKeys("9840751113");
		Thread.sleep(1000);
		
		Select s1= new Select(driver.findElement(By.xpath("//td[@class='style11']//select[@id='ddlPlan']")));
		s1.selectByValue("75");
		Thread.sleep(1000);
		
		
		Select s2= new Select(driver.findElement(By.xpath("//td[@class='style11']//select[@id='ddlTerm']")));
		s2.selectByValue("20");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtInstallments']")).sendKeys("20");
		Thread.sleep(4000);
		
		File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("D:\\cucumberscreenshots\\policytray\\loancalculator\\loan1.png"));
		
		
		Select s3=new Select(driver.findElement(By.xpath("//td[@class='style11']//select[@id='ContentPlaceHolder1_ddlMode']")));
		s3.selectByValue("3");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[@class='style11']//input[@id='ContentPlaceHolder1_txtPremium']")).sendKeys("6000");
		Thread.sleep(1000);

		Select s4= new Select(driver.findElement(By.xpath("//td[@class='style11']//select[@id='ddlPolicyYear']")));
		s4.selectByValue("10");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnGetLoanValue']")).click();
		Thread.sleep(4000);
		
		File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("D:\\cucumberscreenshots\\policytray\\loancalculator\\loan2.png"));
		
	}
}
