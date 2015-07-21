package algorithms;

/**
 * Remove Duplicates from Sorted Array
 *
 * @author kobe
 *
 */
public class Problem026 {

  public int removeDuplicates(int[] nums) {

    int len = nums.length;
    if (len < 2) {
      return len;
    }

    int c = 1;
    int n = nums[0];
    for (int i = 1; i < len; i++) {
      if (nums[i] != n) {
        c++;
        n = nums[i];
        nums[c - 1] = nums[i];
      }
    }

    return c;
  }

  public static void main(String args[]) {

    Problem026 p = new Problem026();

    int[] nums = new int[] {1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7};

    long start = System.currentTimeMillis();
    System.out.println(p.removeDuplicates(nums));
    for (int n : nums) {
      System.out.print(n + ",");
    }
    System.out.println();
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
