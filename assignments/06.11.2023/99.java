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
    TreeNode first;
    TreeNode middle;
    TreeNode last;
    TreeNode prev;

    public void recoverTree(TreeNode root) {
        first = last =middle= null;
        prev = new TreeNode(Integer.MIN_VALUE);
        ino(root);
        if(first!=null&&last!=null){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        if(last==null){
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
    void ino(TreeNode root){
        if(root==null)return;
        ino(root.left);
        if(prev!=null&&root.val<prev.val){
            if(first==null){
                first = prev;
                middle = root;

            }
            else{
                last =root;
            }
        }
        prev = root;
        ino(root.right);

    }
}