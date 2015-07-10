package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Summary Ranges
 *
 * @author kobe
 *
 */
public class Problem228 {

  public List<String> summaryRanges(int[] nums) {

    List<String> result = new ArrayList<String>();

    if (nums.length == 0) {
      return result;
    }

    if (nums.length == 1) {
      result.add(Integer.toString(nums[0]));
      return result;
    }

    int range = nums[0];

    for (int i = 1; i < nums.length; i++) {

      int curr = nums[i];
      int last = nums[i - 1];

      if (curr != (last + 1)) {

        if (range == last) {
          result.add(Integer.toString(range));
        } else {
          result.add(range + "->" + last);
        }

        range = curr;

        if (i == nums.length - 1) {
          result.add(Integer.toString(curr));
        }

      } else if (i == nums.length - 1) {

        if (range == curr) {
          result.add(Integer.toString(curr));
        } else {
          result.add(range + "->" + curr);
        }

      }

    }

    return result;

  }

  public static void main(String args[]) {

    Problem228 p = new Problem228();

    // int[] nums = new int[] {0, 1, 2, 4, 5, 7};
    int[] nums = new int[] {0, 1, 2};

    long start = System.currentTimeMillis();
    System.out.println(p.summaryRanges(nums));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
