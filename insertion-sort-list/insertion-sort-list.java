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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode newHead = new ListNode(list.get(0));
        ListNode curr = newHead;
        if (list.size() > 1) {
            for(int i=1; i< list.size(); i++) {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
        }
        return newHead;
    }
}