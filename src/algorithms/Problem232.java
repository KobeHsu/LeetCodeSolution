package algorithms;

import java.util.Stack;

/**
 * Implement Queue using Stacks
 *
 * @author kobe
 *
 */
public class Problem232 {

  private Stack<Integer> queue = new Stack<Integer>();
  private Stack<Integer> stack = new Stack<Integer>();

  // Push element x to the back of queue.
  public void push(int x) {

    while (!queue.isEmpty()) {
      stack.push(queue.pop());
    }

    queue.push(x);

    while (!stack.isEmpty()) {
      queue.push(stack.pop());
    }


  }

  // Removes the element from in front of queue.
  public void pop() {
    queue.pop();
  }

  // Get the front element.
  public int peek() {
    return queue.peek();
  }

  // Return whether the queue is empty.
  public boolean empty() {
    return queue.isEmpty();
  }

  public static void main(String args[]) {

    Problem232 p = new Problem232();
    p.push(1);
    p.push(2);
    p.push(3);

    System.out.println(p.peek());
    p.pop();
    System.out.println(p.peek());

    System.out.println(p.empty());

  }


}
