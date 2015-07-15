package algorithms;

/**
 * Delete Node in a Linked List
 *
 * @author kobe
 *
 */
public class Problem237 {

  public void deleteNode(ListNode node) {

    if (node.next!=null) {
      node.val = node.next.val;
      node.next = node.next.next;
    }
    
  }

  public static void main(String args[]) {

    Problem237 p = new Problem237();

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    node1.next = node2;
    ListNode node3 = new ListNode(3);
    node2.next = node3;
    ListNode node4 = new ListNode(4);
    node3.next = node4;


    long start = System.currentTimeMillis();
    p.deleteNode(node3);    
    long end = System.currentTimeMillis();   
    System.out.println(end - start + "ms");
    
    ListNode node = node1;
    while (node!=null) {
      System.out.println(node.val);
      node = node.next;
    }

  }
}
