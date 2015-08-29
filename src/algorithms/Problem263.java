package algorithms;

/**
 * Ugly Number
 *
 * @author kobe
 *
 */
public class Problem263 {

  public boolean isUgly(int num) {

    if (num <= 0) {
      return false;
    }

    int[] primes = new int[] {2, 3, 5};

    for (int p : primes) {

      while (num % p == 0) {
        num /= p;
      }

    }

    if (num > 1) {
      return false;
    }

    return true;

  }

  public static void main(String args[]) {

    Problem263 p = new Problem263();

    int[] nums = new int[] {6, 8, 14};

    long start = System.currentTimeMillis();
    for (int n : nums) {
      System.out.println(n + ":" + p.isUgly(n));
    }
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
