package org.costa.ing.reverse;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ReverseTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName
   *          name of the test case
   */
  public ReverseTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(ReverseTest.class);
  }

  /**
   * Successful test with "abcd" input
   */
  public void testSuccessful() {
    String actual = Reverse.reverse("abcd");
    String expected = "dcba";
    assertEquals(expected, actual);
  }

  /**
   * Null input test
   */
  public void testNullInput() {
    String actual = Reverse.reverse(null);
    String expected = "";
    assertEquals(expected, actual);
  }

  /**
   * Empty input test
   */
  public void testEmptyInput() {
    String actual = Reverse.reverse("");
    String expected = "";
    assertEquals(expected, actual);
  }
  
  public void testRepetingCharactersInput() {
    String actual = Reverse.reverse("aaabbbccdd");
    String expected = "ddccbbbaaa";
    assertEquals(expected, actual);
  }

}
