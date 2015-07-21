package algorithms;

/**
 * Excel Sheet Column Number
 *
 * @author kobe
 *
 */
public class Problem171 {

  public int titleToNumber(String s) {

    if (s == null || s.length() == 0) {
      return 0;
    }

    final int LETTERS_COUNT = 26;
    int total = 0;
    char[] chrAry = s.toCharArray();
    int len = chrAry.length;

    for (int i = 0; i < len; i++) {

      int n = (int) ((chrAry[len - 1 - i] - 64) * Math.pow(LETTERS_COUNT, i));
      total += n;
    }

    return total;

  }

  public static void main(String args[]) {

    Problem171 p = new Problem171();

    long start = System.currentTimeMillis();
    System.out.println(p.titleToNumber("A"));
    System.out.println(p.titleToNumber("AA"));
    System.out.println(p.titleToNumber("AZ"));
    System.out.println(p.titleToNumber("AAA"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
