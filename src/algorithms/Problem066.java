package algorithms;

/**
 * Plus One
 *
 * @author kobe
 *
 */
public class Problem066 {

  public int[] plusOne(int[] digits) {

    boolean reAlloc = false;
    boolean ceil = false;
    int len = digits.length;

    if (digits.length == 0) {
      return digits;
    }

    // +1
    if (digits[len - 1] == 9) {
      ceil = true;
      digits[len - 1] = 0;
      if (len == 1) {
        reAlloc = true;
      }
    } else {
      digits[len - 1]++;
      return digits;
    }

    if (ceil) {

      for (int i = len - 2; i >= 0; i--) {

        if (ceil) {

          if (digits[i] == 9) {
            digits[i] = 0;
            ceil = true;
            if (i == 0) {
              reAlloc = true;
            }
          } else {
            digits[i]++;
            ceil = false;
            break;
          }

        }

      }

    }

    if (reAlloc) {
      int[] result = new int[len + 1];
      result[0] = 1;
      for (int i = 0, j = 1; i < len; i++, j++) {
        result[j] = digits[i];
      }
      return result;
    }

    return digits;

  }

  public int[] plusOne_(int[] digits) {
    
    if (digits == null || digits.length == 0) {
      return new int[0];
    }

    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      } else {
        digits[i] = 0;
      }
    }

    int[] result = new int[digits.length + 1];
    result[0] = 1;

    return result;
    
  }

  public static void main(String args[]) {

    Problem066 p = new Problem066();
    int[] digits = new int[] {9, 9};

    long start = System.currentTimeMillis();
    int[] r = p.plusOne(digits);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    for (int d : r) {
      System.out.format("%d ", d);
    }

  }
}
