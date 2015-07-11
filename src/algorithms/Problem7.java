package algorithms;

/**
 * Reverse Integer
 *
 * @author kobe
 *
 */
public class Problem7 {

  public int reverse(int x) {

    long r = 0;

    StringBuilder sb = new StringBuilder();
    String s = Integer.toString(x);
    boolean neg = false;
    if (s.startsWith("-")) {
      s = s.substring(1);
      neg = true;
    }
    sb.append(s);
    s = sb.reverse().toString();
    r = Long.valueOf(s);
    if (neg) {
      r = -r;
    }

    if (r > Integer.MAX_VALUE || r <Integer.MIN_VALUE) {
      return 0;
    }

    return (int) r;
  }

  public static void main(String[] args) {

    Problem7 p = new Problem7();
    System.out.println(p.reverse(12345678));

  }


}
