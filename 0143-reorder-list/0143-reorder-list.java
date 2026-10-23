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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = reverse(mid);
        while (right.next != null) {
            ListNode nextLeft = left.next;
            ListNode nextRight = right.next;
            left.next = right;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        }
        if (left != right) {
            left.next = right;
        }
    }

    private ListNode findMid(ListNode head) {
        ListNode mid = head;
        ListNode right = head;
        while (right != null && right.next != null) {
            mid = mid.next;
            right = right.next;
            if (right.next != null) {
                right = right.next;
            }
        }
        return mid;
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