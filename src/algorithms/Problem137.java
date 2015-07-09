package algorithms;

import java.util.Arrays;

/**
 * Single Number II
 *
 * @author kobe
 *
 */
public class Problem137 {

  public int singleNumber(int[] nums) {

    int single = 0;

    if (nums.length == 0) {
      return single;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i += 3) {
      if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
        return nums[i];
      }
    }

    return single;

  }

  public static void main(String args[]) {

    Problem137 p = new Problem137();

    int[] nums = new int[] {1, 1, 1, 2, 3, 4, 2, 4, 4, 7, 2, 3, 3};

    long start = System.currentTimeMillis();
    System.out.println(p.singleNumber(nums));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
