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
    List<String> res = new ArrayList();
    StringBuilder sb = new StringBuilder("");
    public void helper(TreeNode root) {
        if(sb.length() > 0) sb.append("->");
        sb.append(root.val);
        if(root.left == null && root.right == null) res.add(sb.toString());
        
        if(root.left != null)   helper(root.left);
        if(root.right != null)  helper(root.right);
        
        for(int i=sb.length()-1; i>0; i--)
            if(sb.charAt(i) == '>') {
                sb.replace(i-1, sb.length(), "");
                break;
            }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root);
        return res;
    }
}