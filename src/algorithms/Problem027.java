package algorithms;

import java.util.Arrays;

/**
 * Remove Element
 *
 * @author kobe
 *
 */
public class Problem027 {

  public int removeElement_(int[] nums, int val) {

    int len = nums.length;
    if (len == 0) {
      return 0;
    }

    Arrays.sort(nums);

    boolean found = false;
    int del = 0;

    for (int i = 0; i < len; i++) {

      if (nums[i] == val) {
        found = true;
        del++;
      } else if (found) {
        nums[i - del] = nums[i];
      }

    }

    return len - del;
  }

  public int removeElement(int[] nums, int val) {

    int len = nums.length;
    if (len == 0) {
      return 0;
    }

    int del = 0;

    for (int i = 0; i < len; i++) {

      if (nums[i] == val) {
        del++;
      } else {
        nums[i-del]= nums[i];
      }

    }

    return len - del;
  }


  public static void main(String args[]) {

    Problem027 p = new Problem027();

    int[] nums = new int[] {1, 6, 1, 2, 6, 3, 6, 4, 5, 5, 6, 6, 6, 7};

    long start = System.currentTimeMillis();
    System.out.println(p.removeElement(nums, 6));
    for (int n : nums) {
      System.out.print(n + ",");
    }
    System.out.println();
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
