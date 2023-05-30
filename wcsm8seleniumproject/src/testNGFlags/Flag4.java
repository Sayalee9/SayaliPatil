package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	//to execute the annotation or method according to priority
  @Test
  public void f() {
	  
	Reporter.log("f method", true);
  }
  
  @Test(priority = 1)
  public void a() {
	  
		Reporter.log("a method", true);
  }
  
  @Test
  public void g() {
	  
		Reporter.log("g method", true);
  }
  @Test(priority = -1)
  public void m() {
	  
		Reporter.log("m method", true);
  }
  @Test
  public void p() {
	  
		Reporter.log("p method", true);
  }
  @Test
  public void q() {
	  
		Reporter.log("q method", true);
  }  
  @Test
  public void r() {
	  
		Reporter.log("r method", true);
  }  
  @Test
  public void s() {
	  
		Reporter.log("s method", true);
  }
  
}
