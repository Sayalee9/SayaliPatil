package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest6 {
  @Test
  public void f() {
	  Reporter.log("f method from DemoTest6", true);
  }
  @Test
  public void h() {
	  Reporter.log("h method from DemoTest6", true);
  }
  @Test
  public void i() {
	  Reporter.log("i method from DemoTest6", true);
  }
}
