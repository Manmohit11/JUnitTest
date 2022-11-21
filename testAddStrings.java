package jUnitTestingPackage;

import static org.junit.Assert.*;

public class testAddStrings {
  
  public void test() {
    jUnitFunction junitstring = new jUnitFunction();
    String result = junitstring.addStrings("captions", "project");
    assertEquals("captionsproject", result);
  }
}
