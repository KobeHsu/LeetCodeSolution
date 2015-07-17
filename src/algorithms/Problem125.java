package algorithms;

/**
 * Valid Palindrome
 *
 * @author kobe
 *
 */
public class Problem125 {

  public boolean isPalindrome(String s) {

    if (s == null || s.length() == 0) {
      return true;
    }

    s = s.replaceAll("[^\\w]", "").toLowerCase();

    boolean result = true;

    int len = s.length();
    char[] c = s.toCharArray();
    for (int i = 0; i < len/2; i++) {
      
      if (c[i] != c[len - i - 1]) {
        return false;
      }
    }

    return result;

  }

  public static void main(String args[]) {

    Problem125 p = new Problem125();

    long start = System.currentTimeMillis();
    System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(p.isPalindrome("race a car"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
