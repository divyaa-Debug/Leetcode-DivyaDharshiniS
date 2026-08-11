// Last updated: 11/08/2026, 16:14:54
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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode cur=root;
        List<Integer> l=new ArrayList<>();
        while(cur!=null)
        {
            if(cur.left==null)
            {
                l.add(cur.val);
                cur=cur.right;
            }
            else{
                  TreeNode pre=cur.left;
                  while(pre.right!=null && pre.right!=cur)
                  {
                     pre=pre.right;
                  }
                  if(pre.right==null)
                  {
                    pre.right=cur;
                    cur=cur.left;
                  }
                  else{
                    pre.right=null;
                    l.add(cur.val);
                    cur=cur.right;
                  }
            }

        }
        return l;
    }
}