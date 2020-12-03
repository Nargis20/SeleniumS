package Run;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ForProperties {
  @Test
  public void f() throws IOException {
	  Properties pro = new Properties();
	  FileInputStream fis = new FileInputStream("C:\\Users\\wnnar\\eclipse-workspace\\SeleniumS\\Config.properties");
	  pro.load(fis);
	  System.out.println(pro.getProperty("Name"));
	  System.out.println(pro.getProperty("Student"));
  }
}
