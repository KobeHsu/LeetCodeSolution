package algorithms;

/**
 * Number of 1 Bits
 *
 * @author kobe
 *
 */
public class Problem191 {

  public int hammingWeight_(long n) {

    int count = 0;

    while (n > 0) {

      if ((n & 1) == 1) {
        count++;
      }

      n = n >>> 1;

    }

    return count;

  }

  public int hammingWeight(int n) {

    int count = 0;

    for (int i = 0; i < 32; i++) {

      if ((n & 1) == 1) {
        count++;
      }

      n >>= 1;

    }

    return count;

  }

  public static void main(String args[]) {

    Problem191 p = new Problem191();

    long start = System.currentTimeMillis();
    System.out.println(p.hammingWeight_(2147483648l));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
