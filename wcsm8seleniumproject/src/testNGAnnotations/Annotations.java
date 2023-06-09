package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  
	  Reporter.log("test annotations", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforemethod annotation", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("aftermethod annotation", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeclass annotations", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterclass annotations", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforetest annotations", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("aftertest annotations", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforesuite annotations", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("aftersuite annotations", true);
  }
  
  @Test
  public void testMethod() {
	  Reporter.log("test annotations2", true);
  }

}
