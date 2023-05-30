package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GooglesearchTestCase  extends BaseTest{
	@Test(description = "search for java!!")
	public void search1() {
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
		
	}
	@Test(description = "search for sql!!")
	public void search2() {
		driver.switchTo().activeElement().sendKeys("sql", Keys.ENTER);
		
	}
	@Test(description = "search forselenium")
	public void search3() {
		driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
		
	}

}
