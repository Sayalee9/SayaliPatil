package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest5 {
  @Test
  public void p() {
	  Reporter.log("p method from Demotest5", true);
  }
  
  @Test
  public void q() {
	  Reporter.log("q method from Demotest5", true);
  }
  
  @Test
  public void r() {
	  int i=10;
	  int j=5;
	  int res=i/j;
	 
	  Reporter.log("r method from Demotest5", true);
  }
}
