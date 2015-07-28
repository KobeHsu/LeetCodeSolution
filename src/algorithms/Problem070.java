package algorithms;

/**
 * Climbing Stairs
 *
 * @author kobe
 *
 */
public class Problem070 {

  // cause Time Limit Exceeded
  public int climbStairs_(int n) {

    int total = 0;

    total = step(0, n);

    return total;
  }

  private int step(int accum, int n) {

    if (accum == n) {
      return 1;
    } else if (accum > n) {
      return 0;
    }

    return step(accum + 1, n) + step(accum + 2, n);

  }

  // Fibonacci
  public int climbStairs(int n) {

    if (n == 0) {
      return 1;
    }

    if (n == 1) {
      return 1;
    }

    if (n == 2) {
      return 2;
    }

    int first = 1;
    int second = 2;
    int count = 0;

    for (int i = 2; i < n; i++) {

      count = first + second;
      first = second;
      second = count;

    }

    return count;
  }

  public static void main(String args[]) {

    Problem070 p = new Problem070();

    long start = System.currentTimeMillis();
    System.out.println(p.climbStairs(1));
    System.out.println(p.climbStairs(2));
    System.out.println(p.climbStairs(3));
    System.out.println(p.climbStairs(4));
    System.out.println(p.climbStairs(5));
    System.out.println(p.climbStairs(6));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
