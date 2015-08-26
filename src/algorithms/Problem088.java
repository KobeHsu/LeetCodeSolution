package algorithms;

/**
 * Merge Sorted Array
 *
 * @author kobe
 *
 */
public class Problem088 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

  }

  public static void main(String args[]) {

    Problem088 p = new Problem088();

    long start = System.currentTimeMillis();
    int[] nums1 = new int[] {1, 2, 3, 7, 8, 10, 12};
    int m = 0;
    int[] nums2 = new int[] {4, 5, 6, 9, 11, 13};
    int n = 0;
    p.merge(nums1, m, nums2, n);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
