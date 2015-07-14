package algorithms;

/**
 * Reverse Bits
 *
 * @author kobe
 *
 */
public class Problem190 {

  public int reverseBits(int n) {

    int reverse = 0;

    for (int i = 0; i < 32; i++) {

      int tmp = n << i;
      tmp = (tmp >>> 31) << i;

      reverse += tmp;
    }

    return reverse;
  }

  public int reverseBits_(int n) {

    n = (n & 0x55555555) << 1 | (n & 0xAAAAAAAA) >>> 1;
    n = (n & 0x33333333) << 2 | (n & 0xCCCCCCCC) >>> 2;
    n = (n & 0x0F0F0F0F) << 4 | (n & 0xF0F0F0F0) >>> 4;
    n = (n & 0x00FF00FF) << 8 | (n & 0xFF00FF00) >>> 8;
    n = (n & 0x0000FFFF) << 16 | (n & 0xFFFF0000) >>> 16;
    return n;

  }

  public static void main(String args[]) {

    Problem190 p = new Problem190();

    long start = System.currentTimeMillis();
    System.out.println(p.reverseBits(43261596));
    System.out.println(p.reverseBits_(43261596));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
