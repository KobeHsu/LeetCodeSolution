package algorithms;

/**
 * Contains Duplicate II
 *
 * @author kobe
 *
 */
public class Problem219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {

    if (nums.length == 0) {
      return false;
    }

    int lastNum = nums[0];
    int count = 0;

    for (int i = 1; i < nums.length; i++) {

      if (lastNum == nums[i]) {
        count++;
      } else {
        count = 0;
      }

    }

    return count > 0;

  }

  public static void main(String args[]) {

    int[] nums = new int[] {};
    int k = 3;
    Problem219 p = new Problem219();
    System.out.println(p.containsNearbyDuplicate(nums, k));

    nums = new int[] {1, 2, 3, 45, 71, 3, 3, 3, 32, 2};
    System.out.println(p.containsNearbyDuplicate(nums, k));

  }

}
