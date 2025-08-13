// Last updated: 8/13/2025, 12:35:54 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int res = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return res;
    }

    public void dfs(TreeNode node, int maxSoFar) {
       if (node.val >= maxSoFar) {
            res++;
       }
        if (node.left != null) {
            dfs(node.left, Math.max(maxSoFar, node.val));
        }
        if (node.right != null) {
            dfs(node.right, Math.max(maxSoFar, node.val));
        }
    }
}