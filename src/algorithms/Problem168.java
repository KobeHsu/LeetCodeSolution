package algorithms;

/**
 * Excel Sheet Column Title
 *
 * @author kobe
 *
 */
public class Problem168 {

  public String convertToTitle(int n) {

    if (n <= 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder();


    while (n > 0) {

      n--;
      int c = (n % 26) + 65;
      sb.append((char) c);

      n /= 26;

    }

    return sb.reverse().toString();

  }

  public static void main(String args[]) {

    Problem168 p = new Problem168();

    long start = System.currentTimeMillis();
    System.out.println(p.convertToTitle(1));
    System.out.println(p.convertToTitle(26));
    System.out.println(p.convertToTitle(28));
    System.out.println(p.convertToTitle(52));
    System.out.println(p.convertToTitle(53));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
