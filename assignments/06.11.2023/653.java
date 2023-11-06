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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        Set<Integer> l = new HashSet<Integer>();
        Queue<TreeNode> q =new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                TreeNode t = q.poll();
                if(t==null)continue;
                if(l.contains(t.val))return true;
                else{
                    l.add(k-t.val);
                }
                q.add(t.left);
                q.add(t.right);
            }
        }
        return false;
    }
}