package seleniumtask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MercuryBooking {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\homepage.png"));
		
	
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\valid-login.png"));
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Thread.sleep(1000);
		
		Select s1= new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		s1.selectByValue("4");
		Thread.sleep(1000);
		
		Select s2= new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		s2.selectByValue("London");
		Thread.sleep(1000);
		
		Select s3= new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		s3.selectByValue("2");
		Thread.sleep(1000);
		
		Select s4= new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		s4.selectByValue("19");
		Thread.sleep(1000);
		
		Select s5= new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		s5.selectByValue("New York");
		Thread.sleep(1000);
		
		Select s6= new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		s6.selectByValue("4");
		Thread.sleep(1000);
		
		Select s7= new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		s7.selectByValue("6");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='First']")).click();
		Thread.sleep(1000);
		
		File src3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src3,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\passenger-details.png"));
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(2000);
		
		File src4= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src4,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\flight-details.png"));
		Thread.sleep(1000);
		
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(3000);
		
		File src5= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src5,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\payment.png"));
		Thread.sleep(1000);
		
		driver.findElement(By.name("buyFlights")).click();
		Thread.sleep(2000);
		
		File src6= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src6,new File("D:\\cucumberscreenshots\\mercuryscreenshot\\booking-status.png"));
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
	}

}
