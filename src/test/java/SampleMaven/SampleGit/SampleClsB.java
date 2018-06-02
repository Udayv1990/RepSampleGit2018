package SampleMaven.SampleGit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClsB {
  @Test
  public void f1() {
	  System.out.println("Sample Class B --f1");
	  Assert.assertTrue(true);
  }
  @Test
  public void f2() {
	  System.out.println("Sample Class B --f2");
	  Assert.assertTrue(true);
  }
}
