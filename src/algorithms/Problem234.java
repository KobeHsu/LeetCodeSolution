package algorithms;

import java.util.Arrays;

/**
 * Palindrome Linked List
 *
 * @author kobe
 *
 */
public class Problem234 {

  public boolean isPalindrome(ListNode head) {

    if (head == null) {
      return true;
    }

    int[] nums = new int[10000];
    int len = 0;

    ListNode node = head;
    while (node != null) {

      if (len >= nums.length) {
        nums = Arrays.copyOf(nums, nums.length * 2);
      }

      nums[len++] = node.val;
      node = node.next;
    }

    for (int i = 0, j = len - 1; i < j; i++, j--) {

      if (nums[i] != nums[j]) {
        return false;
      }

    }

    return true;

  }

  public boolean isPalindrome_O1_Space(ListNode head) {
    if (head == null)
      return true;
    if (head.next == null)
      return true;
    ListNode fast = head;
    ListNode slow = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode partNode = slow.next;
    slow.next = null;
    ListNode newList = reverse(partNode);
    ListNode pointer = head;
    while (newList != null) {
      if (pointer.val != newList.val)
        return false;
      pointer = pointer.next;
      newList = newList.next;
    }
    return true;
  }

  public ListNode reverse(ListNode head) {
    if (head == null)
      return head;
    if (head.next == null)
      return head;
    ListNode node = head.next;
    ListNode point = head;
    head.next = null;
    while (node != null) {
      ListNode temp = node.next;
      node.next = point;
      point = node;
      node = temp;
    }
    return point;
  }

  public static void main(String args[]) {

    Problem234 p = new Problem234();

    long start = System.currentTimeMillis();
    ListNode head = new ListNode(0);

    System.out.println(p.isPalindrome(head));
    long end = System.currentTimeMillis();
    System.out.println(end - start + "ms");

  }

}
