package filesuploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadUsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","D:\\sedrivermozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div/section/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		
		Robot robot=new Robot();
		
		// down arrow three times tab and enter
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);

		
		robot.keyPress(KeyEvent.VK_ENTER);

	
	}

}
