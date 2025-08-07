// Last updated: 8/7/2025, 6:19:11 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sumSoFar = 0;
        return dfs(root, sumSoFar, targetSum);
    }
    
    private boolean dfs(TreeNode root, int sumSoFar, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null) {
            return (sumSoFar + root.val) == targetSum;
        }
        
        return dfs(root.right, sumSoFar + root.val, targetSum) || dfs(root.left, sumSoFar + root.val, targetSum);
        
    }
}