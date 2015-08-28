package algorithms;

import java.util.Arrays;

/**
 * Merge Sorted Array
 *
 * @author kobe
 *
 */
public class Problem088 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int idxN1 = m - 1;
    int idxN2 = n - 1;
    int idx = m + n - 1;
    
    while(idxN1>=0 || idxN2>=0 ) {
      
      int n1 = (idxN1<0)? Integer.MIN_VALUE: nums1[idxN1];
      int n2 = (idxN2<0)? Integer.MIN_VALUE: nums2[idxN2];
      
      if (n2>n1) {
        nums1[idx--]=n2;
        idxN2--;
      } else {
        nums1[idx--]=n1;
        idxN1--;
      }
      
    }

  }

  public static void main(String args[]) {

    Problem088 p = new Problem088();

    long start = System.currentTimeMillis();
    int[] nums1 = new int[] {1, 2, 3, 7, 8, 10, 12, 0, 0, 0, 0, 0, 0};
    int m = 7;
    int[] nums2 = new int[] {4, 5, 6, 9, 11, 13};
    int n = nums2.length;
    p.merge(nums1, m, nums2, n);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    System.out.println(Arrays.toString(nums1));

  }
}
