package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pascal's Triangle
 *
 * @author kobe
 *
 */
public class Problem118 {

  public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (numRows <= 0) {
      return result;
    }

    Integer[] lastRow = null;

    for (int i = 1; i <= numRows; i++) {

      int middle = (i % 2 == 0) ? (i / 2) : (i / 2 + 1);

      Integer[] row = new Integer[i];
      for (int j = 0, k = i - 1; j < middle; j++, k--) {

        int n = 1;
        if (i > 2 && j > 0) {
          n = lastRow[j - 1] + lastRow[j];
        }

        row[j] = n;
        row[k] = n;
      }

      List<Integer> r = Arrays.asList(row);
      result.add(r);
      lastRow = row;

    }

    return result;
  }

  public static void main(String args[]) {

    Problem118 p = new Problem118();

    long start = System.currentTimeMillis();
    List<List<Integer>> pascal = p.generate(5);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    for (List<Integer> row : pascal) {
      System.out.println(row.toString());
    }
    System.out.println(Math.round(3 / 2));
  }
}
