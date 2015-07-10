package algorithms;

/**
 * Remove Linked List Elements
 *
 * @author kobe
 *
 */
public class Problem203 {

  public ListNode removeElements(ListNode head, int val) {

    if (head == null) {
      return null;
    }

    ListNode last = null;
    ListNode node = head;

    while (node != null) {

      if (node.val == val) {

        if (last == null) {
          head = node.next;
          node = head;
        } else {
          last.next = node.next;
          node = null;
          node = last.next;

        }

      } else {
        last = node;
        node = node.next;
      }

    }

    return head;

  }

  public static void main(String args[]) {

    Problem203 p = new Problem203();

    ListNode head = new ListNode(1);
    ListNode node = head;
    node.next = new ListNode(2);

    node = node.next;
    node.next = new ListNode(2);

    node = node.next;
    node.next = new ListNode(1);
    // ListNode node = head;
    // for (int i = 1; i < 10; i++) {
    // node.next = new ListNode(i);
    // node = node.next;
    // }

    long start = System.currentTimeMillis();
    ListNode root = p.removeElements(head, 2);
    while (root != null) {
      System.out.println(root.val);
      root = root.next;
    }
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
