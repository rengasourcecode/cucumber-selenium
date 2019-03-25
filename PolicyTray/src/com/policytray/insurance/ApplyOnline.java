package com.policytray.insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ApplyOnline extends PolicyTray {

	static void applyinsurance() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//li//a[contains(text(),'Apply Online')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtFirstName']")).sendKeys("RENGANATHAN");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtLastName']")).sendKeys("VENKATRAMAN");
		Thread.sleep(1000);
		
		Select s1= new Select(driver.findElement(By.xpath("//table[@id='tblApplyOnline']//*[@id='ContentPlaceHolder1_DDLDate']")));
		s1.selectByValue("19");
		Thread.sleep(1000);
		
		Select s2= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_DDLMonth']")));
		s2.selectByValue("02");
		Thread.sleep(1000);
		
		Select s3= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_DDLYear']")));
		s3.selectByValue("1989");
		Thread.sleep(1000);
		
		Select s4= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlGender']")));
		s4.selectByValue("Male");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@id='ContentPlaceHolder1_txtAddress']")).sendKeys("VIRUGAMBAKKAM");
		Thread.sleep(2000);
		
		Select s5= new Select(driver.findElement(By.xpath("//table[@class='tblborder padding10']//tr//td//select[@id='ContentPlaceHolder1_ddlCity']")));
		s4.selectByValue("4");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtMobileNo']")).sendKeys("9840751113");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtEmail']")).sendKeys("cnt2dinesh@gmail.com");
		Thread.sleep(1000);
		
		Select s6= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlPlan']")));
		s6.selectByValue("820");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtSumAssured']")).sendKeys("500000");
		Thread.sleep(1000);
		
		Select s7= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlPolicyTerm']")));
		s7.selectByValue("30");
		Thread.sleep(1000);
		
		Select s8=new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlPaymentMode']")));
		s8.selectByValue("3");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_imgApplyOnlineNext']")).click();
		Thread.sleep(1000);
		

	}
}
