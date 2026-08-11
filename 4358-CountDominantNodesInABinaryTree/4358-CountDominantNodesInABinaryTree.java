// Last updated: 11/08/2026, 16:07:16
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
    int c;
    public int countDominantNodes(TreeNode root) {
        dfs (root);
        return c;
    }
    private int dfs(TreeNode node) {
        if (node == null){
            return Integer.MIN_VALUE;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        int max = Math.max(node.val, Math.max(left,right));

        if(node.val == max){
            c++;
        }
        return max;
    }
}