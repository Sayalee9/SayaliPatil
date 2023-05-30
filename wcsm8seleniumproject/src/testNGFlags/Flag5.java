package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "login testcase")
  public void loginmethod() {
	  Reporter.log("login performed",true);
  }
  
  @Test(description = "Create User testcase", dependsOnMethods = "loginmethod")
  public void createuser() {
	  Reporter.log("user created",true);
  }
  
  @Test(description = "logout Testcase", dependsOnMethods = "createuser")
  public void logoutmethod() {
	  Reporter.log("logout performed",true);
  }
}
