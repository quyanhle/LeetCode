// Last updated: 8/7/2025, 6:18:54 PM
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
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }
    
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        dfs(root.left);
        dfs(root.right);
    }
}