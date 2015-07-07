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


    for (int i = 0; i < nums.length; i++) {

      int n = nums[i];
      int stop = (i + k - 1);

      for (int j = nums.length - 1; j >= stop; j--) {

        if (n == nums[j]) {
          if ((j - i + 1) <= k) {
            return true;
          } else {
            break;
          }
        }

      }

    }

    return false;

  }

  public static void main(String args[]) {

    int[] nums = new int[] {};
    int k = 3;
    Problem219 p = new Problem219();
    System.out.println(p.containsNearbyDuplicate(nums, k));

    nums = new int[] {1, 2, 3, 45, 71, 3, 3, 3, 32, 3, 2};
    System.out.println(p.containsNearbyDuplicate(nums, k));

  }

}
