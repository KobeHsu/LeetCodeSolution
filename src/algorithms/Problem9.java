package algorithms;

/**
 * Palindrome Number
 *
 * @author kobe
 *
 */
public class Problem9 {

  public boolean isPalindrome(int x) {

    if (x >= 0 && x < 10) {
      return true;
    }

    if (x == Integer.MAX_VALUE) {
      return false;
    }

    int digits = 0;

    int n = x;
    while (n > 0) {
      digits++;
      n = n / 10;
    }

    int half = digits / 2;
    boolean hasMid = (digits % 2 == 1);

    n = x;
    int x2 = 0;

    for (int i = 0; i < half; i++) {

      int d = n % 10;

      x2 += d * Math.pow(10, i);
      x2 += d * Math.pow(10, digits - i - 1);

      n = n / 10;

    }

    if (hasMid) {
      x2 += (n % 10) * Math.pow(10, half);
    }

    return (x2 - x == 0);
  }

  public static void main(String args[]) {

    Problem9 p = new Problem9();

    long start = System.currentTimeMillis();
    System.out.println(p.isPalindrome(0));
    System.out.println(p.isPalindrome(123454321));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
