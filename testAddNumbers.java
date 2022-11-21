package jUnitTestinPackage;

import static org.junit.Assert.*;
  
public class testAddNumbers {
  
  public void test() {
    jUnitFunction jUnit = new jUnitFunction();
    int result = junit.addNumbers(100,200);
    assertEquals (300,result);
  }
}
