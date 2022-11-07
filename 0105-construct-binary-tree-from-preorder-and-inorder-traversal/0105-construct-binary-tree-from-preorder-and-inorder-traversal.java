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
import java.util.*;
class Solution {
    int rootPosPreOrder;
    HashMap<Integer, Integer> inorderRootPosMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        rootPosPreOrder = 0;
        inorderRootPosMap = new HashMap<>();
        
        for(int i=0; i < inorder.length; i++) {
            inorderRootPosMap.put(inorder[i], i);
        }
        
       return dfs(0, preorder.length-1, preorder);
        
    }
    
    public TreeNode dfs(int left, int right, int[] preorder) {
        if (left > right) {
            return null;
        }
 
        
        int rootPos = inorderRootPosMap.get(preorder[rootPosPreOrder]);
        int rootVal = preorder[rootPosPreOrder++];
        TreeNode root = new TreeNode(rootVal);
        root.left = dfs(left, rootPos-1, preorder);
        root.right = dfs(rootPos+1, right, preorder);
        return root;
    }
} 