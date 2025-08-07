// Last updated: 8/7/2025, 6:19:22 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        int cntNode = countNode(head);
        if (head == null || head.next == null) {
            return head;
        }
        for (int i = 0; i< k % cntNode; i++) {
            ListNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            ListNode newHead = curr.next;
            curr.next.next = head;
            curr.next = null;
            head = newHead;
        }
        
        return head;
    }
    
    private int countNode(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}