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
   int result=0;
    public void Diff(TreeNode root,int max,int min){
        if(root==null){
            return;
        }

      result=Math.max(result,Math.max(Math.abs(root.val-max),Math.abs(root.val-min)));
       max=Math.max(root.val,max);
       min=Math.min(root.val,min);
       Diff(root.left,max,min);
       Diff(root.right,max,min);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        Diff(root,root.val,root.val);
        Diff(root,root.val,root.val);
        return result;
    }
}