package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
   //to describe the method
	
  @Test(description = "This method perfom login!!!")
  public void method1() {
	  
	  Reporter.log("method 1 login!!!!",true);
  }
}
