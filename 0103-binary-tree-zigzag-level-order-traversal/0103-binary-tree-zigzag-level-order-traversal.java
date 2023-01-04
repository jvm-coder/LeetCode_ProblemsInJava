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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null)    return ls;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        boolean flag = true;
        
        while(! qu.isEmpty()) {
            int len = qu.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while(len-- > 0) {
                TreeNode curr = qu.poll();
                temp.add(curr.val);
                if(curr.left != null)   qu.offer(curr.left);
                if(curr.right != null)  qu.offer(curr.right);
            }
                
            if(! flag)  Collections.reverse(temp);

            ls.add(temp);

            flag = ! flag;
        }
        return ls;
    }
}