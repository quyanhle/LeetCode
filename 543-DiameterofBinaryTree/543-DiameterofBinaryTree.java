// Last updated: 8/13/2025, 3:30:10 PM
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

    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        max(root);
        return max-1;        
    }

    public int  max(TreeNode root) {
        if(root == null)
        {
            return 0;
        }

        System.out.println("process "+ root.val);
        var left = max(root.left);
        var right = max(root.right);

        var d1 =  Math.max(left, right) + 1;
        var d2 =  left + right + 1;

        if(max < d2)
        {
            max = d2;
        }

        System.out.println("process "+ root.val +"; d1:"+d1+" ; d2:"+d2);

        return d1;        
    }
}