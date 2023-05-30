package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
	//it is used to perform group execution
  @Test(groups = "functional testing")
  public void ft1() {
	  
	  Reporter.log("ftc1", true);
  }
  @Test(groups = "smoke testing")
  public void st1() {
	  
	  Reporter.log("stc1", true);
  }
  @Test(groups = "integretion testing")
  public void it1() {
	  
	  Reporter.log("Itc1", true);
  }
  //........................................
  
  @Test(groups = "functional testing")
  public void ft2() {
	  
	  Reporter.log("ftc2", true);
  }
  @Test(groups = "smoke testing")
  public void st2() {
	  
	  Reporter.log("stc2", true);
  }
  @Test(groups = "Integretion testing")
  public void it2() {
	  
	  Reporter.log("Itc2", true);
  }
  ///.....................................
  
  @Test(groups = "functional testing")
  public void ft3() {
	  
	  Reporter.log("ftc3", true);
  }
  @Test(groups = "Smoke testing")
  public void st3() {
	  
	  Reporter.log("stc3", true);
  }
  @Test(groups = "integration testing")
  public void it3() {
	  
	  Reporter.log("ITC3", true);
  }
  //.......................................
  @Test(groups = "functional testing")
  public void ft4() {
	  
	  Reporter.log("ftc4", true);
  }
  @Test(groups = "SMOKE testing")
  public void St4() {
	  
	  Reporter.log("STC4", true);
  }
  @Test(groups = "integretion testing")
  public void It4() {
	  
	  Reporter.log("ITC4", true);
  }
  //....................................
  @Test(groups = "functional testing")
  public void ft5() {
	  
	  Reporter.log("ftc5", true);
  }
  @Test(groups = "Smoke testing")
  public void st5() {
	  
	  Reporter.log("stc5", true);
  }
  @Test(groups = "Integretion testing")
  public void it5() {
	  
	  Reporter.log("ITC5", true);
  }
  
 //..............
  @Test(groups = "functional testing")
  public void ft6() {
	  
	  Reporter.log("ftc6", true);
  }
  @Test(groups = "SMOKE testing")
  public void st6() {
	  
	  Reporter.log("stc6", true);
  }
  @Test(groups = "Integretion testing")
  public void It6() {
	  
	  Reporter.log("itc6", true);
  }
  
}
