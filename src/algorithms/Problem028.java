package algorithms;

/**
 * Implement strStr()
 *
 * @author kobe
 *
 */
public class Problem028 {

  public int strStr(String haystack, String needle) {

    int result = -1;

    if (haystack == null || needle == null) {
      return -1;
    }

    if (needle.length() == 0) {
      return 0;
    }

    if (haystack.length() == 0) {
      return -1;
    }

    int limit = haystack.length() - needle.length() + 1;
    int len = needle.length();

    char[] str = haystack.toCharArray();
    char[] match = needle.toCharArray();

    for (int i = 0; i < limit; i++) {

      if (str[i] == match[0]) {

        boolean found = true;
        for (int j = 1; j < len; j++) {
          if (str[i + j] != match[j]) {
            found = false;
            break;
          }
        }

        if (found) {
          return i;
        }

      }

    }

    return result;

  }


  public static void main(String args[]) {

    Problem028 p = new Problem028();

    long start = System.currentTimeMillis();
    System.out.println(p.strStr("asadawqrggfasdad", "asd"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
