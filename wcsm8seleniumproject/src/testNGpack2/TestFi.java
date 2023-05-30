package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFi {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FireFoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Java" ,Keys.ENTER);
		

	  
  }
}
