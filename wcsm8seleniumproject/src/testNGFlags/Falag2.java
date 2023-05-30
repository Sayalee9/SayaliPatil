package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Falag2 {
	
	//method or annotation is enable or disable
  @Test(enabled = false, description = "login method")
  public void method1() {
	  
	  Reporter.log("Login performed!!", true);
  }
  
  @Test(enabled = true, description = "logout method")
  public void method2() {
	  
	  Reporter.log("Logout performed!!", true);
  }
}
