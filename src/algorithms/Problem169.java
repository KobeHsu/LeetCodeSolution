package algorithms;

import java.util.Arrays;

/**
 * Majority Element
 *
 * @author kobe
 *
 */
public class Problem169 {

  public int majorityElement(int[] nums) {

    int len = nums.length;
    int half = len / 2;

    Arrays.sort(nums);

    for (int i = 0; i <= half; i++) {

      int d = i + half;
      if (d < len) {
        if (nums[i] == nums[d]) {
          return nums[i];
        }
      }

    }

    return 0;
  }

  public static void main(String args[]) {

    Problem169 p = new Problem169();
    int[] nums = new int[] {6, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5};

    long start = System.currentTimeMillis();
    System.out.println(p.majorityElement(nums));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
