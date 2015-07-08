package algorithms;

import java.util.Arrays;

/**
 * Count Primes
 *
 * @author kobe
 *
 */
public class Problem204 {

  public int countPrimes(int n) {

    if (n <= 2) {
      return 0;
    }

    if (n == 3) {
      return 1;
    }

    int[] primes = new int[20000];
    primes[0] = 2;
    primes[1] = 3;

    int count = 2;
    int idx = 2;
    int gap = 4;

    for (int i = 5; i < n; i += gap) {

      boolean isPrime = true;

      for (int p : primes) {

        if (p == 0 || p * p > i) {
          break;
        }

        if (i % p == 0) {
          isPrime = false;
          break;
        }

      }

      if (isPrime) {

        if (idx == primes.length - 1) {
          primes = Arrays.copyOf(primes, primes.length * 2);
        }

        primes[idx++] = i;
        count++;
      }

      gap = 6 - gap;

    }

    return count;

  }

  public static void main(String args[]) {

    long start = System.currentTimeMillis();
    Problem204 p = new Problem204();
    System.out.println(p.countPrimes(499979));
    long end = System.currentTimeMillis();
    System.out.println(end - start);

  }

}
