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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)    return ls;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            ls.add(curr.val);
            
            if(curr.right != null)
                st.push(curr.right);
            
            if(curr.left != null)
                st.push(curr.left);
        }
        return ls;
    }
}