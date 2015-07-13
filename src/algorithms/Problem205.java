package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Isomorphic Strings
 *
 * @author kobe
 *
 */
public class Problem205 {

  public boolean isIsomorphic(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    if (s.length() == 0) {
      return true;
    }

    Map<Integer, Integer> charMap = new HashMap<Integer, Integer>();
    Map<Integer, Integer> reverseMap = new HashMap<Integer, Integer>();

    char[] chrAryOfS = s.toCharArray();
    char[] chrAryOfT = t.toCharArray();

    for (int i = 0; i < chrAryOfS.length; i++) {

      int charOfS = chrAryOfS[i];
      int charOfT = chrAryOfT[i];

      if (charMap.get(charOfS) == null) {

        if (reverseMap.get(charOfT) != null && reverseMap.get(charOfT).intValue() != charOfS) {
          return false;
        }
        charMap.put(charOfS, charOfT);
        reverseMap.put(charOfT, charOfS);

      } else {

        if (charMap.get(charOfS).intValue() != charOfT) {
          return false;
        }

      }

    }

    return true;

  }

  public static void main(String args[]) {

    Problem205 p = new Problem205();

    long start = System.currentTimeMillis();
    System.out.println(p.isIsomorphic("egg", "add"));
    System.out.println(p.isIsomorphic("foo", "bar"));
    System.out.println(p.isIsomorphic("paper", "title"));
    System.out.println(p.isIsomorphic("ab", "aa"));
    System.out.println(p.isIsomorphic("ab", "ca"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
