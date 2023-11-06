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
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        pre(root);
        while(k-->1){
            pq.poll();

        }
        int num = pq.peek();
        return num;
    }
    void pre (TreeNode root){
        if(root==null)return ;
        pq.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}