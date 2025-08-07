// Last updated: 8/7/2025, 6:19:18 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return head;
        }
        
        ListNode prev = null, curr = head;
        for (int i = 1; i< left; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode start = prev, end = curr;
        ListNode third = null;
        while ((right-left) >= 0) {
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }
        
        if (start != null) {
            start.next = prev;
        } else {
            head = prev;
        }
        
        end.next = curr;
        return head;
    }
}