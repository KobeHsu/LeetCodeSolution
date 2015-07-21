package algorithms;

/**
 * Search for a Range
 *
 * @author kobe
 *
 */
public class Problem034 {

    public static void main(String[] args) {

        Problem034 p = new Problem034();
        int[] nums = new int[] { 1 };
        // new int[] { 1, 1, 1, 1, 2, 2, 4, 4, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9,
        // 9, 10, 11, 12 } 12;
        // {1,2,2}, 2
        // [1], 0
        // [1,2,3], 3
        // [1,3], 1
        // [2,2], 2
        int[] output = p.searchRange(nums, 0);

        System.out.println(output[0] + "," + output[1]);

    }

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[] { -1, -1 };

        if (nums == null || nums.length == 0) {
            return result;
        }

        int len = nums.length;
        int start = 0;
        int end = len - 1;

        while (start <= end) {

            int half = (end - start) / 2 + start;
            int n = nums[half];
            // System.out.format("start: %d, end: %d, half: %d, num: %d \n",
            // start, end, half, n);
            if (n == target) {

                int i = 1;
                result[0] = half;
                result[1] = half;

                while ((half - i) >= 0 && nums[half - i] == target) {
                    result[0]--;
                    i++;
                }

                i = 1;
                while ((half + i) < len && nums[half + i] == target) {
                    result[1]++;
                    i++;
                }

                break;

            } else if (end - start <= 1) {
                // System.out.format("startN: %d, endN:%d, target: %d \n",
                // nums[start], nums[end],
                // target);
                if (nums[start] == target) {
                    half = start;
                } else if (nums[end] == target) {
                    half = end;
                } else {
                    break;
                }

                int i = 1;
                result[0] = half;
                result[1] = half;

                while ((half - i) >= 0 && nums[half - i] == target) {
                    result[0]--;
                    i++;
                }

                i = 1;
                while ((half + i) < len && nums[half + i] == target) {
                    result[1]++;
                    i++;
                }

                break;

            } else if (n < target) {
                start = half;

            } else if (n > target) {
                end = half;
            }

        }

        return result;

    }

}
