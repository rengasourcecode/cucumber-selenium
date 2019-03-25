package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingMusic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.masstamilan.org/");
		String parent= driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Petta (BGM) Songs Download']")).click();
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/downloader/Nuut-YIhIDovuPjkEdy7dw/1551783682/zip128/1692']")).click();
		
		
		


	}
 
}
