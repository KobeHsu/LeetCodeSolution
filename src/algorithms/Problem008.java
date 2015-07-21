package algorithms;

/**
 * String to Integer (atoi)
 *
 * @author kobe
 *
 */
public class Problem008 {

  public int myAtoi(String str) {

    if (str == null || str.length() == 0) {
      return 0;
    }

    str = str.trim();

    int oriLen = str.length();
    int len = oriLen;
    char[] chr = str.toCharArray();

    int first = 0;
    boolean negtive = false;

    if (chr[0] == '-' || chr[0] == '+') {

      negtive = (chr[0] == '-');
      first = 1;

      if (len == 1) {
        return 0;
      }

      len--;
    }

    int i = 0;
    for (i = first; i < oriLen; i++) {

      int c = chr[i];
      if (c < 48 || c > 57) {
        break;
      }

    }

    long result = 0;
    long base = 1;

    for (int j = i - 1; j >= first; j--) {

      int c = chr[j] - 48;System.out.println(c+":"+base);
      result += (base * c);

      if (!negtive && result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      } else if (negtive && -result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      base *= 10;

    }

    if (negtive) {
      result = -result;
    }

    if (result > Integer.MAX_VALUE) {
      result = Integer.MAX_VALUE;
    } else if (result < Integer.MIN_VALUE) {
      result = Integer.MIN_VALUE;
    }

    return (int) result;

  }

  public static void main(String args[]) {

    Problem008 p = new Problem008();

    long start = System.currentTimeMillis();
    System.out.println(p.myAtoi("    10522545459"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
