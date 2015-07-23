package algorithms;

/**
 * Remove Duplicates from Sorted List
 *
 * @author kobe
 *
 */
public class Problem083 {

  public ListNode deleteDuplicates(ListNode head) {

    ListNode node = head;
    int val;

    while (node != null) {

      val = node.val;
      ListNode next = node.next;
      while (next != null && next.val == val) {
        next = next.next;
      }

      node.next = next;
      node = node.next;

    }

    return head;

  }

  public static void main(String args[]) {

    Problem083 p = new Problem083();
    ListNode head = new ListNode(0);
    ListNode node = head;
    node.next = new ListNode(1);
    node = node.next;
    node.next = new ListNode(1);
    node = node.next;
    node.next = new ListNode(3);
    node = node.next;
    node.next = new ListNode(5);
    node = node.next;
    node.next = new ListNode(5);

    long start = System.currentTimeMillis();
    p.deleteDuplicates(head);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    node = head;
    while (node != null) {
      System.out.format("%d->", node.val);
      node = node.next;
    }

  }
}
