package Run;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount {
  
	//Third Executed Annotation
	@Test
  public void f() {
	  System.out.println("Annotation is Test");
  }
 
  //Second Executed Annotation
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotation is Before Method");
  }

  //Forth Executed Annotation
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotation is After Method");
  }

  
  //First Executed Annotation
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotation is Before class");
  }

  
  //Fifth Executed Annotation
  @AfterClass
  public void afterClass() {
	  System.out.println("Annotation is After Method");
  }

}
