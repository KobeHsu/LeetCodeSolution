package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains Duplicate II
 *
 * @author kobe
 *
 */
public class Problem219 {

  public boolean containsNearbyDuplicate_(int[] nums, int k) {

    if (nums.length == 0) {
      return false;
    }

    Set<Integer> visited = new HashSet<Integer>();

    for (int i = 0; i < nums.length - 1; i++) {

      int length = 0;
      int n = nums[i];

      if (visited.add(n)) {


        for (int j = i + 1; j < nums.length; j++) {

          if (nums[j] == n) {
            length = j - i;
          }

          if (length > k) {
            break;
          }

        }

      }

      if (length > 0) {
        return true;
      }


    }

    return false;

  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {

    Set<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < nums.length; i++) {

//      System.out.format("i=%d, k=%d\n", i, k);
      if (!set.add(nums[i])) {
//        System.out.format("SET add: %d\n" , nums[i]);
        return true;
      }

      if (i >= k) {
        set.remove(nums[i - k]);
//        System.out.format("SET remove: %d\n" , nums[i - k]);
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
    System.out.println(p.containsNearbyDuplicate_(nums, k));

    nums = new int[30000];
    for (int i=0 ; i <30000; i++) {
      nums[i]=i;
    }
    long start = System.currentTimeMillis();
    System.out.println(p.containsNearbyDuplicate_(nums, k));
    long end = System.currentTimeMillis();
    System.out.println(end - start);

    start = System.currentTimeMillis();
    System.out.println(p.containsNearbyDuplicate(nums, k));
    end = System.currentTimeMillis();
    System.out.println(end - start);

  }

}
