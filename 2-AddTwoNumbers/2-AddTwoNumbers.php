// Last updated: 8/6/2025, 11:45:36 PM
/**
 * Definition for a singly-linked list.
 * class ListNode {
 *     public $val = 0;
 *     public $next = null;
 *     function __construct($val = 0, $next = null) {
 *         $this->val = $val;
 *         $this->next = $next;
 *     }
 * }
 */
class Solution {

    /**
     * @param ListNode $l1
     * @param ListNode $l2
     * @return ListNode
     */
    function addTwoNumbers($l1, $l2) {
        $flag = false;
        $res = 0;

        $node = new ListNode();
        $dummy = new ListNode(0, $node);
        while ($l1 != null || $l2 != null) {
            $temp = 0;
            if ($l1 != null) {
                $temp += $l1->val;
                $l1 = $l1->next;
            }
            if ($l2 != null) {
                $temp += $l2->val;
                $l2 = $l2->next;
            }
            $node->val = $flag ? ($temp + 1)%10 : $temp%10;
            $flag = $flag ? ($temp+1>=10) : $temp >= 10;
            if ($l1 != null || $l2 != null) {
                $node->next = new ListNode();
                $node = $node->next;
            }
        }
        if ($flag) {
            $node->next = new ListNode(1);
        }
        return $dummy->next;
    }
}