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
    ArrayList<Integer> ls = new ArrayList<>();
    int max = 0;
    public void right(TreeNode root, int l) {
        if(root == null)    return;
        if(max < l) {
            ls.add(root.val);
            max = l;
        }
        right(root.right, l+1);
        right(root.left, l+1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        right(root, 1);
        return ls;
    }
}