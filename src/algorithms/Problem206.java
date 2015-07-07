package algorithms;

import java.util.Stack;

/**
 * Reverse Linked List
 *
 * @author kobe
 *
 */
public class Problem206 {

  public ListNode reverseList_stack(ListNode head) {

    Stack<Integer> stack = new Stack<Integer>();

    ListNode listNode = head;
    while (listNode != null) {
      stack.push(listNode.val);
      listNode = listNode.next;
    }

    if (!stack.isEmpty()) {
      head = new ListNode(stack.pop());
      listNode = head;
    }

    while (!stack.isEmpty()) {
      listNode.next = new ListNode(stack.pop());
      listNode = listNode.next;
    }

    return head;
  }

  public ListNode reverseList(ListNode head) {

    if (head == null) {
      return null;
    }

    ListNode last = head;
    ListNode listNode = head.next;
    last.next = null;

    while (listNode != null) {

      ListNode tmp = listNode.next;
      listNode.next = last;

      last = listNode;
      listNode = tmp;

    }

    return last;
  }

  public static void main(String args[]) {

    Problem206 p = new Problem206();

    ListNode listNode = new ListNode(1);
    ListNode head = listNode;

    for (int i = 2; i < 10; i++) {
      listNode.next = new ListNode(i);
      listNode = listNode.next;
    }

    ListNode reverseListNode = p.reverseList(head);
    while (reverseListNode != null) {
      System.out.println(reverseListNode.val);
      reverseListNode = reverseListNode.next;
    }

  }


}
