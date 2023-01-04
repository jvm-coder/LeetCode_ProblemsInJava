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
    private long totalSum=0;
    private long maxProduct=0;
    public int maxProduct(TreeNode root){
        dfs(root);
        calculateSubTreeSum(root);
        return (int)(maxProduct % ((int)Math.pow(10,9)+7));
    }
    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.left);
        dfs(root.right);
        totalSum+=(long)root.val;
    }
    public long calculateSubTreeSum(TreeNode root){
        if(root==null) return 0;
        long l=calculateSubTreeSum(root.left);
        long r=calculateSubTreeSum(root.right);
        long subtreesum=l+r+root.val;
        maxProduct=Math.max(maxProduct,(subtreesum)*(totalSum-subtreesum));
        return subtreesum;
    }
}