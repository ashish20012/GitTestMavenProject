package TestGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitTestLogin {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("http://192.168.10.92/ashishtenant/login/");
		driver.findElement(By.name("username")).sendKeys("ashishtenant");
		driver.findElement(By.id("user-password")).sendKeys("123456");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
