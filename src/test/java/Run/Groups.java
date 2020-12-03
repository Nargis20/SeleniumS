package Run;


import org.testng.SkipException;
import org.testng.annotations.Test;

public class Groups {
  /* Catagories
   * 1. Smoke
   * 2. Regression
   * 3. Adhoc
   */
  @Test(groups = {"Smoke"})
  public void for_group() {
	  System.out.println("Smoke test with for_group Method");
  }
  @Test(groups = {"Adhoc","Regression"})
  public void ForGroup1() {
	  throw new SkipException("Forcing to skip");
	  
	  //System.out.println("Adhoc or Regression test with ForGroup1 Method");
  }
  @Test(groups = {"Regression"})
  public void ForGroup2() {
	  System.out.println("Regression test with ForGroup2 Method");
  }
  @Test(groups = {"Adhoc", "Smoke"})
  public void ForGroup3() {
	  System.out.println("Adhoc or Smoke test with ForGroup3 Method");
  }
  @Test(groups = {"Adhoc"})
  public void ForGroup4() {
	  System.out.println("Adhoc test with ForGroup4 Method");
  }
  @Test(groups = {"Regression"})
  public void ForGroup5() {
	  System.out.println("Regression test with ForGroup5 Method");
  }
}
