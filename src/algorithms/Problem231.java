package algorithms;

/**
 * Power of Two
 *
 * @author kobe
 *
 */
public class Problem231 {

  public boolean isPowerOfTwo(int n) {

    long base = 1;
    long powerOfTwo = 1;

    while (n >= powerOfTwo) {
      if (n == powerOfTwo) {
        return true;
      }
      powerOfTwo <<= base;
    }

    return false;

  }

  public static void main(String args[]) {

    Problem231 p = new Problem231();
    System.out.println(p.isPowerOfTwo(2));
    System.out.println(p.isPowerOfTwo(8));
    System.out.println(p.isPowerOfTwo(1073741825));

  }
}
