package testngexample;

import org.testng.annotations.Test;

public class ParallelClass {
	@Test ( groups = {"sanity"})
  
  public void Test1()
  
  {
  System.out.println(" test 1 method ");
  }

	
	@Test (groups = {"sanity "})

  public void test2() {
	  System.out.println("test 2 method ");
  }
  
  
	
  
  @Test (groups = {"regression"})
  public void test3() {
	  System.out.println(" test 3 method ");
  }



@Test ( groups = {"regression"})
public void test4() {
	  System.out.println(" test 4 method ");
}


@Test (groups = {"regression"})
public void test5() {
	  System.out.println(" test 5 method ");
}
}