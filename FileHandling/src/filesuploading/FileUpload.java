package filesuploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rengaofficial");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("DINESHFEB19");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(3000);*/
		
	
		
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(1000);
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Dinesh\\Desktop\\testing.txt");
		
       
	}

}
