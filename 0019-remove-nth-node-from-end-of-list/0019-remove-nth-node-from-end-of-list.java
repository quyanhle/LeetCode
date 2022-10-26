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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reversedList = reverse(head);
        int cnt = 1;
        ListNode pointer = reversedList;
        ListNode prev = reversedList;
        //remove node
        
        for (int i= 0; i< n; i++) {
            if (i==0 && n == 1) {
                reversedList = reversedList.next;
            } else {
                if (i == n-1) {
                    prev.next = pointer.next;
                } else {
                    prev = pointer;
                    pointer = pointer.next;
                }
            }
        }
        
        return reverse(reversedList);
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}