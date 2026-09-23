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
    public int minDepth(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minSoFar = Integer.MAX_VALUE;
        if (root.left != null) {
            minSoFar = Math.min(dfs(root.left), minSoFar);
        }
        if (root.right != null) {
            minSoFar = Math.min(dfs(root.right), minSoFar);
        }
        return minSoFar+1;
    }
}