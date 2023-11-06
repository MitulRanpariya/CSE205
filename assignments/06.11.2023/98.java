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
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean isvalid(TreeNode root,long min,long max){
        if(root==null)return true;
        if(root.val<=min||root.val>=max)return false;
        return isvalid(root.left,min,root.val)&&isvalid(root.right,root.val,max);
    }
}