/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //find middle positions
        if (head == null) {
            return false;
        }
        ListNode fast = head, mid = head, mid2 = null, newHead = null;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            mid = mid.next;
        }
        if (fast.next != null) {
            mid2 = mid.next;
        }
        //reverse from mid to last
        if (mid2 != null) {
            newHead = reverse(mid2);
        } else {
            newHead = reverse(mid);
        }
        while (newHead != null) {
            if (head.val != newHead.val) {
                return false;
            } else {
                head = head.next;
                newHead = newHead.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}