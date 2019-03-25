package FBdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FbDefinition {

	static WebDriver driver;
	@Given("user is the facebook login page")
	public void user_is_the_facebook_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	  	}

	@Then("user enters the username \"([^\"]*)\"")
	public void user_enters_the_username(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
		Thread.sleep(1000);


		
	}

	@Then("user enters the password \"([^\"]*)\"")
	public void user_enters_the_password(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(string);
		Thread.sleep(2000);


		
	}
	
	@Then("user clicks the submit button")
	public void user_clicks_the_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);
		


	}


}
