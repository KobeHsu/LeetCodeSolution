package algorithms;

/**
 * Intersection of Two Linked Lists
 *
 * @author kobe
 *
 */
public class Problem160 {


  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null || headB == null) {
      return null;
    }

    ListNode idxA = headA;
    ListNode idxB = headB;

    int lenA = 0;
    int lenB = 0;

    while (idxA != null) {
      lenA++;
      idxA = idxA.next;
    }

    while (idxB != null) {
      lenB++;
      idxB = idxB.next;
    }

    idxA = headA;
    idxB = headB;

    int d = Math.abs(lenA - lenB);

    if (lenA > lenB) {
      while (d > 0) {
        idxA = idxA.next;
        d--;
      }
    } else if (lenA < lenB) {
      while (d > 0) {
        idxB = idxB.next;
        d--;
      }
    }

    while (idxA != idxB && idxA != null) {
      idxA = idxA.next;
      idxB = idxB.next;
    }

    return idxA;
  }

  public static void main(String args[]) {

    Problem160 p = new Problem160();

    ListNode headA = new ListNode(1);
    headA.next = new ListNode(2);
    ListNode interSection = new ListNode(3);
    headA.next.next = interSection;
    interSection.next = new ListNode(4);

    ListNode headB = new ListNode(5);
    headB.next = new ListNode(6);
    headB.next.next = interSection;

    long start = System.currentTimeMillis();
    System.out.println(p.getIntersectionNode(null, headB));
    System.out.println(p.getIntersectionNode(headA, headB).val);
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }
}
