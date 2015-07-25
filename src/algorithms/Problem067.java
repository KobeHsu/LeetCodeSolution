package algorithms;

/**
 * Add Binary
 *
 * @author kobe
 *
 */
public class Problem067 {

  public String addBinary_(String a, String b) {

    if (a == null || b == null) {
      return null;
    }

    int lenA = a.length();
    int lenB = b.length();

    if (lenA == 0 && lenB == 0) {
      return null;
    }

    if (lenA == 0) {
      return b;
    }

    if (lenB == 0) {
      return a;
    }

    int maxLen = Math.max(lenA, lenB);
    if (lenA < maxLen) {
      StringBuilder leftPadding = new StringBuilder();
      for (int i = 0; i < maxLen - lenA; i++) {
        leftPadding.append("0");
      }
      a = leftPadding.toString().concat(a);
    }

    if (lenB < maxLen) {
      StringBuilder leftPadding = new StringBuilder();
      for (int i = 0; i < maxLen - lenB; i++) {
        leftPadding.append("0");
      }
      b = leftPadding.toString().concat(b);
    }

    System.out.println(a);
    System.out.println(b);

    char[] charA = a.toCharArray();
    char[] charB = b.toCharArray();

    StringBuilder result = new StringBuilder();
    int carry = 0;

    for (int i = maxLen - 1; i >= 0; i--) {

      if (charA[i] == '1' && charB[i] == '1') {

        result.append(carry);
        carry = 1;

      } else if (charA[i] == '1' || charB[i] == '1') {

        if (carry == 1) {
          result.append("0");
          carry = 1;
        } else {
          result.append("1");
          carry = 0;
        }

      } else {
        result.append(carry);
        carry = 0;
      }

    }

    if (carry == 1) {
      result.append("1");
    }

    return result.reverse().toString();

  }

  public String addBinary(String a, String b) {

    if (a == null || b == null) {
      return null;
    }

    int lenA = a.length();
    int lenB = b.length();

    if (lenA == 0 && lenB == 0) {
      return null;
    }

    if (lenA == 0) {
      return b;
    }

    if (lenB == 0) {
      return a;
    }

    int maxLen = Math.max(lenA, lenB);
    if (lenA < maxLen) {
      StringBuilder leftPadding = new StringBuilder();
      for (int i = 0; i < maxLen - lenA; i++) {
        leftPadding.append("0");
      }
      a = leftPadding.toString().concat(a);
    }

    if (lenB < maxLen) {
      StringBuilder leftPadding = new StringBuilder();
      for (int i = 0; i < maxLen - lenB; i++) {
        leftPadding.append("0");
      }
      b = leftPadding.toString().concat(b);
    }

    char[] charA = a.toCharArray();
    char[] charB = b.toCharArray();

    StringBuilder result = new StringBuilder();
    int carry = 0;

    for (int i = maxLen - 1; i >= 0; i--) {

      int bitA = charA[i] - '0';
      int bitB = charB[i] - '0';
      int sum = bitA ^ bitB ^ carry; // or use mod 2

      result.append(sum);
      carry = (bitA & bitB) | (carry & (bitA ^ bitB));

    }

    if (carry == 1) {
      result.append("1");
    }

    return result.reverse().toString();

  }

  public static void main(String args[]) {

    Problem067 p = new Problem067();

    long start = System.currentTimeMillis();

    System.out.println(p.addBinary("0", "0"));
    System.out.println(p.addBinary("11", "1"));
    System.out
        .println(p
            .addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    System.out.println(p.addBinary("1010", "1011"));

    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    System.out.println(1 ^ 1 ^ 1);
  }
}
