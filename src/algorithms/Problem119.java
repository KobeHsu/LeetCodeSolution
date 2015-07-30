package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pascal's Triangle II
 *
 * @author kobe
 *
 */
public class Problem119 {

  public List<Integer> getRow_(int rowIndex) {

    List<Integer> row = new ArrayList<Integer>();
    if (rowIndex < 0) {
      return row;
    }

    if (rowIndex == 0) {
      row.add(1);
      return row;
    }

    double[] fac = new double[rowIndex];

    // factorial
    fac[0] = 1;
    for (int i = 1; i < rowIndex; i++) {
      fac[i] = (i + 1) * fac[i - 1];
    }

    int len = fac.length;

    rowIndex++;
    boolean even = (rowIndex % 2 == 0);
    int middle = even ? (rowIndex / 2) : (rowIndex / 2 + 1);

    for (int j = 0; j < middle; j++) {

      int n = 1;
      if (rowIndex > 2 && j > 0) {
        n = (int) (fac[len - 1] / fac[j - 1] / fac[len - j - 1]);
      }

      row.add(n);

    }

    for (int j = 0; j < middle; j++) {

      if (j == 0 && !even) {
        continue;
      }

      row.add(row.get(middle - j - 1));

    }

    return row;

  }

  public List<Integer> getRow(int rowIndex) {

    List<Integer> result = new ArrayList<Integer>();

    if (rowIndex < 0) {
      return result;
    }

    rowIndex++;
    Integer[] row = new Integer[rowIndex];

    int tmp = 1;
    for (int i = 1; i <= rowIndex; i++) {

      row[0] = 1;
      for (int j = 1; j < i - 1; j++) {

        int n = 1;

        if (j > 0 && j < i - 1) {

          if (i > 2) {
            n = tmp + row[j];
          }
          tmp = row[j];

        }

        row[j] = n;
      }

      if (i > 0) {
        row[i - 1] = 1;
      }

    }

    result = Arrays.asList(row);

    return result;
  }

  public static void main(String args[]) {

    Problem119 p = new Problem119();

    long start = System.currentTimeMillis();
    List<Integer> pascal = p.getRow(17);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    System.out.println(pascal.toString());

  }

}
