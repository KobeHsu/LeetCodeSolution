package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Integer
 *
 * @author kobe
 *
 */
public class Problem13 {

  public int romanToInt(String s) {

    Map<Character, Integer> roman = new HashMap<Character, Integer>();
    roman.put('I', 1);
    roman.put('V', 5);
    roman.put('X', 10);
    roman.put('L', 50);
    roman.put('C', 100);
    roman.put('D', 500);
    roman.put('M', 1000);

    char[] chrAry = s.toCharArray();
    int len = chrAry.length;
    int num = 0;

    for (int i = 0; i < len; i++) {

      int n = 0;
      char c = chrAry[i];

      if (i != len - 1) {

        if ((c == 'I' && (chrAry[i + 1] == 'V' || chrAry[i + 1] == 'X'))
            || (c == 'X' && (chrAry[i + 1] == 'L' || chrAry[i + 1] == 'C'))
            || (c == 'C' && (chrAry[i + 1] == 'D' || chrAry[i + 1] == 'M'))) {

          n = roman.get(chrAry[i + 1]) - roman.get(c);
          i++;

        } else {
          n = roman.get(c);
        }

      } else {
        n = roman.get(c);
      }

      num += n;

    }

    return num;

  }

  public static void main(String args[]) {

    /**
     *
     * I 1 <br>
     * V 5<br>
     * X 10<br>
     * L 50<br>
     * C 100<br>
     * D 500<br>
     * M 1,000<br>
     * I placed before V or X indicates one less<br>
     * X placed before L or C indicates ten less<br>
     * C placed before D or M indicates a hundred less<br>
     *
     */

    Problem13 p = new Problem13();

    long start = System.currentTimeMillis();
    System.out.println(p.romanToInt("MCMLIV")); // 1954
    System.out.println(p.romanToInt("MCMXC")); // 1990
    System.out.println(p.romanToInt("MMXIV")); // 2014
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
