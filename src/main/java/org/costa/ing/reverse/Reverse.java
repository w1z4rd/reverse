package org.costa.ing.reverse;

/**
 * @author costelradulescu
 *
 */
public class Reverse {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String s = "abcd";
    System.out.println(reverse(s));
  }

  /**
   * 
   * @param input
   *          to reverse (must not contain {blank space})
   * @return reversed input example: "abcd" -> "dcba"
   */
  public static String reverse(String input) {
    if (input == null || input.isEmpty())
      return "";
    if (!input.contains(" ")) {
      return reverse(input + " ");
    }
    if (input.charAt(0) == ' ') {
      return input.trim();
    }
    char t = input.charAt(input.indexOf(' ') - 1);
    input = input.replace(t + "", "");
    return reverse(input + t);
  }
}
