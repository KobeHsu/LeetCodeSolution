package algorithms;

/**
 * Factorial Trailing Zeroes
 *
 * @author kobe
 *
 */
public class Problem172 {

  public int trailingZeroes(int n) {

    if (n == 0) {
      return 0;
    }

    return n / 5 + trailingZeroes(n / 5);

  }

  public static void main(String args[]) {

    Problem172 p = new Problem172();

    long start = System.currentTimeMillis();
    System.out.println(p.trailingZeroes(30));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
