package algorithms;

/**
 * Single Number
 *
 * @author kobe
 *
 */
public class Problem136 {

  public int singleNumber(int[] nums) {
    int single = 0;
    for (int i : nums) {
      single = single ^ i;
    }
    return single;
  }

  public static void main(String args[]) {

    Problem136 p = new Problem136();

    int[] nums = new int[] {1, 1, 2, 3, 2, 4, 4};

    long start = System.currentTimeMillis();
    System.out.println(p.singleNumber(nums));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
