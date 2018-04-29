package neilpiper.me;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  HelloWorld unitUnderTest;

  @Before
  public void setUp() {
    unitUnderTest = new HelloWorld();
  }

  @Test public void testDebug()
  {
    HelloWorld.main(new String[]{"Hi World"});
  }
  
  
  @Test
  public void testHelloWorld() {
    unitUnderTest.test();
  }

}
