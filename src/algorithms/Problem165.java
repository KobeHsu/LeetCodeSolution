package algorithms;

/**
 * Compare Version Numbers
 *
 * @author kobe
 *
 */
public class Problem165 {

  public int compareVersion(String version1, String version2) {

    int compare = 0;
    if (version1.equals(version2)) {
      return 0;
    }

    String[] v1Seq = version1.split("\\.");
    String[] v2Seq = version2.split("\\.");

    int len = Math.max(v1Seq.length, v2Seq.length);

    for (int i = 0; i < len; i++) {

      int v1 = (i < v1Seq.length) ? Integer.parseInt(v1Seq[i], 10) : 0;
      int v2 = (i < v2Seq.length) ? Integer.parseInt(v2Seq[i], 10) : 0;

      if (v1 > v2) {
        return 1;
      } else if (v1 < v2) {
        return -1;
      }

    }

    return compare;

  }

  public static void main(String args[]) {

    Problem165 p = new Problem165();

    long start = System.currentTimeMillis();
    System.out.println(p.compareVersion("1.0.1", "1"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
