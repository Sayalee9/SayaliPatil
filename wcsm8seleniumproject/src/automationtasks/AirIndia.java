package automationtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirIndia {
   public static void main(String[] args) throws InterruptedException {
       // Set the path of the ChromeDriver executable
       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

       // Create a new instance of ChromeDriver
       WebDriver driver = new ChromeDriver();

       // Navigate to the Air India website
       driver.get("https://www.airindia.in/");

       // Find the "Login" button and click it
       WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
       loginButton.click();

       // Enter the username and password
       WebElement username = driver.findElement(By.id("loginForm:loginId"));
       username.sendKeys("your_username");
       WebElement password = driver.findElement(By.id("loginForm:password"));
       password.sendKeys("your_password");

       WebElement signInButton = driver.findElement(By.id("loginForm:signInButton"));
       signInButton.click();

   }
}
