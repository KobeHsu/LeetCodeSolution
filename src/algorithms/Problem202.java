package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Happy Number
 *
 * @author kobe
 *
 */
public class Problem202 {

  public boolean isHappy(int n) {

    Set<Integer> sumSet = new HashSet<Integer>();

    int x = n;
    do {

      int sum = 0;
      while (x != 0) {

        int m = x % 10;
        sum += m * m;
        x /= 10;

      }

      if (sum == 1) {
        return true;
      }

      if (sumSet.contains(sum)) {
        break;
      }

      sumSet.add(sum);
      x = sum;


    } while (x != n);

    return false;

  }

  public static void main(String args[]) {

    Problem202 p = new Problem202();

    long start = System.currentTimeMillis();
    System.out.println(p.isHappy(19));
    System.out.println(p.isHappy(20));
    System.out.println(p.isHappy(12345));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
