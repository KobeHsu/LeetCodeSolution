package algorithms;

import java.util.ArrayList;
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
      return null;
    }

    List<Integer> lastRow = new ArrayList<Integer>();

    for (int i = 1; i <= numRows; i++) {

      int middle = (i % 2 == 0) ? (i / 2) : (i / 2 + 1);

      List<Integer> row = new ArrayList<Integer>(i);

      for (int j = 0; j < middle; j++) {

        int n = 1;
        if (i > 2 && j > 0) {
          n = lastRow.get(j - 1) + lastRow.get(j);
        }

        row.add(n);
      }

      result.add(row);
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
