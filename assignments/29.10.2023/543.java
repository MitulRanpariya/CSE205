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
 int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
              if(root==null)return 0;
              height(root);
        return ans;
    }
     int height(TreeNode root){
        if(root==null)return -1;
       int left = height(root.left);
       int right = height(root.right);
       ans = Math.max(ans,left+right+2);
       return Math.max(left,right)+1;
    }
   
}