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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode newHead = head;
        while (head != null) {
            if (head.val == val) {
                if (newHead == head) {
                    newHead = head.next;
                }
                head = head.next;
                prev.next = head;
            } else {
                head = head.next;
                prev = prev.next;
            }
        }
        return newHead;
    }
}