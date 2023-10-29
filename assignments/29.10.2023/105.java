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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp = new HashMap();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root = build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    static TreeNode build(int[]preorder,int pstrt,int pend,int[]inorder,int instrt,int inend,Map<Integer,Integer> inmap){
        if(pstrt>pend||instrt>inend)return null;
        TreeNode root = new TreeNode(preorder[pstrt]);
        int inroot = inmap.get(root.val);
        int numsleft = inroot-instrt;
        root.left = build(preorder,pstrt+1,pstrt+numsleft,inorder,instrt,inroot-1,inmap);
        root.right = build(preorder,pstrt+numsleft+1,pend,inorder,inroot+1,inend,inmap);
        return root;
    }
}