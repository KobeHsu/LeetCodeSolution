package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Valid Parentheses
 *
 * @author kobe
 *
 */
public class Problem020 {

  public boolean isValid(String s) {

    final String P1_S = "{";
    final String P1_E = "}";

    List<Integer> p1Loc = new ArrayList<Integer>();

    return false;

  }

  public static void main(String args[]) {

    Problem020 p = new Problem020();

    long start = System.currentTimeMillis();
    System.out.println(p.isValid("()"));
    System.out.println(p.isValid("()[]{}"));
    System.out.println(p.isValid("([)]"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
