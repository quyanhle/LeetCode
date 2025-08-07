// Last updated: 8/7/2025, 6:19:17 PM
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
    public List<TreeNode> generateTrees(int n) {
        return dfs(1,n);
    }
    
    public List<TreeNode> dfs(int left, int right) {
        List<TreeNode> ans = new ArrayList<>();
        if (left > right) {
            ans.add(null);
            return ans;
        }
        
        for (int i=left; i<= right; i++) {
            List<TreeNode> leftSubTree = dfs(left, i-1);
            List<TreeNode> rightSubTree = dfs(i+1, right);
            for (int j=0; j<leftSubTree.size(); j++) {
                for (int k=0; k<rightSubTree.size(); k++) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubTree.get(j);
                    root.right = rightSubTree.get(k);
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}