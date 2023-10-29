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
    public boolean isSymmetric(TreeNode root) {
        List<Integer> l = new ArrayList();
        List<Integer> list = new ArrayList();
        int left = height(root.left);
        int right = height(root.right);
        if(left!=right){
            return false;
        }
        preorder(root.left,l);
        right(root.right,list);
        boolean flag = false;
        int size = 0;
        while(size!=list.size()-1||size!=l.size()-1){
              if(l.get(size)!=list.get(size)){
                 return false;
              }
              size++;
        }
           return true;
    }
    static void preorder(TreeNode root,List<Integer>l){
            if(root==null) {
            l.add(101);
            return;
        }
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
    }
     static void right(TreeNode root,List<Integer>l){
        if(root==null) {
            l.add(101);
            return;
        }
        l.add(root.val);
       right(root.right,l);
       right(root.left,l);
    }
    static int height(TreeNode root){
        if(root==null)return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
}