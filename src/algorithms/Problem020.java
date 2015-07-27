package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Valid Parentheses
 *
 * @author kobe
 *
 */
public class Problem020 {

  public boolean isValid_(String s) {


    if (s == null || s.length() == 0) {
      return true;
    }

    final String LEFT_BRACKETS = "({[";
    final String RIGHT_BRACKETS = ")}]";

    // (:0, {:1, [:2
    List<List<Integer>> loc = new ArrayList<List<Integer>>();
    loc.add(new ArrayList<Integer>());
    loc.add(new ArrayList<Integer>());
    loc.add(new ArrayList<Integer>());

    char[] chr = s.toCharArray();
    int len = s.length();

    for (int i = 0; i < len; i++) {

      int lIdx = LEFT_BRACKETS.indexOf(chr[i]);
      int rIdx = RIGHT_BRACKETS.indexOf(chr[i]);

      if (lIdx != -1) {

        loc.get(lIdx).add(i);

      } else if (rIdx != -1) {

        int end = loc.get(rIdx).size() - 1;
        if (end < 0) {
          return false;
        }
        int closestLIdx = loc.get(rIdx).get(end);

        for (int j = 0; j < loc.size(); j++) {

          if (j == rIdx) {
            continue;
          }

          List<Integer> tmploc = loc.get(j);
          for (int k = tmploc.size() - 1; k >= 0; k--) {
            if (tmploc.get(k) > closestLIdx && tmploc.get(k) < i) {
              return false;
            }
            if (tmploc.get(k) <= closestLIdx) {
              break;
            }

          }

        }

        loc.get(rIdx).remove(end);

      }


    }

    for (List<Integer> l : loc) {
      if (l.size() != 0) {
        return false;
      }
    }

    return true;

  }

  public boolean isValid(String s) {

    char[] arr = s.toCharArray();
    Stack<Character> stack = new Stack<Character>();

    for (char ch : arr) {

      if (stack.isEmpty()) {
        stack.push(ch);
      } else {

        char top = (char) stack.lastElement();
        if (ch - top == 1 || ch - top == 2) {
          stack.pop();
        } else {
          stack.push(ch);
        }

      }
    }

    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }

  public static void main(String args[]) {

    Problem020 p = new Problem020();

    long start = System.currentTimeMillis();
    System.out.println(p.isValid("()"));
    System.out.println(p.isValid("()[]{}"));
    System.out.println(p.isValid("([)]"));
    System.out.println(p.isValid("()[]{})"));
    System.out.println(p.isValid("((()[]{})"));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
