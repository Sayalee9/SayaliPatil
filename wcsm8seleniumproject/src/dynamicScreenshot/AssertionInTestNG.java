package dynamicScreenshot;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionInTestNG {
	static WebDriver driver;
  @BeforeTest
  
  public void property() {
	  System.setProperty("webdriver.chrome.driver","./drivers.chrome.driver");
	  
  }
  @BeforeMethod
  public void setUp()
  {
	  driver =  new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://laptop-flp0l0o8/login.do");
	  String actualLoginPageTitle = driver.getTitle();
	  //apply soft assert
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(actualLoginPageTitle, "idontknow");
  }
	
  @Test(alwaysRun = true)
  public void login()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  WebElement loginButton = driver.findElement(By.id("loginButton"));
	  
	 //apply hard Assert
	  if(loginButton.isDisplayed())
	  {
		  assert.assertEquals(true, true);
		  loginButton.click();
	  }
	  else
	  {
		  Reporter.log("Exeception" true);
	  }
	  String actualLoginPageTitle = driver.getTitle();
  }
}
