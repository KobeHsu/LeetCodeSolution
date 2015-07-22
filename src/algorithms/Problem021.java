package algorithms;

/**
 * Merge Two Sorted Lists
 *
 * @author kobe
 *
 */
public class Problem021 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode head = null;

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    boolean contiL1 = false;
    boolean contiL2 = false;

    if (l1.val > l2.val) {
      head = l2;
      contiL2 = true;
    } else {
      head = l1;
      contiL1 = true;
    }

    ListNode preL1 = null;
    ListNode preL2 = null;


    while (l1 != null && l2 != null) {

      if (l1.val <= l2.val) {

        if (!contiL1) {
          preL2.next = l1;
          contiL1 = true;
        }
        contiL2 = false;

        preL1 = l1;
        l1 = l1.next;

      } else {

        if (!contiL2) {
          preL1.next = l2;
          contiL2 = true;
        }
        contiL1 = false;

        preL2 = l2;
        l2 = l2.next;

      }

      if (l1 == null) {
        preL1.next = l2;
      }
      if (l2 == null) {
        preL2.next = l1;
      }

    }

    return head;

  }

  public ListNode mergeTwoLists_(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    if (l1.val <= l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }

  }

  public ListNode mergeTwoLists__(ListNode l1, ListNode l2) {

    ListNode head = new ListNode(0);
    ListNode temp = head;
    while (l1 != null || l2 != null) {
      if (l2 == null) {
        temp.next = l1;
        l1 = l1.next;
      } else if (l1 == null || l1.val > l2.val) {
        temp.next = l2;
        l2 = l2.next;
      } else {
        temp.next = l1;
        l1 = l1.next;
      }
      temp = temp.next;
    }
    return head.next;
  }

  public static void main(String args[]) {

    Problem021 p = new Problem021();

    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(3);
    l1.next.next = new ListNode(5);
    l1.next.next.next = new ListNode(7);
    l1.next.next.next.next = new ListNode(9);
    l1.next.next.next.next.next = new ListNode(13);

    ListNode l2 = new ListNode(2);
    l2.next = new ListNode(4);
    l2.next.next = new ListNode(6);
    l2.next.next.next = new ListNode(7);
    l2.next.next.next.next = new ListNode(10);
    l2.next.next.next.next.next = new ListNode(11);

    long start = System.currentTimeMillis();
    ListNode node = p.mergeTwoLists_(l1, l2);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

    while (node != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }

  }
}
