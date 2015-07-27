package algorithms;

/**
 * Count and Say
 *
 * @author kobe
 *
 */
public class Problem038 {

  public String countAndSay(int n) {

    String base = "1";

    for (int i = 1; i < n; i++) {

      StringBuilder sb = new StringBuilder();

      char[] chr = base.toCharArray();
      int accum = 0;
      char num = '0';

      for (char c : chr) {

        if (num == '0') {
          num = c;
          accum++;
          continue;
        }

        if (c == num) {
          accum++;
        } else {

          sb.append(accum);
          sb.append(num);

          num = c;
          accum = 1;

        }

      }

      sb.append(accum);
      sb.append(num);

      base = sb.toString();

    }

    return base;

  }

  public static void main(String args[]) {

    Problem038 p = new Problem038();

    long start = System.currentTimeMillis();
    System.out.println(p.countAndSay(1));
    System.out.println(p.countAndSay(2));
    System.out.println(p.countAndSay(3));
    System.out.println(p.countAndSay(4));
    System.out.println(p.countAndSay(5));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
