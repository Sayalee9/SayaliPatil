package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNGpack2.FireFoxDriver;



public class SelectBrowser {
	static WebDriver driver;
	@Parameters({"browser","url","Vusername","Vpassword"})

	@Test
	public void method1(String browserValue ,String url, String usn , String pass) {
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/grckodriver.exe");
	WebDriver	driver	=new FireFoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(usn);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	driver.findElement(By.id("loginButton")).click();
	
	
	
		}
		else
		{
			System.out.println("invalid browser");
		}
	}

}
