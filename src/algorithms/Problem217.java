package algorithms;

import java.util.Arrays;

/**
 * Contains Duplicate
 *
 * @author kobe
 *
 */
public class Problem217 {

  public boolean containsDuplicate(int[] nums) {

    if (nums.length == 0) {
      return false;
    }

    Arrays.sort(nums);

    int lastNum = nums[0];
    for (int i = 1; i < nums.length; i++) {

      if (lastNum == nums[i]) {
        return true;
      }
      lastNum = nums[i];

    }

    return false;

  }

  public static void main(String args[]) {

    int[] nums = new int[] {};
    Problem217 p = new Problem217();
    System.out.println(p.containsDuplicate(nums));

    nums = new int[] {1, 2, 3, 45, 71, 32, 2};
    System.out.println(p.containsDuplicate(nums));

  }

}
