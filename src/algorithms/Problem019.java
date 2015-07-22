package algorithms;

/**
 * Remove Nth Node From End of List
 *
 * @author kobe
 *
 */
public class Problem019 {

  public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode node = head;
    ListNode back = head;

    while (node != null) {
      node=node.next;
      if (n<0) {back=back.next;}
      n--;
    }

    if (n==0) {
      return head.next;
    }

    back.next=back.next.next;

    return head;

  }

  public static void main(String args[]) {

    Problem019 p = new Problem019();

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    long start = System.currentTimeMillis();
    ListNode node = p.removeNthFromEnd(head, 5);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }

  }
}
