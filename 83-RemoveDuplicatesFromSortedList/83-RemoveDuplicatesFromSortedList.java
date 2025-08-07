// Last updated: 8/7/2025, 6:19:20 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = head;
        while (head != null) {
            ListNode nextNode = head.next;
            while (nextNode != null && head.val == nextNode.val) {
                nextNode = nextNode.next;
            }
            head.next = nextNode;
            head = head.next;
        }
        return dummyHead;
    }
}