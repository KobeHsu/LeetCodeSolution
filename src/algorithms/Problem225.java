package algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement Queue using Stacks
 *
 * @author kobe
 *
 */
public class Problem225 {

  private Queue<Integer> stack = new LinkedList<Integer>();
  private Queue<Integer> queue = new LinkedList<Integer>();

  // Push element x onto stack.
  public void push(int x) {

    queue.clear();
    queue.add(x);

    while (!stack.isEmpty()) {
      queue.add(stack.poll());
    }

    while (!queue.isEmpty()) {
      stack.add(queue.poll());
    }

  }

  // Removes the element on top of the stack.
  public void pop() {
    stack.poll();
  }

  // Get the top element.
  public int top() {
    return stack.peek();
  }

  // Return whether the stack is empty.
  public boolean empty() {
    return stack.isEmpty();
  }

  public static void main(String args[]) {

    Problem225 p = new Problem225();
    p.push(1);
    p.push(2);
    p.push(3);
    p.push(4);
    p.push(5);

    System.out.println(p.top());
    p.pop();
    System.out.println(p.top());

    System.out.println(p.empty());

  }


}
