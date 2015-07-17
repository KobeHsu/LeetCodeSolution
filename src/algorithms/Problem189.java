package algorithms;

import java.util.Arrays;

/**
 * Rotate Array
 *
 * @author kobe
 *
 */
public class Problem189 {

  public void rotate(int[] nums, int k) {

    if (nums.length == 0 || k < 1) {
      return;
    }

    int len = nums.length;

    int end = len - 1;

    k = k % len;
    end = len - k;

    int[] shift = new int[len];

    int i = end;
    int j = 0;
    for (j = 0, i = end; i < len; i++, j++) {
      shift[j] = nums[i];
    }

    for (i = 0; i < end; j++, i++) {
      shift[j] = nums[i];
    }

    // restore
    for (i = 0; i < len; i++) {
      nums[i] = shift[i];
    }

  }

  public static void main(String args[]) {

    Problem189 p = new Problem189();

    int[] nums = new int[] {1, 2, 3};
    int k = 5;

    System.out.println(Arrays.toString(nums));

    long start = System.currentTimeMillis();
    p.rotate(nums, k);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    System.out.println(Arrays.toString(nums));

  }
}
