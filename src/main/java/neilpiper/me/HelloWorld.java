package neilpiper.me;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello World example.
 * 
 * @author neilpiper
 *
 */
public class HelloWorld {

  private static Logger logger = LogManager.getLogger(HelloWorld.class);

  public static void main(String[] args) {

    logger.debug("Debug Log Message Hello World");
  }

  /**
   * Test do nothing method.
   * 
   */
  public void test() {
    logger.info("Executed test");
  }

}