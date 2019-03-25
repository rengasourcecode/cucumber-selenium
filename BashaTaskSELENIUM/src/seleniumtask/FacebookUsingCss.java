package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUsingCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#email")).sendKeys("rengasourav@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("JINGU1989");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label#loginbutton")).click();
		
	}

}
