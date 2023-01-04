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
    ArrayList<Integer> s = new ArrayList<Integer>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1);
        int s1 = s.size();
        helper(root2);
        int s2 = s.size();
        if(s1*2 != s2)return false;
        
        
        int j= s1;
        for(int i=0;i<s1;i++){
            if(s.get(i)!=s.get(j++)){
                return false;
            }
        }return true;
    }
    void helper(TreeNode root){
        if(root!=null){
            helper(root.left);
            if(root.left==null&&root.right==null){
                s.add(root.val);
            }
            helper(root.right);
            if(root.left==null&&root.right==null){
                s.add(root.val);
            }
        }
    }
}